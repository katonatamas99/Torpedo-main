package Board;

import org.junit.jupiter.api.Test;
class Board {

    @Test
    public void Boardnotnull() {
        Board gameBoard = new Board();
        Board(gameBoard() != null);
        System.out.println("nemures a map");
    }
    @Test
    public void sucessAddBoard(){
        Board addBoard =new Board();
        Board(addBoard()== true);
        System.out.println("hajolerakas sikeres");
    }
}