package com.example.android.quakereport;

public class Earthquake {
    // Creating private global variable
    private double mMagnitude;
    private long mDate;
    private String mLocation;
    private String mUrl;

    //Making constructor
    public Earthquake(double magnitude, String location, long date, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    // Crating public getter method
    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getDate(){
        return mDate;
    }

    public String getUrl(){
        return mUrl;
    }
}
