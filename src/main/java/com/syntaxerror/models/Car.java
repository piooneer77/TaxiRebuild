package com.syntaxerror.models;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;

@Entity
@Table( name = "Car_Table" )
public class Car {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer Id;
    private String carMake;
    private String type;
    private String model;
    private Boolean isACOn;
    private String plateNumbers;
    private String plateLetters;
    private File licenseImage;
    private LocalDate licenseExpiryDate;
    private Boolean isCarValid;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Car() {
    }

    public Car(String carMake, String type, String model, Boolean isACOn, String plateNumbers, String plateLetters, File licenseImage, LocalDate licenseExpiryDate, Boolean isCarValid) {
        this.carMake = carMake;
        this.type = type;
        this.model = model;
        this.isACOn = isACOn;
        this.plateNumbers = plateNumbers;
        this.plateLetters = plateLetters;
        this.licenseImage = licenseImage;
        this.licenseExpiryDate = licenseExpiryDate;
        this.isCarValid = isCarValid;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Boolean getACOn() {
        return isACOn;
    }

    public String getPlateNumbers() {
        return plateNumbers;
    }

    public String getPlateLetters() {
        return plateLetters;
    }

    public File getLicenseImage() {
        return licenseImage;
    }

    public LocalDate getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public Boolean getCarValid() {
        return isCarValid;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setACOn(Boolean ACOn) {
        isACOn = ACOn;
    }

    public void setPlateNumbers(String plateNumbers) {
        this.plateNumbers = plateNumbers;
    }

    public void setPlateLetters(String plateLetters) {
        this.plateLetters = plateLetters;
    }

    public void setLicenseImage(File licenseImage) {
        this.licenseImage = licenseImage;
    }

    public void setLicenseExpiryDate(LocalDate licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public void setCarValid(Boolean carValid) {
        isCarValid = carValid;
    }
    // </editor-fold>

}
