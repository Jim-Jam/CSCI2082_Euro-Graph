/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.century.pagroup.collections;

import edu.century.pagroup.*;
import edu.century.pagroup.exceptions.*;
/**
 *
 * @author Matt
 */
public class EuropeGraph {
    
    // Portugal
    private final City LISBON = new City("Lisbon", "Portugal");
    private final City PORTO = new City("Porto", "Portugal");
    private final City FARO = new City("Faro", "Portugal");
    
    // Spain
    private final City MADRID = new City("Madrid", "Spain");
    private final City SEVILLA = new City("Sevilla", "Spain");
    private final City MALAGA = new City("Malaga", "Spain");
    private final City VALENCIA = new City("Valencia", "Spain");
    private final City PAMPLONA = new City("Pamplona", "Spain");
    private final City BARCELONA = new City("Barcelona", "Spain");
    private final City SANTIAGO = new City("Santiago", "Spain");
    private final City SANTANDER = new City("Santander", "Spain");
    
    // France
    private final City BORDEAUX = new City("Bordeaux", "France");
    private final City MONTPELLIER = new City("Montpellier", "France");
    private final City MARSEILLE = new City("Marseille", "France");
    private final City NICE = new City("Nice", "France");
    private final City LYON = new City("Lyon", "France");
    private final City PARIS = new City("Paris", "France");
    private final City RENNES = new City("Rennes", "France");
    
    // Switzerland
    private final City BERN = new City("Bern", "Switzerland");
    
    // England
    private final City LONDON = new City("London", "England");
    
    // Ireland
    private final City WESTPORT = new City("Westport", "Ireland");
    private final City CORK = new City("Cork", "Ireland");
    private final City DUBLIN = new City("Dublin", "Ireland");
    private final City BELFAST = new City("Belfast", "Ireland");
    
    // Belgium
    private final City BRUSSELS = new City("Brussels", "Belgium");
    
    // Netherlands
    private final City AMSTERDAM = new City("Amsterdam", "Netherlands");
    
    // Italy
    private final City MILAN = new City("Milan", "Italy");
    private final City VENICE = new City("Venice", "Italy");
    private final City BOLOGNA = new City("Bologna", "Italy");
    private final City FLORENCE = new City("Florence", "Italy");
    private final City ROME = new City("Rome", "Italy");
    private final City NAPLES = new City("Naples", "Italy");
    private final City BARI = new City("Bari", "Italy");
    private final City CALABRIA = new City("Calabria", "Italy");
    
    // Germany
    private final City COLOGNE = new City("Cologne", "Germany");
    private final City FRANKFURT = new City("Frankfurt", "Germany");
    private final City MUNICH = new City("Munich", "Germany");
    private final City BERLIN = new City("Berlin", "Germany");
    private final City HAMBURG = new City("Hamburg", "Germany");
    
    // Czech Republic
    private final City PRAGUE = new City("Prague", "Czech Republic");
    
    // Austria
    private final City VIENNA = new City("Vienna", "Austria");
    
    // Poland
    private final City WARSAW = new City("Warsaw", "Poland");
    
    // Slovenia
    private final City LJUBLJANA = new City("Ljubljana", "Slovenia");
    
    // Croatia
    private final City ZAGREB = new City("Zagreb", "Croatia");
    
    // Hungary
    private final City BUDAPEST = new City("Budapest", "Hungary");
    
    // Bosnia Herzogovina
    private final City SARAJEVO = new City("Sarajevo", "Bosnia Herzogovina");
    
    // Serbia
    private final City BELGRADE = new City("Belgrade", "Serbia");
    
    // Macedonia
    private final City SKOPJE = new City("Skopje", "Macedonia");
    
    // Romania
    private final City BUCHAREST = new City("Bucharest", "Romania");
    
    // Bulgaria
    private final City SOFIA = new City("Sofia", "Bulgaria");
    
    // Turkey
    private final City ISTANBUL = new City("Istanbul", "Turkey");
    
    // Greece
    private final City THESSALONIKI = new City("Thessaloniki", "Greece");
    private final City ATHENS = new City("Athens", "Greece");
    
    // Denmark
    private final City COPENHAGEN = new City("Copenhagen", "Denmark");
    
    // Norway
    private final City OSLO = new City("Oslo", "Norway");
    private final City BERGEN = new City("Bergen", "Norway");
    private final City TRONDHEIM = new City("Trondheim", "Norway");
    
