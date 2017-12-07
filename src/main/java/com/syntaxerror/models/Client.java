package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.util.Set;

@Entity
@Table( name = "Client_table" )
public class Client extends Account {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    private Location home;
    private Location work;
    private Location customSetLocationByClient;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private Set<Trip> trips;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Client(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount, Set<Report> reports, Location home, Location work, Location customSetLocationByClient) {
        super(firstName, lastName, phone, mail, user, magic, currentLocation, isOnTrip, isLocked, isDeleted, rate, faceImage, tripCount, reports);
        this.home = home;
        this.work = work;
        this.customSetLocationByClient = customSetLocationByClient;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Location getHome() {
        return home;
    }

    public Location getWork() {
        return work;
    }

    public Location getCustomSetLocationByClient() {
        return customSetLocationByClient;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setHome(Location home) {
        this.home = home;
    }

    public void setWork(Location work) {
        this.work = work;
    }

    public void setCustomSetLocationByClient(Location customSetLocationByClient) {
        this.customSetLocationByClient = customSetLocationByClient;
    }
    // </editor-fold>

}
