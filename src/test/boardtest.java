package Board;

import org.junit.jupiter.api.Test;
class Board {

    @Test
    public void Boardnotnull() {
        Board Board = new Board();
        Board(Board() != null);
        System.out.println("nem ures a map");
    }
    @Test
    public void sucessAddBoard(){
        Board addBoard =new Board();
        Board(addBoard() == true);
        System.out.println("hajolerakas sikeres");
    }
}