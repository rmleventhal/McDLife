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
public class MathRoom extends RoomBase{

    public MathRoom(String number, String teacher, Place building, Student[] students, boolean isClubRoom) {
        super(number, teacher, building, students, isClubRoom);
    }

    @Override
    void lookAround() {
        System.out.println("You are in a Math classroom. You see generic encouragement and math related posters. A poster listing Pi looms above the board");
    }
    
}
