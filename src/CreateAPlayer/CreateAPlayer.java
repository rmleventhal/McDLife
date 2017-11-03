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
        Player Jack = new Student();
        Jack = new Intelligence(Jack, 5);
        System.out.println(Jack.getDescription() + 
                "\n" + "Skill Points Used: " + Jack.skillPoints());
        
    }
}
