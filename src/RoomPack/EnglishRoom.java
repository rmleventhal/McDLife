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
public class EnglishRoom extends RoomBase{

    public EnglishRoom(String number, String teacher, Place building, Student[] students, boolean isClubRoom) {
        super(number, teacher, building, students, isClubRoom);
    }

    @Override
    void lookAround() {
        System.out.println("You are in an English Room, philosophical writing and quotes litter the walls, while thought provoking questions pervade the whiteboard.");
    }
    
}
