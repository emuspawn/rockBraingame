package com.emuspawn.rockBrain.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/18/13
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tile {
    int pos;
    int type = 0; //default type
    int occupied =0; //not occupied by default, of course.

    public Tile(int location, int type){
        this.pos = location;
        this.type = type;
    }
    public void setOpen(){
        occupied = 0;
    }
    public void setOccupied(){
        occupied = 1;
    }
    public int status(){
       return occupied;
    }
    public void create(int position, int type){
        this.pos = position;
        this.type = type;
    }
}

