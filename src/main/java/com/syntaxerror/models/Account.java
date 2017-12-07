package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.util.Set;

public abstract class Account {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer Id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String mail;
    protected String user;
    protected String magic;
    protected Location currentLocation;
    protected Boolean isOnTrip;
    protected Boolean isLocked;
    protected Boolean isDeleted;
    protected Float rate;
    protected File faceImage;
    protected Integer tripCount;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "report")
    protected Set<Report> reports;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    protected Account(String firstName, String lastName, String phone, String mail, String user, String magic, Location currentLocation, Boolean isOnTrip, Boolean isLocked, Boolean isDeleted, Float rate, File faceImage, Integer tripCount, Set<Report> reports) {
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
    public Integer getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getUser() {
        return user;
    }

    public String getMagic() {
        return magic;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public Boolean getOnTrip() {
        return isOnTrip;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public Float getRate() {
        return rate;
    }

    public File getFaceImage() {
        return faceImage;
    }

    public Integer getTripCount() {
        return tripCount;
    }

    public Set<Report> getReports() {
        return reports;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setOnTrip(Boolean onTrip) {
        isOnTrip = onTrip;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setFaceImage(File faceImage) {
        this.faceImage = faceImage;
    }

    public void setTripCount(Integer tripCount) {
        this.tripCount = tripCount;
    }

    public void setReports(Set<Report> reports) {
        this.reports = reports;
    }
    // </editor-fold>

}
