package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Driver_Table" )
public class Driver extends Account{

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @OneToOne(fetch=FetchType.LAZY)
    private Car car;
    @OneToOne(fetch=FetchType.LAZY)
    private DriverPersonalDocuments driverPersonalDocuments;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Trip> trips = new ArrayList<Trip>();
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Report> reports = new ArrayList<Report>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Driver(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount) {
        super(firstName, lastName, phone, mail, user, magic, currentLocation, isOnTrip, isLocked, isDeleted, rate, faceImage, tripCount);
    }

    public Driver(Car car, DriverPersonalDocuments driverPersonalDocuments) {
        this.car = car;
        this.driverPersonalDocuments = driverPersonalDocuments;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Car getCar() {
        return car;
    }

    public DriverPersonalDocuments getDriverPersonalDocuments() {
        return driverPersonalDocuments;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public List<Report> getReports() {
        return reports;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCar(Car car) {
        this.car = car;
    }

    public void setDriverPersonalDocuments(DriverPersonalDocuments driverPersonalDocuments) {
        this.driverPersonalDocuments = driverPersonalDocuments;
    }

    public void setTrips(Trip trip) {
        this.trips.add(trip);
    }

    public void setReports(Report report) {
        this.reports.add(report);
    }
    // </editor-fold>

}
