package com.tekwill;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String MINE = "mine";

    public static void main(String[] args) {
        System.out.print("How many mines do you want on the field? ");
        int nrOfMines = Integer.parseInt(SCANNER.nextLine().trim());

        Game game = new Game(nrOfMines);
        System.out.println(game);
        boolean finished = false;

        while (!finished) {
            System.out.print("Set/unset mines marks or claim a cell as free: ");
            String[] input = SCANNER.nextLine().trim().toLowerCase().split("\\s+");
            int y = Integer.parseInt(input[0]) - 1;
            int x = Integer.parseInt(input[1]) - 1;
            String action = input.length < 3 ? "free" : input[2];

            if (action.equals(MINE)) {
                finished = game.putFlag(x, y);
                if (finished) {
                    System.out.println("Congratulations! You found all mines!");
                }
                System.out.println(game);
            } else {
                finished = game.open(x, y);
                if (finished) {
                    System.out.println("You stepped on a mine and failed!");
                }
            }
        }
    }
}