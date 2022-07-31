package com.tekwill;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Stage 3/5: Look around you
 */
public class Game {
    private static final int SIZE = 9;
    public static final char MINE = 'X';
    private static final char EMPTY = '.';
    private static final Random RANDOM = new Random();
    private final char[][] fields = new char[SIZE][SIZE];
    private final Set<String> mines = new HashSet<>();//["07", "11", ...]

    public Game(int nrOfMines) {
        for (char[] chars : fields) {
            Arrays.fill(chars, EMPTY);
        }
        generateMines(nrOfMines);
        showMinesAround();
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
            int i = RANDOM.nextInt(SIZE);// 0 - (SIZE-1)
            int j = RANDOM.nextInt(SIZE);
            String coords = coordsToString(i, j);
            mines.add(coords);
        }
        for (String mine : mines) {
            String[] split = mine.split("");
            int i = Integer.parseInt(split[0]);
            int j = Integer.parseInt(split[1]);
            fields[i][j] = MINE;
        }
    }

    private String coordsToString(int i, int j) {
        return String.valueOf(i) + j;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : fields) {
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}