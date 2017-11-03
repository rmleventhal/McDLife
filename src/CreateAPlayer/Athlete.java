/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateAPlayer;

/**
 *
 * @author jjank
 */
public class Athlete extends Player {

    public Athlete() {
        description = "You are an athlete. You didn't come here to play school." 
                + "\n" + "Major bonus on the turf, some bonuses in the classroom.";
    
    }

    @Override
    public int skillPoints() {
        return 0;
    }

}