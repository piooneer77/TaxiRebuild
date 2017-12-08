package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;

@Entity
@Table( name = "DriverPersonalDocuments_Table" )
public class DriverPersonalDocuments {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private File idPhotoCopy;
    private File licenseImage;
    private LocalDate licenseExpiryDate;
    private Boolean isLicenseValid;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public DriverPersonalDocuments() {
    }

    public DriverPersonalDocuments(File idPhotoCopy, File licenseImage, LocalDate licenseExpiryDate, Boolean isLicenseValid) {
        this.idPhotoCopy = idPhotoCopy;
        this.licenseImage = licenseImage;
        this.licenseExpiryDate = licenseExpiryDate;
        this.isLicenseValid = isLicenseValid;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public File getIdPhotoCopy() {
        return idPhotoCopy;
    }

    public File getLicenseImage() {
        return licenseImage;
    }

    public LocalDate getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public Boolean getLicenseValid() {
        return isLicenseValid;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setIdPhotoCopy(File idPhotoCopy) {
        this.idPhotoCopy = idPhotoCopy;
    }

    public void setLicenseImage(File licenseImage) {
        this.licenseImage = licenseImage;
    }

    public void setLicenseExpiryDate(LocalDate licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public void setLicenseValid(Boolean licenseValid) {
        isLicenseValid = licenseValid;
    }
    // </editor-fold>

}
