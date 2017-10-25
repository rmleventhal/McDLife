/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoomPack;

import McDonogh.Place;
import McDonogh.Student;

/**
 *
 * @author ryanl
 */
public class LanguageRoom extends RoomBase {

    public LanguageRoom(String number, String teacher, Place building, Student[] students, boolean isClubRoom) {
        super(number, teacher, building, students, isClubRoom);
    }
    
    @Override
    void lookAround() {
        System.out.println("You are in your Language class, a picture of a cat hanging onto a tree captioned with \"just hang in there\" looms to the side, you wish you were in the cat's position rather than in this class");
    }
    
}
