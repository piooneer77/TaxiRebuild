package com.syntaxerror.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Trip_Table" )
public class Trip {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @JsonIgnoreProperties("trips")
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip", cascade = CascadeType.ALL)
    private List<TripLocation> startingLocation = new ArrayList<TripLocation>();
    private Float distance;
    private Float rate;
    private Float totalPrice;
    private LocalDateTime localDateTime;
    private Float rateToDriver;
    private Float rateToClient;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Trip() {
    }

    public Trip(Client client, Driver driver, Float distance, Float rate, Float totalPrice, LocalDateTime localDateTime, Float rateToDriver, Float rateToClient) {
        this.client = client;
        this.driver = driver;
        this.distance = distance;
        this.rate = rate;
        this.totalPrice = totalPrice;
        this.localDateTime = localDateTime;
        this.rateToDriver = rateToDriver;
        this.rateToClient = rateToClient;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Client getClient() {
        return client;
    }

    public Driver getDriver() {
        return driver;
    }

    public List<TripLocation> getStartingLocation() {
        return startingLocation;
    }

    public Float getDistance() {
        return distance;
    }

    public Float getRate() {
        return rate;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Float getRateToDriver() {
        return rateToDriver;
    }

    public Float getRateToClient() {
        return rateToClient;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setStartingLocation(TripLocation startingLocation) {
        this.startingLocation.add(startingLocation);
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setRateToDriver(Float rateToDriver) {
        this.rateToDriver = rateToDriver;
    }

    public void setRateToClient(Float rateToClient) {
        this.rateToClient = rateToClient;
    }
    // </editor-fold>

}
