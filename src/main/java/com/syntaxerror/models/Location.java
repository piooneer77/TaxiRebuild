package com.syntaxerror.models;

import javax.persistence.*;

@Entity
public class Location {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private double longitude;
    private double latitude;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Location() {
    }

    public Location(String name, double longitude, double latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public String getName() {
        return name;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setName(String name) {
        this.name = name;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    // </editor-fold>

}
