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
public class Intelligence extends AttributeDecorator {

    Player player;
    int points;

    public Intelligence(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    public String getDesciption() {
        return player.getDescription() + " ,Intelligence";
    }

    public double cost() throws InsufficientPointsException {
        int sP = player.skillPoints() + points;
        if (sP < 10) {
            return player.skillPoints() + points;
        } else {
            throw new InsufficientPointsException();
        }
    }
}
