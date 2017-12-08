package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table(name = "ClientFavouriteLocation_Table")
public class ClientFavouriteLocation {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    private String name;
    private double longitude;
    private double latitude;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public ClientFavouriteLocation() {
    }

    public ClientFavouriteLocation(Client client, String name, double longitude, double latitude) {
        this.client = client;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Client getClient() {
        return client;
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
    public void setClient(Client client) {
        this.client = client;
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
