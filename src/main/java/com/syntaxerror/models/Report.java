package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table( name = "Report_Table" )
public class Report {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer Id;
    private String reportString;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    // </editor-fold>

}
