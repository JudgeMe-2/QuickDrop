/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickdrop.Classes;

/**
 *
 * @author Ruby Ann
 */
public class Location {
    String pickUp_loc;
    String dropOff_loc;

    public Location(String pickUp_loc, String dropOff_loc) {
        this.pickUp_loc = pickUp_loc;
        this.dropOff_loc = dropOff_loc;
    }

    public String getPickUp_loc() {
        return pickUp_loc;
    }

    public void setPickUp_loc(String pickUp_loc) {
        this.pickUp_loc = pickUp_loc;
    }

    public String getDropOff_loc() {
        return dropOff_loc;
    }

    public void setDropOff_loc(String dropOff_loc) {
        this.dropOff_loc = dropOff_loc;
    }
}
