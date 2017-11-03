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
public abstract class Player {
    String description = "Unknown Player";
    
    public String getDescription(){
        return description; 
    }
    
    public abstract int skillPoints() throws InsufficientPointsException;
}
