public class OneBoxBoat extends Boats{

    public OneBoxBoat(int _x, int _y,int _whoOwn){
        this.setLength(1);
        this.addCoordinate(_x,_y);
        this.setWhoOwn(_whoOwn);

    }

}
