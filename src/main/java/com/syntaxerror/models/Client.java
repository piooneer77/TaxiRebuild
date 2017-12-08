package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Client_Table" )
public class Client extends Account {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<ClientFavourateLocation> clientFavourateLocations = new ArrayList<ClientFavourateLocation>();
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Trip> trips;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    protected List<Report> reports = new ArrayList<Report>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Client(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount) {
        super(firstName, lastName, phone, mail, user, magic, currentLocation, isOnTrip, isLocked, isDeleted, rate, faceImage, tripCount);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public List<ClientFavourateLocation> getClientFavourateLocations() {
        return clientFavourateLocations;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public List<Report> getReports() {
        return reports;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setClientFavourateLocations(ClientFavourateLocation clientFavourateLocation) {
        this.clientFavourateLocations.add(clientFavourateLocation);
    }

    public void setTrips(Trip trip) {
        this.trips.add(trip);
    }

    public void setReports(Report report) {
        this.reports.add(report);
    }
    // </editor-fold>

}
