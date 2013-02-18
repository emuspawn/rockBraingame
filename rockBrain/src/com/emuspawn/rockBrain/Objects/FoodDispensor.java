package com.emuspawn.rockBrain.Objects;

import com.emuspawn.rockBrain.rockParts.Brain;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/18/13
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class FoodDispensor extends Object{

    int x = 0;
    int y = 0;
    Boolean functional = true;
    int quantity = 5;
    Food type = new Food();
    public FoodDispensor(){}
     public FoodDispensor(int quantity, Food foodtype){
         this.quantity = quantity;
         this.type = foodtype;
     }



    public class action{
        public Boolean checkFood(){

            if(functional && quantity>0){
                return true;
            }
            else{return false;}
        }
    public Food dispense(){
            quantity--;
            return type;
         }
    public void use(){
        if(checkFood()){
            dispense();
                    }
        else{System.out.println("Shit outta luck");}
    }
    }
}