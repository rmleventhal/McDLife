package RoomPack;

import McDonogh.Place;
import McDonogh.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ryanl
 */
public abstract class RoomBase {

    private final String number, teacher;
    private final Place building;
    private Student[] students;
    private boolean isClubRoom;

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return the teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @return the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return the isClubRoom
     */
    public boolean isIsClubRoom() {
        return isClubRoom;
    }

    /**
     * @param isClubRoom the isClubRoom to set
     */
    public void setIsClubRoom(boolean isClubRoom) {
        this.isClubRoom = isClubRoom;
    }

    public RoomBase(String number, String teacher, Place building, Student[] students, boolean isClubRoom) {
        this.building = building;
        this.number = number;
        this.teacher = teacher;
        this.students = students;
        this.isClubRoom = isClubRoom;
    }

    public String greetTeacher() {
        return "Hi, " + getTeacher();
    }

    public void learn() {
        // implement a system where the number of invocations are tracked and grades are adjusted accordiingly
        System.out.println(getTeacher() + "starts to talk, you try to listen but begin to daydream...");
    }

    public void doWork() {
        System.out.println("You pull out your laptop to start working on upcoming assignments,but \"accidentally\" hit your bookmark for reddit...");
    }

    abstract void lookAround();
//    abstract String learn();

    public void greetClassMates() {
        String toString = "";
        for (Student student : getStudents()) {
            toString += student.getName();
        }
        System.out.println(toString + "say Hi");
    }

}
