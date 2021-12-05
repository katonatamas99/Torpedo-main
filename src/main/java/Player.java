public class Player {

    private final int id;
    private final String nickname;
    OneBoxBoat oneBoxBoat;
    TwoBoxBoat twoBoxBoat;
    ThreeBoxBoat threeBoxBoat;
    FourBoxBoat fourBoxBoat;
    FiveBoxBoat fiveBoxBoat;
    private boolean isAlive;
    private int point;
    Board board;
    Board hitBoard;
    public Player(String _nickname,int _id){
        this.nickname = _nickname;
        this.id= _id;
        this.isAlive = true;
        this.point = 0;
        board = new Board(_id, _nickname);
        hitBoard = new Board(_id,_nickname);
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public int getId() {
        return id;
    }
    public Boolean getIsAlive(){
        return isAlive;
    }
    public String getNickname() {
        return nickname;
    }

    public void addPoint() {
        this.point++;
    }

    public int getPoint() {
        return point;
    }

    public boolean checkWin(){
        int[][] tmpBoard = board.getBoard();
        int counter = 0;
        for(int i=0;i< tmpBoard.length;i++){
            for(int j=0;j<tmpBoard[i].length;j++){
                if(tmpBoard[i][j] == 1 || tmpBoard[i][j] == 2){
                    counter++;
                }
             }
        }
        if(counter == 0){
            setAlive(false);
            return true;
        }
        return false;
    }
    public void addHitPointToHitTable(int _x, int _y){
        hitBoard.getBoard()[_x-1][_y-1] = 8;
    }

}
