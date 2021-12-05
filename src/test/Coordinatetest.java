package Coordinate;

import org.junit.jupiter.api.Test;

class Coordinate{
    public Coordinate(int i, int i1) {

    }

    @Test
    void kordinatavizsgalat(){
       Coordinate kordinata=new Coordinate(5,5);
       assertEquals(5,kordinata.getX());
       assertEquals(5,kordinata.getY());
                                }
}