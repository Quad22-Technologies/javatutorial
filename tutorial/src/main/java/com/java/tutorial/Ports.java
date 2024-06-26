package com.java.tutorial;

import java.util.UUID;
import java.time.LocalDate;
public class Ports {
    private UUID portsID;
    private String platform;
    private String Compatability;
    private LocalDate CreatedDate;
    private LocalDate ModifiedDate;

    public Ports(){}




    public Ports (UUID portsID, String platform, String Compatability,LocalDate CreatedDate,LocalDate ModifiedDate) {
        this.portsID= portsID;
        this.platform = platform;
        this.Compatability = Compatability;
        this.CreatedDate = CreatedDate;
        this.ModifiedDate = ModifiedDate;
    }

    public UUID getPortsID(){
        return portsID;
    }

    public  void setPortsID(UUID portsID) {
        this.portsID = portsID;
    }

    public String getPlatform(){
        return platform;
    }

    public  void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getCompatability(){
        return  Compatability;
    }

    public  void setCompatability(String  Compatability) {
        this.Compatability =  Compatability;
    }

    public LocalDate getCreatedDate(){
        return  CreatedDate;
    }

    public  void setCreatedDate(LocalDate  CreatedDate) {
        this.CreatedDate = CreatedDate;
    }
    public LocalDate getModifiedDate(){
        return  ModifiedDate;
    }

    public  void setModifiedDate(LocalDate  ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }



}

