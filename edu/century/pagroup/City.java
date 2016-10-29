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
public class City implements Cloneable{
    
    /**
     * Invariant of the City class. countVertex counts the number of City 
     * objects that have been created. vertex is a unique number for each City,
     * the vertex number was set by the static variable countVertex. cityName
     * refers to the name of a city. countryName refers to the name of the 
     * country in which the city is located. The combination of cityName
     * and countryName should be unique.
     */
    private static int countVertex = 0;
    private int vertex;
    private String cityName;
    private String countryName;
    
    public City(){
        cityName = null;
        countryName = null;
    }
    
    /**
     * Constructor for a City object.
     * @param city the name of the city
     * @param country the name of the country in which the city is
     * located.
     * @precondition city and country contain Strings
     * @postcondition An object of Class city is created.
     */
    public City(String city, String country){
        
        vertex = countVertex;
        countVertex++;
        
        cityName = city;
        countryName = country;
    }
    
    /**
     * A copy constructor for the class City
     * @param other a City object
     * @precondition other is a City object
     * @postconditin a City object is created
     */
    public City(City other){
        
        this.vertex = other.vertex;
        this.cityName = new String(other.cityName);
        this.countryName = new String(other.countryName);
    }
    
    /**
     * gets the vertex value for a City
     * @return the int value stored in variable vertex
     */
    public int getVertex(){
        return vertex;
    }
    
    /**
     * gets the cityName of a City 
     * @return a reference to the value stored in the variable cityName
     */
    public String getCityName(){
        return cityName;
    }
    
    /**
     * gets the countryName of a City object
     * @return a reference to the value stored in the variable countryName
     */
    public String getCountryName(){
        return countryName;
    }
    
    /**
     * the toString method for the City class
     * @return a String that contains the instance variables
     * of a City object
     */
    public String toString(){
        
        String answer;
        
        answer = "\n\nVertex: " + vertex + "\nCity: " + cityName + 
                "\nCountry: " + countryName;
        
        return answer;
    }
    
    /**
     * Checks if the calling object is equal to the argument object
     * @param other an instance of the Object class
     * @return true if the other Object is equal to the calling
     * object, false if it is not.
     */
    public boolean equals(Object other){
        
        if(other == null)
            return false;
        else if(this.getClass() != other.getClass())
            return false;
        else{
            City otherCity = (City)other;
        
            return (this.vertex == otherCity.vertex && 
                this.cityName.equals(otherCity.cityName) &&
                this.countryName.equals(otherCity.countryName));
        }
          
    }
    
    /**
     * a Clone method for the City class
     * @return a deep copy of the calling object
     */
    public City clone(){
        try{
            City copy = (City)super.clone();
            return copy;
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }
    
}