    // Sweden
    private final City STOCKHOLM = new City("Stockholm", "Sweden");
    private final City OSTERSUND = new City("Ostersund", "Sweden");
    private final City KIRUNA = new City("Kiruna", "Sweden");
    
    // An array list that will hold the created Station objects
    private StationCollection europe;
    
    /**
     * Null constructor for a EuropeGraph object.
     */
    public EuropeGraph(){
        
        europe = new StationCollection();
    }
    
    /**
     * Initiates the array list variable europe by populating it with 
     * Station objects
     * @precondition a EuropeGraph object has been created and is the calling
     * object
     * @postcondition the EuropeGraph object's array list variable europe
     * has been populated with Station objects. Each Station object has its
     * Destination objects initiated, as well.
     */
    public void fillStations(){
        
        // Portugal
        Station lisbon = new Station(LISBON);    
        lisbon.addDestination(PORTO, 3);
        lisbon.addDestination(FARO, 4);
        lisbon.addDestination(MADRID, 10);
        
        Station porto = new Station(PORTO);
        porto.addDestination(LISBON, 3);
        
        Station faro = new Station(FARO);
        faro.addDestination(LISBON, 4);
        
        europe.add(lisbon);
        europe.add(porto);
        europe.add(faro);
        
        // Spain
        Station madrid = new Station(MADRID);
        madrid.addDestination(LISBON, 10);
        madrid.addDestination(SEVILLA, 3);
        madrid.addDestination(MALAGA, 3);
        madrid.addDestination(SANTIAGO, 7);
        madrid.addDestination(SANTANDER, 5);
        madrid.addDestination(VALENCIA, 4);
        madrid.addDestination(BARCELONA, 3);
        madrid.addDestination(PAMPLONA, 3);
        madrid.addDestination(BORDEAUX, 11);
        
        Station sevilla = new Station(SEVILLA);
        sevilla.addDestination(MADRID, 3);
        sevilla.addDestination(BARCELONA, 6);
        
        Station malaga = new Station(MALAGA);
        malaga.addDestination(MADRID, 3);
        
        Station santiago = new Station(SANTIAGO);
        santiago.addDestination(MADRID, 7);
        
        Station santander = new Station(SANTANDER);
        santander.addDestination(MADRID, 5);
        
        Station valencia = new Station(VALENCIA);
        valencia.addDestination(MADRID, 4);
        valencia.addDestination(BARCELONA, 3);
        
        Station barcelona = new Station(BARCELONA);
        barcelona.addDestination(SEVILLA, 6);
        barcelona.addDestination(MADRID, 3);
        barcelona.addDestination(MONTPELLIER, 5);
        
        Station pamplona = new Station(PAMPLONA);
        pamplona.addDestination(MADRID, 3);
        
        europe.add(madrid);
        europe.add(sevilla);
        europe.add(malaga);
        europe.add(santiago);
        europe.add(santander);
        europe.add(valencia);
        europe.add(barcelona);
        europe.add(pamplona);
        
        // France
        Station bordeaux = new Station(BORDEAUX);
        bordeaux.addDestination(MADRID, 11);
        bordeaux.addDestination(PARIS, 3);
        bordeaux.addDestination(LYON, 6);
        
        Station montpellier = new Station(MONTPELLIER);
        montpellier.addDestination(BARCELONA, 5);
        montpellier.addDestination(MARSEILLE, 2);
        
        Station marseille = new Station(MARSEILLE);
        marseille.addDestination(MONTPELLIER, 2);
        marseille.addDestination(NICE, 3);
        marseille.addDestination(LYON, 4);
        
        Station nice = new Station(NICE);
        nice.addDestination(MARSEILLE, 3);
        nice.addDestination(MILAN, 4);
        
        Station lyon = new Station(LYON);
        lyon.addDestination(MARSEILLE, 4);
        lyon.addDestination(BORDEAUX, 6);
        lyon.addDestination(PARIS, 2);
        lyon.addDestination(BERN, 4);
        
        Station paris = new Station(PARIS);
        paris.addDestination(BORDEAUX, 3);
        paris.addDestination(RENNES, 2);
        paris.addDestination(BRUSSELS, 1);
        paris.addDestination(LONDON, 2);
        paris.addDestination(FRANKFURT, 4);
        paris.addDestination(LYON, 2);
        
        Station rennes = new Station(RENNES);
        rennes.addDestination(PARIS, 2);
        
        europe.add(bordeaux);
        europe.add(montpellier);
        europe.add(marseille);
        europe.add(nice);
        europe.add(lyon);
        europe.add(paris);
        europe.add(rennes);
        
        // Switzerland
        Station bern = new Station(BERN);
        bern.addDestination(LYON, 4);
        bern.addDestination(FRANKFURT, 4);
        bern.addDestination(MILAN, 5);
        
        europe.add(bern);
        
        // England
        Station london = new Station(LONDON);
        london.addDestination(PARIS, 2);
        london.addDestination(BRUSSELS, 2);
        
        europe.add(london);
        
        // Ireland
        Station dublin = new Station(DUBLIN);
        dublin.addDestination(CORK, 3);
        dublin.addDestination(WESTPORT, 4);
        dublin.addDestination(BELFAST, 4);
        
        Station westport = new Station(WESTPORT);
        westport.addDestination(DUBLIN, 4);
        
        Station cork = new Station(CORK);
        cork.addDestination(DUBLIN, 3);
        
        Station belfast = new Station(BELFAST);
        belfast.addDestination(DUBLIN, 4);
        
        europe.add(dublin);
        europe.add(westport);
        europe.add(cork);
        europe.add(belfast);
        
        // Belgium
        Station brussels = new Station(BRUSSELS);
        brussels.addDestination(PARIS, 1);
        brussels.addDestination(LONDON, 2);
        brussels.addDestination(COLOGNE, 2);
        brussels.addDestination(AMSTERDAM, 2);
        brussels.addDestination(FRANKFURT, 3);
        
        europe.add(brussels);
        
        // Netherlands
        Station amsterdam = new Station(AMSTERDAM);
        amsterdam.addDestination(BRUSSELS, 2);
        amsterdam.addDestination(COLOGNE, 3);
        amsterdam.addDestination(BERLIN, 7);
        amsterdam.addDestination(COPENHAGEN, 11);
        
        europe.add(amsterdam);
        
        // Italy
        Station milan = new Station(MILAN);
        milan.addDestination(NICE, 5);
        milan.addDestination(BERN, 5);
        milan.addDestination(MUNICH, 8);
        milan.addDestination(VENICE, 3);
        milan.addDestination(BOLOGNA, 1);
        
        Station venice = new Station(VENICE);
        venice.addDestination(MILAN, 3);
        venice.addDestination(MUNICH, 7);
        venice.addDestination(VIENNA, 7);
        venice.addDestination(LJUBLJANA, 2);
        venice.addDestination(FLORENCE, 2);
        
        Station bologna = new Station(BOLOGNA);
        bologna.addDestination(MILAN, 1);
        bologna.addDestination(FLORENCE, 1);
        
        Station florence = new Station(FLORENCE);
        florence.addDestination(BOLOGNA, 1);
        florence.addDestination(VENICE, 2);
        florence.addDestination(ROME, 4);
        
        Station rome = new Station(ROME);
        rome.addDestination(FLORENCE, 4);
        rome.addDestination(NAPLES, 2);
        rome.addDestination(BARI, 4);
        
        Station naples = new Station(NAPLES);
        naples.addDestination(ROME, 2);
        naples.addDestination(CALABRIA, 8);
        
        Station bari = new Station(BARI);
        bari.addDestination(ROME, 4);
        
        Station calabria = new Station(CALABRIA);
        calabria.addDestination(NAPLES, 8);
        
        europe.add(milan);
        europe.add(venice);
        europe.add(bologna);
        europe.add(florence);
        europe.add(rome);
        europe.add(naples);
        europe.add(bari);
        europe.add(calabria);
        
        // Germany
        Station cologne = new Station(COLOGNE);
        cologne.addDestination(BRUSSELS, 2);
        cologne.addDestination(AMSTERDAM, 3);
        cologne.addDestination(BERLIN, 4);
        cologne.addDestination(FRANKFURT, 1);
        
        Station frankfurt = new Station(FRANKFURT);
        frankfurt.addDestination(PARIS, 4);
        frankfurt.addDestination(BRUSSELS, 3);
        frankfurt.addDestination(COLOGNE, 1);
        frankfurt.addDestination(HAMBURG, 6);
        frankfurt.addDestination(MUNICH, 3);
        frankfurt.addDestination(BERN, 4);
        
        Station munich = new Station(MUNICH);
        munich.addDestination(FRANKFURT, 3);
        munich.addDestination(HAMBURG, 6);
        munich.addDestination(BERLIN, 4);
        munich.addDestination(PRAGUE, 6);
        munich.addDestination(VIENNA, 4);
        munich.addDestination(VENICE, 7);
        munich.addDestination(MILAN, 8);
        
        Station berlin = new Station(BERLIN);
        berlin.addDestination(MUNICH, 4);
        berlin.addDestination(COLOGNE, 6);
        berlin.addDestination(HAMBURG, 2);
        berlin.addDestination(WARSAW, 6);
        berlin.addDestination(PRAGUE, 5);
        berlin.addDestination(FRANKFURT, 4);
        
        Station hamburg = new Station(HAMBURG);
        hamburg.addDestination(COPENHAGEN, 5);
        hamburg.addDestination(BERLIN, 2);
        hamburg.addDestination(MUNICH, 6);
        hamburg.addDestination(FRANKFURT, 4);
        
        europe.add(cologne);
        europe.add(frankfurt);
        europe.add(munich);
        europe.add(berlin);
        europe.add(hamburg);
        
        // Czech Republic
        Station prague = new Station(PRAGUE);
        prague.addDestination(BERLIN, 5);
        prague.addDestination(WARSAW, 7);
        prague.addDestination(VIENNA, 5);
        prague.addDestination(MUNICH, 6);
        
        europe.add(prague);
        
        // Austria
        Station vienna = new Station(VIENNA);
        vienna.addDestination(MUNICH, 5);
        vienna.addDestination(PRAGUE, 5);
        vienna.addDestination(WARSAW, 8);
        vienna.addDestination(BUDAPEST, 3);
        vienna.addDestination(VENICE, 7);
        
        europe.add(vienna);
        
        // Poland
        Station warsaw = new Station(WARSAW);
        warsaw.addDestination(BERLIN, 6);
        warsaw.addDestination(PRAGUE, 7);
        warsaw.addDestination(VIENNA, 8);
        warsaw.addDestination(BUDAPEST, 11);
        
        europe.add(warsaw);
        
        // Slovenia
        Station ljubljana = new Station(LJUBLJANA);
        ljubljana.addDestination(VIENNA, 2);
        ljubljana.addDestination(BUDAPEST, 9);
        ljubljana.addDestination(ZAGREB, 2);
        
        europe.add(ljubljana);
        
        // Croatia
        Station zagreb = new Station(ZAGREB);
        zagreb.addDestination(LJUBLJANA, 2);
        zagreb.addDestination(BUDAPEST, 6);
        zagreb.addDestination(BELGRADE, 6);
        zagreb.addDestination(SARAJEVO, 10);
        
        europe.add(zagreb);
        
        // Hungary
        Station budapest = new Station(BUDAPEST);
        budapest.addDestination(ZAGREB, 6);
        budapest.addDestination(LJUBLJANA, 9);
        budapest.addDestination(VIENNA, 3);
        budapest.addDestination(WARSAW, 11);
        budapest.addDestination(BUCHAREST, 14);
        budapest.addDestination(BELGRADE, 8);
        
        europe.add(budapest);
        
        // Bosnia Herzogovian
        Station sarajevo = new Station(SARAJEVO);
        sarajevo.addDestination(ZAGREB, 10);
        
        europe.add(sarajevo);
        
        // Serbia
        Station belgrade = new Station(BELGRADE);
        belgrade.addDestination(ZAGREB, 6);
        belgrade.addDestination(BUDAPEST, 8);
        belgrade.addDestination(BUCHAREST, 12);
        belgrade.addDestination(SOFIA, 8);
        belgrade.addDestination(SKOPJE, 9);
        
        europe.add(belgrade);
        
        // Macedonia
        Station skopje = new Station(SKOPJE);
        skopje.addDestination(BELGRADE, 9);
        skopje.addDestination(SOFIA, 10);
        skopje.addDestination(THESSALONIKI, 9);
        
        europe.add(skopje);
        
        // Romania
        Station bucharest = new Station(BUCHAREST);
        bucharest.addDestination(BUDAPEST, 14);
        bucharest.addDestination(BELGRADE, 12);
        bucharest.addDestination(SOFIA, 9);
        
        europe.add(bucharest);
        
        // Bulgaria
        Station sofia = new Station(SOFIA);
        sofia.addDestination(BELGRADE, 8);
        sofia.addDestination(BUCHAREST, 9);
        sofia.addDestination(ISTANBUL, 13);
        sofia.addDestination(SKOPJE, 10);
        sofia.addDestination(THESSALONIKI, 7);
        
        europe.add(sofia);
        
        // Turkey
        Station istanbul = new Station(ISTANBUL);
        istanbul.addDestination(SOFIA, 13);
        istanbul.addDestination(THESSALONIKI, 12);
        
        europe.add(istanbul);
        
        // Greece
        Station thessaloniki = new Station(THESSALONIKI);
        thessaloniki.addDestination(SKOPJE, 4);
        thessaloniki.addDestination(SOFIA, 7);
        thessaloniki.addDestination(ISTANBUL, 12);
        thessaloniki.addDestination(ATHENS, 5);
        
        Station athens = new Station(ATHENS);
        athens.addDestination(THESSALONIKI, 5);
        
        europe.add(thessaloniki);
        europe.add(athens);
        
        // Denmark
        Station copenhagen = new Station(COPENHAGEN);
        copenhagen.addDestination(HAMBURG, 5);
        copenhagen.addDestination(AMSTERDAM, 11);
        copenhagen.addDestination(OSLO, 9);
        copenhagen.addDestination(STOCKHOLM, 6);
        
        europe.add(copenhagen);
        
        // Norway
        Station oslo = new Station(OSLO);
        oslo.addDestination(STOCKHOLM, 6);
        oslo.addDestination(BERGEN, 7);
        oslo.addDestination(COPENHAGEN, 9);
        
        Station bergen = new Station(BERGEN);
        bergen.addDestination(OSLO, 7);
        
        europe.add(oslo);
        europe.add(bergen);
        
        // Sweden
        Station stockholm = new Station(STOCKHOLM);
        stockholm.addDestination(OSLO, 7);
        stockholm.addDestination(COPENHAGEN, 6);
        stockholm.addDestination(OSTERSUND, 7);
        stockholm.addDestination(KIRUNA, 16);
        
        Station ostersund = new Station(OSTERSUND);
        ostersund.addDestination(STOCKHOLM, 7);
        ostersund.addDestination(TRONDHEIM, 4);
        
        Station trondheim = new Station(TRONDHEIM);
        trondheim.addDestination(OSTERSUND, 4);
        
        Station kiruna = new Station(KIRUNA);
        kiruna.addDestination(STOCKHOLM, 16);
        
        europe.add(stockholm);
        europe.add(ostersund);
        europe.add(trondheim);
        europe.add(kiruna);
    }
    
