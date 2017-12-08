package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table(name = "TripLocation_table")
public class TripLocation {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne
    @JoinColumn(name = "Id", insertable = false, updatable = false)
    private Trip trip;
    private String name;
    private double longitude;
    private double latitude;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public TripLocation() {
    }

    public TripLocation(String name, double longitude, double latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Trip getTrip() {
        return trip;
    }

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
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

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
