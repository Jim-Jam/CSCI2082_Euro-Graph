/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.century.pagroup;

/**
 *
 * @author Matt
 */
public class Destination implements Cloneable{
    
    /**
     * Invariant of the class Destination:
     * location is a City object that identifies the Destination
     * timeWeight is an int that refers to the number of hours between
     * a Destination object and its corresponding Station (Each Station
     * has at least one Destination).
     */
    private City location;
    private int timeWeight;
    
    /**
     * Constructor for the Destination Class
     * @param goToLocation refers to the City that will be a Destination of
     * a corresponding Station
     * @param timeTo the amount of time between the Destination and its
     * corresponding Station.
     * @postcondition a Destination object is created
     */
    public Destination(City goToLocation, int timeTo){
        
        location = goToLocation;
        timeWeight = timeTo;
    }
    
    /**
     * gets the City instance variable location
     * @return a reference to the City variable location
     */
    public City getCity(){
        return location;
    }
    
    /**
     * Gets the the cityName from a Destination object.
     * @return a String, the name of the city of the calling object
     */
    public String getCityName(){
        return location.getCityName();
    }
    
    
    public int getCityVertex(){
        return location.getCityVertex();
    }
    
    /**
     * Gets the amount of time between a Destination and its corresponding
     * Station.
     * @return the amount of time it takes to travel between a Destination
     * and its corresponding Station.
     */
    public int getTime(){
        return timeWeight;
    }
    
    /**
     * Sets the amount of time it takes to travel between a Destination
     * and its corresponding Station.
     * @param newTime the new amount of time it will take to travel between
     * a Destination and its corresponding Station.
     */
    public void setTime(int newTime){
        
        timeWeight = newTime;
    }
    
    /**
     * 
     * @return 
     */
    public String toString(){
        
        String ret;
        
        ret = location.toString() + "\nTrip Time: " + timeWeight + " hours";
        return ret;
    }
    
    public Destination clone(){
        
        try{
            Destination copy = (Destination)super.clone();
            copy.location = (City)location.clone();
            return copy;
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }
    
    public boolean equals(Object other){
        
        if(other == null)
            return false;
        else if(getClass() != other.getClass())
            return false;
        else{
            Destination otherDest = (Destination)other;
            return (location.equals(otherDest.location) &&
                    timeWeight == otherDest.timeWeight);
        }
    }
    
}
