package com.syntaxerror.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "Trip_table" )
public class Trip {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id")
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id")
    private Driver driver;
    private Location startingLocation;
    private Location destination;
    private Float distance;
    private Float rate;
    private Float totalPrice;
    private LocalDateTime localDateTime;
    private Float rateToDriver;
    private Float rateToClient;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "trip")
    private Report report;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    // </editor-fold>

}