    /**
     * gets the Destinations of a Station object.
     * @param stationName a String that is the name of a city in the
     * EuropeGraph
     * @return an array of the argument's Destinations
     */
    public Destination[] getNeighbors(String stationName){
        
        Station tmp = new Station();
    
        try{
           tmp = europe.search(stationName);
        }
        catch(StationNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        return tmp.getNeighbors();
    }
    
    /**
     * gets the Destinations that are contained the Station object with the
     * vertexNumber equal to cityVertex
     * @param cityVertex an int that refers to the vertexNumber of a city
     * in the EuropeGraph
     * @return an array of the Destinations in the Station with the 
     * vertexNumber that is equal to cityVertex.
     */
    public Destination[] getNeighbors(int cityVertex){
        
        Station tmp = new Station();
        
        try{
            tmp = europe.search(cityVertex);
        }
        catch(StationNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        return tmp.getNeighbors();
    }
    
    /**
     * Checks if there is an edge between two vertices (cities) in the
     * EuropeGraph
     * @param from a String that refers to the cityName from which the edge
     * should start.
     * @param to a String that refers to the cityName at which the edge will
     * end.
     * @return true if there is an edge between 'from' and 'to', false
     * if there is not.
     * @throws EmptyListException
     * @throws StationNotFoundException 
     */
    public boolean isEdge(String from, String to) throws EmptyListException,
            StationNotFoundException{
        
        try{
            // A station in the arrayList europe
            Station start = europe.search(from);
    
            DestinationCollection list = start.getDestinations();
            if(list.isEmpty()){
                throw new EmptyListException();
            }
               
            return start.containsTarget(to);
                
        }catch(StationNotFoundException e){
            throw new StationNotFoundException();
        }
    }
    
    /**
     * Checks if there is an edge between two vertices (cities) in the
     * EuropeGraph
     * @param startVertex an int that refers to the city's vertex from which the edge
     * should start.
     * @param endVertex a String that refers to the city's vertex at which the edge will
     * end.
     * @return true if there is an edge between 'from' and 'to', false
     * if there is not.
     * @throws EmptyListException
     * @throws StationNotFoundException 
     */
    public boolean isEdge(int startVertex, int endvertex) throws EmptyListException,
            StationNotFoundException{
        
        try{
            Station start = europe.search(startVertex);
            
            DestinationCollection list = start.getDestinations();
            if(list.isEmpty()){
                throw new EmptyListException();
            }   
            
            return start.containsTarget(endvertex);
        }
        catch(StationNotFoundException e){
            throw new StationNotFoundException();
        }
    }
    
    /**
     * gets the number of Destinations in a Station object
     * @param cityName a String that refers to the Station whose Destinations
     * you wish to count
     * @return an int that is the number of Destinations in the Station object
     * @throws StationNotFoundException 
     */
    public int manyNeighbors(String cityName) throws StationNotFoundException{
        
        Station element = europe.search(cityName);
        
        return element.manyNeighbors();
        
        
    }
    
    /**
     * gets the number of Destinations in a Station object
     * @param cityVertex an int that refers to the Station whose Destinations
     * you wish to count
     * @return an int that is the number of Destinations in the Station object
     * @throws StationNotFoundException 
     */
    public int manyNeighbors(int cityVertex) throws StationNotFoundException{
        
        Station element = europe.search(cityVertex);
        
        return element.manyNeighbors();
    }
    
    /**
     * gets the number of cities in the Graph
     * @return an int that is the number of cities in the Graph
     */
    public int manyCities(){
        return europe.getSize();
    }
    
    /**
     * gets a Station in the Graph
     * @param name a String that refers to the cityName of the Station you
     * wish to get.
     * @return a Station object with the cityName of name
     * @throws StationNotFoundException 
     */
    public Station getStation(String name) throws StationNotFoundException{
        
        Station answer;
        
        answer = europe.search(name);
        
        return answer;
    }
    
    /**
     * gets a Station from the EuropeGraph object.
     * @param cityVertex an int that refers to the vertexNumber of the Station
     * you wish to be returned.
     * @return a Station object.
     * @throws StationNotFoundException 
     */
    public Station getStation(int cityVertex) throws StationNotFoundException{
        
        Station answer;
        
        answer = europe.search(cityVertex);
        
        return answer;
    }
    
    /**
     * gets the vertexNumber of a city
     * @param cityName a String that refers to the City object's cityName
     * @return an int that is the vertexNumber of the City with the cityName
     * of the parameter cityName
     * @throws StationNotFoundException 
     */
    public int getVertex(String cityName) throws StationNotFoundException{
        
        Station answer;
        
        answer = europe.search(cityName);
        
        return answer.getCityVertex();
    }
    
    /**
     * Gets the amount of time it takes travel from one city to the other
     * @param from
     * @param to
     * @return
     * @throws EmptyListException
     * @throws StationNotFoundException 
     */
    public int getDistance(String from, String to) throws EmptyListException,
            StationNotFoundException{
        
        if(!isEdge(from, to))
            throw new StationNotFoundException();
        else{
            Station stat = europe.search(from);
            
            return stat.getDestination(to).getTime();
        }
    }
    
    /**
     * Gets the amount of time it takes to travel between two cities
     * @param fromVert
     * @param toVert
     * @return
     * @throws EmptyListException
     * @throws StationNotFoundException 
     */
    public int getDistance(int fromVert, int toVert) throws EmptyListException,
            StationNotFoundException{
        
        if(!isEdge(fromVert, toVert))
            throw new StationNotFoundException();
        else{
            Station stat = europe.search(fromVert);
            
            return stat.getDestination(toVert).getTime();
        }
    }
    
    /**
     * toString method for a EuropeGraph object.
     * @return A String of Stations.
     */
    public String toString(){
        
        int size = europe.getSize();
        
        String ret = "";
        
        try{
            for(int i = 0; i < size; i++){
                Station tmp = europe.search(i);
                ret += tmp.getCity().toString();
            }   
        }
        catch(StationNotFoundException e){
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
}
