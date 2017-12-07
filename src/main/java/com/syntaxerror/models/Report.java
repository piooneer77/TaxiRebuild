package com.syntaxerror.models;

import javax.persistence.*;

@Entity
@Table( name = "Report_table" )
public class Report {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "report")
    private Trip trip;
    @ManyToOne(fetch = FetchType.LAZY)
    private Report report;
    private String reportString;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    // </editor-fold>

}
