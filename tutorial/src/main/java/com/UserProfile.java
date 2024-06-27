package com.java.tutorial;

import java.util.UUID;

public class UserProfile(){
    private String FLname;
    private String gmail;
    private String username;
    private String created;

    public UserProfile(String FLname, String gmail, String username, String created){
        this.FLname = FLname;
        this.gmail = gmail;
        this.username = username;
        this.created = created;

    }

    public String getFLname(){
        return FLname;
    }

    public String getGmail(){
        return gmail;
    }

    public String getUsername(){
        return username;
    }

    public String getCreated(){
        return created;
    }

    public void setFLname(String FLname){
        this.FLname = FLname;
    }

    public void setGmail(String Gmail){
        this.gmail = Gmail;
    }

    public void setUsername(String Username){
        this.username = Username;
    }

    public void setCreated(String Created){
        this.created = Created;
    }
}