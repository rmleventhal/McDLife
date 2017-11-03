package McDonogh;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanl
 */
public class McDonogh {
    private static McDonogh McD; //Singleton Design Pattern!
    private Time time; //has the master time, to control all others, and into this time he coded his cruelty, his malice, his will to dominate all life, one time to rule them all. used to advance time
    private Place[] places; //stores an array of places of Campus
    private Student[] studentBody;
    private Place currentLoc;
    private Student player;
    
    private McDonogh() {
        //TO DO
    }
    
    public static McDonogh getMcDonogh() {
        if (McD == null) {
            McD = new McDonogh();
        }
        return McD;
    }
    
    //add advisory to schedule
    //might want to make schedule a sepaerate class
    
    
    
    
    
}
