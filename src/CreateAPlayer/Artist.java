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
public class Artist extends Player {

    public Artist() {
        description = "You are simply gifted in the arts. Dancing, Singing, "
                + "Drawing, you can do it all" + "\n" + "Bonuses in the theatre "
                + "and sometimes in the classroom, but you might not want to go "
                + "on the soccer field...";
    }

    @Override
    public int skillPoints() {
        return 0;
    }

}
