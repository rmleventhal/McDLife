package McDonogh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanl
 */
public class Time { //implement in terms of seconds

    int total = 0;
    int hours = 0;
    int mins = 0;
    int secs = 0;

    public int getHours() {
        return total / 60;
    }

    public int getMins() {
        return (total % 3600) / 60;
    }

    public int getSecs() {
        return total % 60;
    }

    public double getTime() {
        return total / 3600;
    }

    public Time(int hours, int mins, int secs) {
        total = (hours * 3600) + (mins * 60) + (secs);
    }

    public Time(double hours) {
        total = (int) (hours * 3600);
    }

    public void increase(int hours, int mins, int secs) {
        total += (hours * 3600) + (mins * 60) + (secs);
    }

    public void increase(int hours) {
        total += (hours * 3600);
    }

public double timeDelta(Time other) {
        return this.getTime() - other.getTime();
}
    
    public int compareTo(Time other) {
        return (this.equals(other)) ? 0 : (this.isLaterThan(other)) ? 1 : -1;

    }
    
    public boolean isLaterThan(Time other) {
        return this.getTime() > other.getTime();
    }

    public boolean equals(Time other) {
        return this.getTime() == other.getTime();
    }
    
    public boolean isEarlierThan(Time other) {
        return this.getTime() < other.getTime();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHours(), getMins(), getSecs());
    }
}
