package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.util.Set;

@Entity
@Table( name = "account_table" )
public class Account {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String firstName;
    private String lastName;
    private String phone;
    private String mail;
    private String user;
    private String magic;
    private Location currentLocation;
    private Boolean isOnTrip;
    private Boolean isLocked;
    private Boolean isDeleted;
    private Float rate;
    private File faceImage;
    private Integer tripCount;
    private Set<Reports> reports;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Account() {
    }

    public Account(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount, Set<Reports> reports) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
        this.user = user;
        this.magic = magic;
        this.currentLocation = currentLocation;
        this.isOnTrip = isOnTrip;
        this.isLocked = isLocked;
        this.isDeleted = isDeleted;
        this.rate = rate;
        this.faceImage = faceImage;
        this.tripCount = tripCount;
        this.reports = reports;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    // </editor-fold>

}
