package com.emuspawn.rockBrain.rockParts;


public class Body {
    String name = "rockBrain";
    Boolean alive = true;
    /*
    old shitty method...or is it?
    Organ HP = new Organ("HP",1,10,0);
    Organ Food= new Organ("Food",2,10,0);
    Organ Sleep= new Organ("Sleep",3,5,0);
    Organ Thirst= new Organ("Thirst",4,5,0);
    Organ Fun= new Organ("Fun",5,15,0);
    Organ[] organs = {HP,Food,Sleep,Thirst,Fun};
     */
    //Organs - name, OID, stat, specmod
    Organ[] organs = {
            new Organ("HP", 1, 10, 0),
            new Organ("Food", 2, 10, 0),
            new Organ("Sleep", 3, 10, 0),
            new Organ("Thirst", 4, 10, 0),
            new Organ("Fun", 5, 10, 0)
    };

    public Body() {
    }

    public void bodyCycle() {
        //inflicts stat decreasing
        organs[1].stat--;
        organs[2].stat--;
        organs[3].stat--;
        organs[4].stat--;
        System.out.println("Life Takes a Toll");
    }

    public void bodyEqualize() {
        System.out.println("My Body Is Ready");
        for (int i = 0; i < organs.length; i++) {
            if (organs[i].stat <= 0) {
                organs[i].stat = 0;
            } else if (organs[i].stat >= organs[i].maxStat) {
                organs[i].stat = organs[i].maxStat;
            }


        }
    }

    public String getOrgans() {
        String organics = organs[0].stat + "," + organs[1].stat + "," + organs[2].stat + "," + organs[3].stat + "," + organs[4].stat;
        return organics;
    }

}

