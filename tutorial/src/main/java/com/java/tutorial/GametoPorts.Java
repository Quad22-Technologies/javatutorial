package com.java.tutorial;


import java.util.UUID;

public class GametoPorts {
    
    private UUID GametoPortsID;
    private UUID gamesID;
    private UUID portsID;


    public GametoPorts(){}

    public  GametoPorts(UUID GametoPortsID, UUID gamesID, UUID portsID){
        this.GametoPortsID = GametoPortsID;
        this.gamesID =  gamesID;
        this.portsID  = portsID;

    }

    // Getters
    public UUID getGametoPortsID(){
        return GametoPortsID
    }
    public UUID getGamesID(){
        return gamesID
    }
    public UUID getPortsID(){
        return portsID
    }

// Setters
public void setGamesToPortsID(UUID gamesToPortsID) {
    this.gamesToPortsID = gamesToPortsID;
}

public void setGamesID(UUID gamesID) {
    this.gamesID = gamesID;
}

public void setPortsID(UUID portsID) {
    this.portsID = portsID;
}


}
