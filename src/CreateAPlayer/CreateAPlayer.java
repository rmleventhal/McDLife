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
public class CreateAPlayer {
    public static void main(String[] args) throws InsufficientPointsException {
        Player Ellie = new Artist();
        Ellie = new Intelligence(Ellie);
        Ellie = new Speed(Ellie);
        System.out.println(Ellie.getDescription() + 
                "\n" + "Skill Points Used: " + Ellie.skillPoints());
        
    }
}
