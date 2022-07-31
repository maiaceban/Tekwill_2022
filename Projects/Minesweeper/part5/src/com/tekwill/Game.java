package com.tekwill;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Stage 5/5: Battle!
 */
public class Game {
    private static final int SIZE = 9;
    private static final char HIDDEN = '.';
    private static final char FLAG = '*';
    private static final char EMPTY = '/';
    private static final char MINE = 'X';
    private static final Random RANDOM = new Random();
    private final char[][] fields = new char[SIZE][SIZE];
    private final Set<Coords> mines = new HashSet<>();
    private final Set<Coords> flags = new HashSet<>();

    public Game(int nrOfMines) {
        for (char[] chars : fields) {
            Arrays.fill(chars, HIDDEN);
        }
        generateMines(nrOfMines);
    }

    public boolean open(int i, int j) {
        Coords coords = new Coords(i, j);
        if (!isValid(coords)) {
            System.out.println("Is not valid");
            return false;
        }

        if (isMine(coords)) {
            showAllMines();
            return true;
        }

        int nrOfMines = getNrOfMinesAround(coords);

        if (nrOfMines == 0) {
            fields[coords.getI()][coords.getJ()] = EMPTY;
            for (int a = coords.getI() - 1; a <= coords.getI() + 1; a++) {
                for (int b = coords.getJ() - 1; b <= coords.getJ() + 1; b++) {
                    Coords ab = new Coords(a, b);
                    if (isValid(ab) && !isMine(ab) && isHidden(ab)) {
                        open(ab.getI(), ab.getJ());
                    }
                }
            }
        } else {
            fields[coords.getI()][coords.getJ()] = Character.forDigit(nrOfMines, 10);
        }
        return false;
    }

    private void showAllMines() {
        for (Coords mine : mines) {
            fields[mine.getI()][mine.getJ()] = MINE;
        }
    }

    private boolean isHidden(Coords coords) {
        return fields[coords.getI()][coords.getJ()] == HIDDEN;
    }

    private boolean isMine(Coords coords) {
        return mines.contains(coords);
    }

    public boolean findMine(int x, int y) {
        int i = x - 1;
        int j = y - 1;

        char field = fields[i][j];
        if (field == HIDDEN) {
            fields[i][j] = FLAG;
            flags.add(new Coords(i, j));
        } else if (field == FLAG) {
            fields[i][j] = HIDDEN;
            flags.remove(new Coords(i, j));
        } else {
            System.out.println("There is a number here!");
        }
        return flags.equals(mines);
    }

    private boolean isValid(Coords coords) {
        return coords.getI() >= 0 && coords.getI() < SIZE && coords.getJ() >= 0 && coords.getJ() < SIZE;
    }

    private int getNrOfMinesAround(Coords coords) {
        int nrOfMines = 0;
        for (int a = coords.getI() - 1; a <= coords.getI() + 1; a++) {
            for (int b = coords.getJ() - 1; b <= coords.getJ() + 1; b++) {
                Coords ab = new Coords(a, b);
                if (isValid(ab) && !coords.equals(ab) && isMine(ab)) {
                    nrOfMines++;
                }
            }
        }
        return nrOfMines;
    }

    private void generateMines(int nrOfMines) {
        //generating mines
        while (mines.size() < nrOfMines) {
            int i = RANDOM.nextInt(SIZE);
            int j = RANDOM.nextInt(SIZE);
            mines.add(new Coords(i, j));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" │123456789│")
                .append(System.lineSeparator())
                .append("—│—————————│")
                .append(System.lineSeparator());

        for (int i = 0, fieldsLength = fields.length; i < fieldsLength; i++) {
            char[] chars = fields[i];
            sb.append(i + 1).append("|");
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append("|").append(System.lineSeparator());
        }
        return sb.append("—│—————————│").toString();
    }

    public boolean putFlag(int i, int j) {
        Coords coords = new Coords(i, j);
        if (!isValid(coords)) {
            System.out.println("Is not valid");
            return false;
        }

        if (fields[i][j] == FLAG) {
            fields[i][j] = HIDDEN;
            flags.remove(coords);
        } else if (fields[i][j] == HIDDEN) {
            fields[i][j] = FLAG;
            flags.add(coords);
        }

        return flags.equals(mines);
    }
}