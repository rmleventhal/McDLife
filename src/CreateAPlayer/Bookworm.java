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
public class Bookworm extends Player{
    
    public Bookworm(){
        description = "Nothing gets between you and a textbook. Studying is your lifeblood." 
                + "\n" + "Giant bonus in the classroom. Weakness in the mental sanity department.";
    }
  
    @Override
    public int skillPoints(){
        return 0;
    }
}
