package com.tekwill;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * Stage 4/5: Prepare for battle
 */
public class Game {
    private static final int SIZE = 9;
    private static final char EMPTY = '_';
    private static final char FLAG = '*';
    private static final Random RANDOM = new Random();
    private final char[][] fields = new char[SIZE][SIZE];
    private final Set<String> mines = new HashSet<>();
    private final Set<String> flags = new HashSet<>();

    public Game(int nrOfMines) {
        for (char[] chars : fields) {
            Arrays.fill(chars, EMPTY);
        }
        generateMines(nrOfMines);
        showMinesAround();
    }

    public boolean findMine(int x, int y) {
        int i = x - 1;
        int j = y - 1;
        if (i < 0 || i > SIZE - 1 || j < 0 || j > SIZE - 1) {
            throw new IllegalArgumentException();
        }

        char field = fields[i][j];
        if (field == EMPTY) {
            fields[i][j] = FLAG;
            flags.add(coordsToString(i, j));
        } else if (field == FLAG) {
            fields[i][j] = EMPTY;
            flags.remove(coordsToString(i, j));
        } else {
            System.out.println("There is a number here!");
        }
        return flags.equals(mines);
    }

    private void showMinesAround() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!mines.contains(coordsToString(i, j))) {
                    int nrOfMines = getNrOfMineAround(i, j);
                    if (nrOfMines != 0) {
                        fields[i][j] = Character.forDigit(nrOfMines, 10);
                    }
                }
            }
        }
    }

    private int getNrOfMineAround(int i, int j) {
        int nrOfMines = 0;
        for (int a = i - 1; a <= i + 1; a++) {
            for (int b = j - 1; b <= j + 1; b++) {
                if (a >= 0 && b >= 0 && a < SIZE && b < SIZE && !(a == i && b == j) && mines.contains(coordsToString(a, b))) {
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
            String coords = coordsToString(i, j);
            mines.add(coords);
        }
    }

    private String coordsToString(int i, int j) {
        return String.valueOf(i) + j;
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
}