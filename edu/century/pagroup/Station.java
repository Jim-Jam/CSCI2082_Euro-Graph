/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.century.pagroup;

import edu.century.pagroup.collections.DestinationCollection;
import edu.century.pagroup.exceptions.StationNotFoundException;

/**
 *
 * @author Matt
 */
public class Station extends City implements Cloneable{
    
    /**
     * Invariant of the class Station:
     * place is a City object that refers to the city in which the Station
     * is located.
     * destinations is a LinkedList of Destination objects. destinations
     * refers to to the cities to which one can travel from the Station object
     */
    private DestinationCollection destinations;
    
    /**
     * A constructor for a Station object that takes a City object as its
     * argument
     * @param city a City object which will be made part of a Station object
     * @postcondition a Station object is created with its place variable set 
     * to the argument in the city parameter.
     */
    public Station(City city){
        super(city);
        destinations = new DestinationCollection();
    }
    
    /**
     * Gets the city name of a Station object.
     * @return the String cityName of a Station object
     */
    public String getCityName(){
        return super.getCityName();
    }
    
    /**
     * Gets the vertexNumber of the Station object
     * @return an int, the vertex id of the City in the Station object.
     */
    public int getCityVertex(){
        return super.getVertex();
    }
    
    /**
     * Gets the destinations of a Station object
     * @return a DestinationCollection, the variable destinations
     * in the Station object.
     */
    public DestinationCollection getDestinations(){
        return destinations;
    }
    
    public Destination getDestination(String name) throws StationNotFoundException{
        
        return destinations.getTargetNode(name).getData();
    }
    
    public Destination getDestination(int vertex) throws StationNotFoundException{
        
        return destinations.getTargetNode(vertex).getData();
    }
    
    /**
     * Gets the destinations of a Station and returns them as an array
     * @return an array of Destination objects, each index refers to a 
     * Destination of the Station object.
     */
    public Destination[] getNeighbors(){
        
        Destination[] answer = new Destination[destinations.getSize()];
        
        int i;
        DestinationNode cursor;
        
        for(cursor = destinations.getHead(), i = 0; cursor != null; i++, 
                cursor = cursor.getLink()){
            answer[i] = cursor.getData();
        }
        
        return answer;
    }
    
    /**
     * Gets the number of destinations a Station is connected to.
     * @return an int, the number of destinations in the Station object.
     */
    public int manyNeighbors(){
        
        return destinations.getSize();
    }
    
    /**
     * Adds a Destination to a Station object
     * @param input a City object you wish to make a destination of the Station.
     * @param timeTo an int, the time in hours it takes to travel between the
     * Station and Destination
     * @precondition input refers to a City object and timeTo is an int
     * @postcondition a Destination object has been added to the variable
     * destinations in the Station object.
     */
    public void addDestination(City input, int timeTo){
        
        destinations.add(new Destination(input, timeTo));
    }
    
    /**
     * Checks if the Station has a certain Destination
     * @param cityName the name of a Destination. The method will check if there
     * is a Destination with this name in the Station variable destinations.
     * @return true if the Station has the Destination with the cityName
     * of the cityName parameter, false if it does not.
     * @throws StationNotFoundException 
     */
    public boolean containsTarget(String cityName) throws StationNotFoundException{
        
        return destinations.containsTarget(cityName);
        
    }
    
    /**
     * Checks if the Station has a certain Destination
     * @param cityVertex the vertexNumber of a Destination. 
     * The method will check if there
     * is a Destination with this vertex in the Station variable destinations.
     * @return true if the Station has the Destination with the vertexNumber
     * of the cityVertex parameter, false if it does not.
     * @throws StationNotFoundException 
     */
    public boolean containsTarget(int cityVertex) throws StationNotFoundException{
        return destinations.containsTarget(cityVertex);
    }
    
    /**
     * Equals method of the Station class.
     * @param other an Object. The method will check if the Object other is
     * equal to the calling Station object.
     * @return true if the Station is equal to the Object other, false if it
     * is not.
     */
    public boolean equals(Object other){
        
        if(other == null)
            return false;
        else if(getClass() != other.getClass()){
            return false;
        }
        else{
            Station otherStation = (Station)other;
            
            return (super.getCityName().equals(otherStation.getCityName()) &&
                    super.getCountryName().equals(otherStation.getCountryName()) &&
                    (super.getVertex() == otherStation.getCityVertex()) &&
                    this.getDestinations().equals(otherStation.getDestinations()));
        }
    }
    
    /**
     * toString method for the class Station
     * @return a String. The method returns a String with the Station and
     * all of its Destination objects
     */
    public String toString(){
        
        String ret;
        
        ret = super.toString();
        ret += "\nDestinations:\n\n" + destinations.toString();
        
        return ret;
    }
    
    /**
     * clone method for the class Station
     * @return a deep copy of the Station calling object.
     */
    public Station clone(){
        
        Station answer;
        
        answer = (Station)super.clone();
        answer.destinations = this.getDestinations();
        
        return answer;
    }
    
    
}
