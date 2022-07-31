package tictactoe.player.moveStrategy.aiMove;

import tictactoe.game.Game;
import tictactoe.game.GameField;
import tictactoe.player.Move;
import tictactoe.player.MoveStrategy;

public class aiEasy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Making move level \"easy\"");
        GameField field = Game.getField();
        char currentPlayer = Game.getCurrentPlayer();
        Move move = Game.getRandomXAndYNotOccupied();
        field.set(move.x, move.y, currentPlayer);
    }
}