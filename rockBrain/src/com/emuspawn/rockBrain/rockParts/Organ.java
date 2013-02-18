package com.emuspawn.rockBrain.rockParts;


public class Organ implements Comparable{
    public int OID;
    public String name;
    public int stat;
    public int maxStat;
    public int specMod;
     public Organ(String name, int oid, int stat, int specMod){
         this.OID = oid;
         this.stat = stat;
         this.specMod = specMod;
         this.name = name;
         maxStat = stat;
     }
    public int compareTo(Object obj){
        Organ tmp = (Organ)obj;
        if(this.stat < tmp.stat)
        {
            return -1;
        }
        else if(this.stat > tmp.stat){
            return 1;
        }
        return 0;
    }
}
