package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.util.Set;

@Entity
@Table( name = "Driver_table" )
public class Driver extends Account{

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id", referencedColumnName = "Id")
    private Car car;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id" ,referencedColumnName = "Id")
    private DriverPersonalDocuments driverPersonalDocuments;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "driver")
    private Set<Trip> trips;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Driver(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount, Set<Report> reports, Car car, DriverPersonalDocuments driverPersonalDocuments) {
        super(firstName, lastName, phone, mail, user, magic, currentLocation, isOnTrip, isLocked, isDeleted, rate, faceImage, tripCount, reports);
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

    public Set<Trip> getTrips() {
        return trips;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCar(Car car) {
        this.car = car;
    }

    public void setDriverPersonalDocuments(DriverPersonalDocuments driverPersonalDocuments) {
        this.driverPersonalDocuments = driverPersonalDocuments;
    }
    // </editor-fold>

}
