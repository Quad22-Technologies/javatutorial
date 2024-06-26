package com.java.tutorial;

import java.net.URL;
import java.time.LocalDate;
import java.util.UUID;

public class Genres {
    private UUID GamesID;
    private String GameName;
    private String Developers;
    private String Publishers;
    private LocalDate PublishingDate;
    private URL Links;
    private LocalDate CreatedDate;
    private LocalDate ModifiedDate;

    public Genres(){}

    public Genres(UUID GamesID, String GameName, String Developers, String Publishers, 
    LocalDate PublishingDate, URL Links, LocalDate CreatedDate, LocalDate ModifiedDate)
    {
        this.GamesID = GamesID;
        this.GameName = GameName;
        this.Developers = Developers;
        this.Publishers = Publishers;
        this.PublishingDate = PublishingDate;
        this.Links = Links;
        this.CreatedDate = CreatedDate;
        this.ModifiedDate = ModifiedDate;
    }

    public UUID getGamesID()
    {
        return GamesID;
    }

    public UUID setFlavor(UUID GamesID)
    {
        return this.GamesID = GamesID;
    }

    public String getGameName()
    {
        return GameName;
    }

    public String setGameName(String GameName)
    {
        return this.GameName = GameName;
    }

    public String getDevelopers()
    {
        return Developers;
    }

    public String setDevelopers(String Developers)
    {
        return this.Developers = Developers;
    }

    public String getPublishers()
    {
        return Publishers;
    }

    public String setPublishers(String Publishers)
    {
        return this.Publishers = Publishers;
    }

    public URL getLinks()
    {
        return Links;
    }

    public URL setLinks(URL Links)
    {
        return this.Links = Links;
    }

    public LocalDate getPublishingDate()
    {
        return PublishingDate;
    }

    public LocalDate setPublishingDate(LocalDate PublishingDate)
    {
        return this.PublishingDate = PublishingDate;
    }

    public LocalDate getCreatedDate()
    {
        return CreatedDate;
    }

    public LocalDate setCreatedDate(LocalDate CreatedDate)
    {
        return this.CreatedDate = CreatedDate;
    }

    public LocalDate getModifiedDate()
    {
        return ModifiedDate;
    }

    public LocalDate setModifiedDate(LocalDate ModifiedDate)
    {
        return this.ModifiedDate = ModifiedDate;
    }
}