/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author krishna
 */
public class Cars {
    private String name;
    private boolean isAvailable;
    private String manufactured_by;
    private int manufactured_year;
    private byte seats;
    private String serial_number;
    private String model_number;
    private boolean is_maintanance_certificate_expired;
    private String geolocation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getManufactured_by() {
        return manufactured_by;
    }

    public void setManufactured_by(String manufactured_by) {
        this.manufactured_by = manufactured_by;
    }

    public int getManufactured_year() {
        return manufactured_year;
    }

    public void setManufactured_year(int manufactured_year) {
        this.manufactured_year = manufactured_year;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public boolean getIs_maintanance_certificate_expired() {
        return is_maintanance_certificate_expired;
    }

    public void setIs_maintanance_certificate_expired(boolean is_maintanance_certificate_expired) {
        this.is_maintanance_certificate_expired = is_maintanance_certificate_expired;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }
    @Override
    public String toString(){
    return name;
    }
   }
