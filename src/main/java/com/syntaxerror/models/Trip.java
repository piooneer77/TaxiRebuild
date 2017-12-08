package com.syntaxerror.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "Trip_table" )
public class Trip {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip")
    private List<TripLocation> startingLocation;
    private Float distance;
    private Float rate;
    private Float totalPrice;
    private LocalDateTime localDateTime;
    private Float rateToDriver;
    private Float rateToClient;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    // </editor-fold>

}
