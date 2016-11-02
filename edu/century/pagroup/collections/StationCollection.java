/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.century.pagroup.collections;

import java.util.ArrayList;
import edu.century.pagroup.Station;
import edu.century.pagroup.exceptions.*;
/**
 *
 * @author Matt
 */
public class StationCollection {
    
    /**
     * Invariant of the class StationCollection:
     * europe is an ArrayList of Station objects
     */
    private ArrayList<Station> europe;
    
    /**
     * Null constructor for a StationCollection object
     * @postcondition an object of StationCollection is created.
     */
    public StationCollection(){
        europe = new ArrayList();
    }
    
    /**
     * Adds a Station object to the ArrayList europe.
     * @param s a Station object
     * @return true if the Station was successfully added to the
     * variable europe.
     * @precondition s is a Station object.
     * @postcondition the Station is added to the ArrayList europe
     */
    public boolean add(Station s){
        return europe.add(s);
    }
    
    /**
     * Removes a Station from the ArrayList europe
     * @param s a Station object
     * @return true if the Station object was successfully removed
     * from the variable Europe
     * @precondition s is a Station object
     * @postcondition s is removed from the ArrayList europe
     */
    public boolean remove(Station s){
        return europe.remove(s);
    }
    
    /**
     * Determines if the arrayList variable europe is empty
     * @return true if the ArrayList europe is empty
     */
    public boolean isEmpty(){
        europe.trimToSize();
        int size = europe.size();
        if(size == 0)
            return true;
        return false;
        
    }
    
    /**
     * gets the size of the variable europe
     * @return an int that is the size of the europe ArrayList
     */
    public int getSize(){
        europe.trimToSize();
        
        return europe.size();
    }
    
    /**
     * gets the Station with vertexNumber of targetVertex
     * @param targetVertex the vertexNumber of the Station you would
     * like returned
     * @return the Station object with the vertexNumber equal to targetVertex
     * @throws StationNotFoundException 
     */
    public Station search(int targetVertex) throws StationNotFoundException{
        
        for(Station element : europe){
            if(element.getVertex() == targetVertex)
                return element;
        }
        
        throw new StationNotFoundException();
    }
    
    /**
     * Gets the Station with the cityName of the cityName String argument
     * @param cityName a String that is the name of a city in the EuropeGraph
     * @return a Station with the same cityName as the cityName argument
     * @throws StationNotFoundException 
     */
    public Station search(String cityName) throws StationNotFoundException{
        
        for(Station element : europe){
            if(element.getCityName().equals(cityName))
                return element;
        }
        
        throw new StationNotFoundException();
    }
    
    /**
     * Gets the number of Destinations in a Station object
     * @param cityName the cityName of the Station you want check the number
     * of Destinations
     * @return an int, the number of destinations in the Station
     * @throws StationNotFoundException 
     */
    public int manyDestinations(String cityName) throws StationNotFoundException{
        
        DestinationCollection list;
        
        for(Station element : europe){
            if(element.getCityName().equals(cityName)){
                list = element.getDestinations();
                return list.getSize();
            }       
        }
        
        throw new StationNotFoundException();
    }
    
    /**
     * toString method for the StationCollection object
     * @return a String, the elements of the ArrayList europe
     */
    public String toString(){
        return europe.toString();
    }
    
    /**
     * Checks if one instance of StationCollection is equal to another
     * @param other an Object, which you want to check is equal to 
     * the calling object
     * @return true if the Objects are equal, false if they are not
     */
    public boolean equals(Object other){
        
        if(other == null){
            return false;
        }
        else if(getClass() != other.getClass())
            return false;
        else{
            
            StationCollection otherStations = (StationCollection)other;
            
            return europe.equals(otherStations.europe);
        }
    }
    
    /**
     * clone method for the StationCollection class
     * @return a deep copy of the StationCollection object
     */
    public StationCollection clone(){
        
        StationCollection answer;
        
        try{
            answer = (StationCollection)super.clone();
        }
        catch(CloneNotSupportedException e){
            return null;
        }
        
        int size = this.getSize();
        
        for(int i = 0; i < size; i++){
            answer.europe = (ArrayList)this.europe.clone();
        }
        
        return answer;
    }
}
