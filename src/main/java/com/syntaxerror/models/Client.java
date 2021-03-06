package com.syntaxerror.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Client_Table" )
public class Client extends Account {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.ALL)
    private List<ClientFavouriteLocation> clientFavouriteLocations = new ArrayList<ClientFavouriteLocation>();
    @JsonIgnoreProperties("client")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.ALL)
    private List<Trip> trips = new ArrayList<Trip>();
    @JsonIgnoreProperties("client")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.ALL)
    private List<Report> reports = new ArrayList<Report>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Client() {
    }

    public Client(Client client) {
        this.setId(client.getId());
        this.setFirstName(client.getFirstName());
        this.setLastName(client.getLastName());
        this.setPhone(client.getPhone());
        this.setMail(client.getMail());
        this.setUser(client.getUser());
        this.setMagic(client.getMagic());
        this.setCurrentLocation(client.getCurrentLocation());
        this.setOnTrip(client.getOnTrip());
        this.setLocked(client.getLocked());
        this.setDeleted(client.getDeleted());
        this.setRate(client.getRate());
        this.setTripCount(client.getTripCount());
        this.setRole(client.getRole());
    }

    public Client(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount, Integer role) {
        super(firstName, lastName, phone, mail, user, magic, currentLocation, isOnTrip, isLocked, isDeleted, rate, faceImage, tripCount, role);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public List<ClientFavouriteLocation> getClientFavouriteLocations() {
        return clientFavouriteLocations;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public List<Report> getReports() {
        return reports;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setClientFavouriteLocations(ClientFavouriteLocation clientFavouriteLocation) {
        this.clientFavouriteLocations.add(clientFavouriteLocation);
    }

    public void setTrips(Trip trip) {
        this.trips.add(trip);
    }

    public void setReports(Report report) {
        this.reports.add(report);
    }
    // </editor-fold>

}
