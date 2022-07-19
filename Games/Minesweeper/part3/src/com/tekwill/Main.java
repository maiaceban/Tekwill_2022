package com.tekwill;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many mines do you want on the field? ");
        int nrOfMines = SCANNER.nextInt();

        Game game = new Game(nrOfMines);
        System.out.println(game);
    }
}