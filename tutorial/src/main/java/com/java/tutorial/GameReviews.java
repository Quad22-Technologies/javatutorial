package com.java.tutorial;
import java.util.UUID;
import java.time.LocalDate;
public class GameReviews
 {
private UUID GameReviewsID;
private String review;
private double rating;
private String reviewerName;
private LocalDate createdDate;
private LocalDate modifiedDate;

public UUID GameReviewsID()
{
    return GameReviewsID;
}

public  void GameReviewsID(UUID GameReviewsID) 
{
    this.GameReviewsID = GameReviewsID;
}

public String getreview()
{
    return review;
}


public void setreview()
{
    this.review = review;
}

public double getrating()
{
    return rating;
}


public void setrating()
{
    this.rating = rating;
}

public String getreviewerName()
{
    return reviewerName;
}


public void setreviewerName()
{
    this.reviewerName = reviewerName;
}


public GameReviews (UUID GameReviewsID, String review, double rating,LocalDate createdDate,LocalDate modifiedDate)
 {
    this.GameReviewsID = GameReviewsID;
    this.review = review;
    this.rating = rating;
    this.createdDate = createdDate;
    this.modifiedDate = modifiedDate;
}



public LocalDate getcreatedDate()
{
    return  createdDate;
}

public  void setcreatedDate(LocalDate  createdDate) 
{
    this.createdDate = createdDate;
}
public LocalDate getmodifiedDate()
{
    return  modifiedDate;
}

public  void setmodifiedDate(LocalDate  modifiedDate) 
{
    this.modifiedDate = modifiedDate;
}

}
