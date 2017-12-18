package com.syntaxerror.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table( name = "Report_Table" )
public class Report {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String reportString;
    @JsonIgnoreProperties("reports")
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Report() {
    }

    public Report(String reportString, Driver driver, Client client) {
        this.reportString = reportString;
        this.driver = driver;
        this.client = client;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getReportString() {
        return reportString;
    }

    public Driver getDriver() {
        return driver;
    }

    public Client getClient() {
        return client;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setReportString(String reportString) {
        this.reportString = reportString;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    // </editor-fold>

}
