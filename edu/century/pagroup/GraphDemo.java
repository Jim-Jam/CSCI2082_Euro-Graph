/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.century.pagroup;

import edu.century.pagroup.exceptions.*;
import edu.century.pagroup.collections.*;
/**
 *
 * @author Matt
 */
public class GraphDemo {
    
    public static void main(String[] args){
        
        try{
            EuropeGraph europe = new EuropeGraph();

            europe.fillStations();
            
            /**
             * isEdge() can tell if two cities are immediate
             * neighbors
             */
            boolean edge = europe.isEdge("Madrid", "Lisbon");
            
            System.out.print("Is Madrid connected to Lisbon? ");
            System.out.println(edge);
            
            // Trying to fix stuff, dont think this part is useful
            Station madrid = europe.getStation("Madrid");

            boolean contains = madrid.containsTarget("Barcelona");
            System.out.print("Does Madrid have Barcelona has a destination? ");
            System.out.println(contains);
            
            boolean edge2 = europe.isEdge("Porto", "Warsaw");
            System.out.print("Is Porto connected to to Warsaw? ");
            System.out.println(edge2);
            
            
            
            
            
            /**
             * Create an instance of Station, count the amount of
             * immediate neighbors it has with .manyNeighbors()
             * I guess I could make a static method in StationCollection
             * that takes the CityName as an argument and gets how many
             * immediate neighbors it has...
             * hmmm, I tried, it's too hard...
             */
            Station berlin = europe.getStation("Berlin");
            
            int size = berlin.manyNeighbors();
            
            
            
            /**
             * Get an array of destinations with below call
             * with a String
             */
            Destination[] places = europe.getNeighbors("Berlin");
            
            /**
             * Get Destination names and display their distance from
             * the station. Can also call getCityName() on the Station
             * I created earlier.
             */
            System.out.println("\n" + berlin.getCityName() + " Destinations: " + size);
            for(int i = 0; i < size; i++){
                System.out.print(places[i].getCityName());
                System.out.println(": " + places[i].getTime() + " hours.");
            }
            
            /**
             * Counting the number of immediate neighbors without having
             * to create an instance of Station. Use the EuropeGraph object
             * europe.
             */
            int size2 = europe.manyNeighbors("Milan");
            
            Destination[] places2 = europe.getNeighbors("Milan");
            
            System.out.println("\nMilan Destinations: " + size2);
            
            for(int i = 0; i < size2; i++){
                System.out.print(places2[i].getCityName());
                System.out.println(": " + places2[i].getTime() + " hours.");
            }
            
            Station madridClone = madrid.clone();
            
            System.out.println("\nCan I make a clone of a station" +
                    " and use toString() on it?");
            
            System.out.println("\n" + madridClone.toString() + "\n");
            
            // How many cities are there in this Graph?
            int manyCities = europe.manyCities();
            
            System.out.println("There are " + manyCities + " cities.");
            
            Station kir = europe.getStation("Kiruna");
            
            System.out.println(kir.toString());
            
            System.out.println(europe.toString());
            
            boolean vertexConnect = europe.isEdge(0, 1);
            boolean vertexConnect2 = europe.isEdge(0, 59);
            
            System.out.println(vertexConnect);
            System.out.println(vertexConnect2);
            
            System.out.println("What is the vertex Number of Berlin?");
            System.out.println(europe.getVertex("Berlin"));
            
            System.out.println("What is the vertex number of Istanbul?");
            System.out.println(europe.getVertex("Istanbul"));
            
            System.out.println("Time from London to Paris.");
            
            int dist = europe.getDistance("London", "Paris");
            
            System.out.println(dist);
            
        }
        catch(StationNotFoundException | EmptyListException e){
            System.out.println(e.getMessage());
        }
    }
    
}
