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
public class ScienceRoom extends RoomBase{

    public ScienceRoom(String number, String teacher, Place building, Student[] students, boolean isClubRoom) {
        super(number, teacher, building, students, isClubRoom);
    }

    @Override
    void lookAround() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
