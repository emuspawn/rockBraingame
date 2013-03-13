package com.emuspawn.rockBrain.rockParts;

import static com.badlogic.gdx.math.MathUtils.random;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 3/10/13
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Opinion {

    public int id = 0;
    public int lovehate = 0;
    public int strongFeel = 0;


    public void setLove() {
        this.lovehate = 10;
        System.out.println(10 + " love!");
        strongFeel = 1;
    }

    public void setHate() {
        this.lovehate = 1;
        System.out.println(1 + " hate");
        strongFeel = 2;
    }

    public void stats(int i) {
        this.lovehate = i;
        System.out.println(i + " neutral");
    }
   /*  public void opine(){
         Opinion[] g = this;
         Boolean love = true;
        Boolean hate = true;
        for(int i =0;i<=g.length;i++){
            Opinion o = g[i];
            double w = random()*10d;
            int q = (int)w;
            System.out.println(w);
            if(love && q>8){
                o.setLove();
                System.out.println("love!");
            }
            else if((hate && q<3) || q==1){
                o.setHate();
                System.out.println("hate!");
            }
            else {stats(q);}
        }
            }

               */

    public void oneOp() {
        Opinion o = this;
        Boolean love = true;
        Boolean hate = true;
        double w = random() * 10d;
        int q = (int) w;
        System.out.println(w);
        if (love && q > 8) {
            o.setLove();
            System.out.println("love!");
        } else if ((hate && q < 3) || q == 1) {
            o.setHate();
            System.out.println("hate!");
        } else {
            stats(q);
        }
    }

    public String getOpinion() {
        String opinion = "weather id:" + this.id + " lovehate: " + this.lovehate;
        return opinion;
    }
}
