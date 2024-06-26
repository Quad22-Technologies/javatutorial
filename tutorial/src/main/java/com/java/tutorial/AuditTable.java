package com.java.tutorial;

import java.time.LocalDate;
import java.util.UUID;

public class AuditTable {
   
    private UUID AuditID;
    private LocalDate EventTime;
    private UUID UsernameID;
    private String OperationType;
    private LocalDate ExitEntryDate;
    private LocalDate Edit;
    private String Changes;

    //default constructor
    public AuditTable(){}

    public AuditTable(UUID AuditID, LocalDate EventTime, UUID UsernameID, String OperationType, LocalDate ExitEntryDate, LocalDate Edit, String Changes)
    {
        this.AuditID = AuditID;
        this.EventTime = EventTime;
        this.UsernameID = UsernameID;
        this.OperationType = OperationType;
        this.ExitEntryDate = ExitEntryDate;
        this.Edit = Edit;
        this.Changes = Changes;
    }

    //get/set AuditID
    public UUID getAuditID()
    {
        return AuditID;
    }

    public void setAuditID(UUID AuditID)
    {
        this.AuditID = AuditID;
    }
    
    //get/set EventTime
    public LocalDate getEventTime()
    {
        return EventTime;
    }

    public void setEventTime(LocalDate EventTime)
    {
        this.EventTime = EventTime;
    }

    //get/set UsernameID
    public UUID getUsernameID()
    {
        return UsernameID;
    }

    public void setUsernmeID(UUID UsernameID)
    {
        this.UsernameID = UsernameID;
    }

    //get/set OperationType
    public String getOperationType()
    {
        return OperationType;
    }

    public void setOperationType(String OperationType)
    {
        this.OperationType = OperationType;
    }

    //get/set ExitEntryDate
    public LocalDate getExitEntryDate()
    {
        return ExitEntryDate;
    }

    public void setExitEntryDate(LocalDate ExitEntryDate)
    {
        this.ExitEntryDate = ExitEntryDate;
    }

    //get/set Edit
    public LocalDate getEdit()
    {
        return Edit;
    }

    public void setEdit(LocalDate Edit)
    {
        this.Edit = Edit;
    }

    //get/set Changes
    public String getChanges()
    {
        return Changes;
    }

    public void setChanges(String Changes)
    {
        this.Changes = Changes;
    }

}
