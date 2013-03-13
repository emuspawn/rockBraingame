package com.emuspawn.rockBrain.rockParts;

import com.badlogic.gdx.utils.Json;

import static com.badlogic.gdx.math.MathUtils.random;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 2/21/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rock {
    int locX;
    int locY;
    int currentTask;
    public String[] thought = {"dial tone", "dial tone", "dial tone", "dial tone", "dial tone"};
    Body body = new Body();
    public Brain brain = new Brain();
    public Heart heart = new Heart();
    Boolean empty = true;
    public Opinion[] weather = new Opinion[9];
    Opinion dog = new Opinion();

    Opinion[] food;
    Opinion[] drink;
    int favColor;
    Opinion[] toy;
    Opinion[] hat;

    public void on() {
        if (heart.beat()) {
            body.bodyCycle();
            body.bodyEqualize();
            for (int i = 0; i < 5; i++) {
                thought[i] = brain.memory(i);
            }


        }
    }

    public void moveRock(int x, int y) {
        locX = x + locX;
        locY = y + locY;
    }

    public String getStats(int i) {
        String com = new String(this.body.organs[i].name + ": " + this.body.organs[i].stat);


        return com;
    }

    public void saveRock() {
        Json json = new Json();
        System.out.println(json.prettyPrint(this));
    }

    public void genesis() {
        opine(weather);
        //  System.out.println(getWeather());
        // weather[1] = new Opinion();
        //  weather[1].setLove();

    }

    public String getWeather() {
        String favWeather = "not yet";
        for (int i = 0; i < weather.length; i++) {
            favWeather += weather[i].getOpinion() + "\n";
        }
        return favWeather;
    }

    public String getFeels(Opinion[] opinion, int id) {
        switch (opinion[id].strongFeel) {
            case 0:
                return "No strong feelings";
            case 1:
                return "I FUCKING LOVE IT";
            case 2:
                return "I'll cut you if you ask again";
            default:
                return "What was the question again?";
        }
    }

    public String oneWeather(int i) {
        String what = new String("lovehate:" + (weather[i].lovehate));
        return what;
    }

    public String getDog() {
        return "ID: " + this.dog.id + " lovehate: " + this.dog.lovehate;
    }

    public void opine(Opinion[] g) {

        Boolean love = true;
        Boolean hate = true;
        for (int i = 0; i < g.length; i++) {
            g[i] = new Opinion();
            g[i].id = i;
            System.out.println(g[i].id + " - Weather ID");

            double w = random() * 10d;

            int q = (int) w;
            System.out.println("random: " + q);
            if (love && i == g.length - 1) {
                g[i].setLove();
                break;
            }
            if (love && q > 7) {
                g[i].setLove();
                System.out.println("love!");
                love = false;
            } else if ((hate && q < 3) || q == 1) {
                g[i].setHate();
                System.out.println("hate!");
            } else {
                g[i].stats(q);
                System.out.println("don't care!!");
            }
        }
    }
}