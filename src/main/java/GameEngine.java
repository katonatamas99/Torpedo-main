import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameEngine {
    Player playerOne;
    Player playerTwo;
    BufferedReader reader;
    int x = 0;
    int y = 0;
    String direction;

    public GameEngine() throws IOException {
        initPlayerOne();
        initPlayerTwo();
        System.out.println("MINDEN HAJÓ KÉSZEN ÁLL, KEZDŐDJÖN A JÁTÉK!");
        startGame();
    }

    public void initPlayerOne() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Player 1 adja meg a nevét: ");
        this.playerOne = new Player(reader.readLine(),1);

        System.out.println(playerOne.getNickname()+" helyezze el az első hajóját!");
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            playerOne.board.addBoat(playerOne.oneBoxBoat=new OneBoxBoat(x, y, 1));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println("\n"+playerOne.getNickname()+" helyezze el a második hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(playerOne.twoBoxBoat = new TwoBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println("\n"+playerOne.getNickname()+" helyezze el a harmadik hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(playerOne.threeBoxBoat = new ThreeBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println("\n"+playerOne.getNickname()+" helyezze el a negyedik hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(playerOne.fourBoxBoat = new FourBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();

        System.out.println("\n"+playerOne.getNickname()+" helyezze el az ötödik hajóját!");
        x=0; y=0;
        while(!playerOne.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerOne.board.addBoat(playerOne.fiveBoxBoat = new FiveBoxBoat(x, y, 1, (direction.equals("v"))));
        }
        playerOne.board.setBoatAdded(false);
        playerOne.board.printBoard();
    }

    public void initPlayerTwo() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nPlayer 2 adja meg a nevét: ");
        this.playerTwo = new Player(reader.readLine(),2);

        System.out.println("\n"+playerTwo.getNickname()+" helyezze el az első hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            playerTwo.board.addBoat(playerTwo.oneBoxBoat = new OneBoxBoat(x, y, 2));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println("\n"+playerTwo.getNickname()+" helyezze el a második hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(playerTwo.twoBoxBoat = new TwoBoxBoat(x, y, 2, (direction.equals("v"))));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println("\n"+playerTwo.getNickname()+" helyezze el a harmadik hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(playerTwo.threeBoxBoat = new ThreeBoxBoat(x, y, 2, (direction.equals("v"))));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println("\n"+playerTwo.getNickname()+" helyezze el a negyedik hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(playerTwo.fourBoxBoat = new FourBoxBoat(x, y, 2, (direction.equals("v"))));
        }
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();

        System.out.println("\n"+playerTwo.getNickname()+" helyezze el az ötödik hajóját!");
        x=0; y=0;
        while(!playerTwo.board.getBoatAdded()) {
            System.out.print("x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Vertikálisan vagy horizontálisan? v/h :");
            direction = reader.readLine();
            playerTwo.board.addBoat(playerTwo.fiveBoxBoat = new FiveBoxBoat(x,y,2,(direction.equals("v"))));}
        playerTwo.board.setBoatAdded(false);
        playerTwo.board.printBoard();
    }

    public void startGame() throws IOException {
        boolean whoIsNext = true; //playerOne = true | playerTwo = false
        boolean playerOneWin = false;
        boolean playerTwoWin = false;
        reader = new BufferedReader(new InputStreamReader(System.in));

        while(playerOne.getIsAlive() && playerTwo.getIsAlive()){
            if(whoIsNext){ //player 1 következik
                System.out.println("\n"+playerOne.getNickname()+" következik!");
                System.out.println(playerOne.getNickname()+"Eddigi lövéseid:");
                playerOne.hitBoard.printBoard();
                System.out.println("\n\n"+playerOne.getNickname()+" Táblád:");
                playerOne.board.printBoard();
                System.out.println("\n"+playerOne.getNickname()+" TIPPLEJ!");
                x=0; y=0;
                do{

                System.out.print("x: ");
                x = Integer.parseInt(reader.readLine());
                System.out.print("y: ");
                y = Integer.parseInt(reader.readLine());
                }while (!playerOne.board.checkHitIndex(x,y));

                if(playerTwo.board.getPlace(x,y) == 2){ //player 1 találat
                    System.out.println("Találat!");
                    playerTwo.board.setHit(x,y);
                    playerOne.addHitPointToHitTable(x,y);
                    playerTwo.addPoint();
                }
                else if(playerTwo.board.getPlace(x,y) == 0){ //player 1 mellé lövés
                    System.out.println("Mellé lőttél!");
                    playerOne.addHitPointToHitTable(x,y);
                    playerTwo.board.setHit(x,y);
                }
                else{
                    System.out.println("Már lőttél ide!");
                    playerTwo.board.setHit(x,y);
                }

                //playerTwo.board.printBoard();
            }
            else{ //player 2 következik
                System.out.println("\n"+playerTwo.getNickname()+" következik!");
                System.out.println(playerTwo.getNickname()+"Eddigi lövéseid: ");
                playerTwo.hitBoard.printBoard();
                System.out.println("\n\n"+playerTwo.getNickname()+" Táblád:");
                playerOne.board.printBoard();
                System.out.println("\n"+playerTwo.getNickname()+" TIPPLEJ!");
                x=0; y=0;
                do {
                    System.out.print("x: ");
                    x = Integer.parseInt(reader.readLine());
                    System.out.print("y: ");
                    y = Integer.parseInt(reader.readLine());
                }while(!playerTwo.board.checkHitIndex(x,y));

                if(playerOne.board.getPlace(x,y) == 1){ //player 2 találat
                    System.out.println("Találat!");
                    playerOne.board.setHit(x,y);
                    playerTwo.addHitPointToHitTable(x,y);
                    playerTwo.addPoint();
                }
                else if(playerOne.board.getPlace(x,y) == 0){ //player 2 mellé lövés
                    System.out.println("Mellé lőttél!");
                    playerTwo.addHitPointToHitTable(x,y);
                    playerOne.board.setHit(x,y);
                }
                else {
                    System.out.println("Már lőttél ide!");
                    playerOne.board.setHit(x,y);

                }

            }

            whoIsNext = !whoIsNext;
            playerOneWin = playerOne.checkWin();
            playerTwoWin = playerTwo.checkWin();
        }
        if(playerOneWin){
            System.out.println(playerTwo.getNickname()+" NYERT! \n Pontjai: "+playerTwo.getPoint());
        }
        else if(playerTwoWin){
            System.out.println(playerOne.getNickname()+" NYERT! \n Pontjai: "+playerOne.getPoint());
        }
    }
}
