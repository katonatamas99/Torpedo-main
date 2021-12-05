package Board;

import org.junit.jupiter.api.Test;
class Board {

    @Test
    public void Boardnotnull() {
        Board gameBoard = new Board();
        Board(gameBoard() != null);
        System.out.println("nem ures a map");
    }
    @Test
    public void sucessAddBoat(){
        Board addBoat =new Board();
        Board(addBoat() == true);
        System.out.println("hajolerakas sikeres");
    }
}
