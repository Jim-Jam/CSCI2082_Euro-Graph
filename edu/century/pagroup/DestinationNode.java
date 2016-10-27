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
public class DestinationNode implements Cloneable{
    
    /**
     * Invariant of the DestinationNode class:
     * data contains a Destination object
     * link is a reference to the next DestinationNode in a linked list.
     */
    private Destination data;
    private DestinationNode link;
    
    /**
     * Constructor for a DestinationNode.
     * @param initialCity a Destination the will become the data variable of
     * the DestinationNode
     * @param initialLink a DestinationNode that is a reference to the next 
     * node in the ArrayList
     * @precondition initialCity is a Destination object and initialLink is
     * a DestinationNode
     * @postcondition a DestinationNode has been created.
     */
    public DestinationNode(Destination initialCity, DestinationNode initialLink){
        
        data = initialCity;
        link = initialLink;
    }
    
    /**
     * Adds a DestinationNode after the DestinationNode calling object.
     * @param element a Destination that will be placed in the data variable
     * of the DestinationNode added after the calling DestinationNode.
     * @precondition element is a Destination object.
     * @postcondition a DestinationNode has been added after the calling
     * DestinationNode object. The new DestinationNode has the value of 
     * element as its data variable.
     */
    public void addNodeAfter(Destination element){
        link = new DestinationNode(element, link);
    }
    
    /**
     * Gets the data in a DestinationNode object.
     * @return the Destination object in the DestinationNode's variable
     * data.
     */
    public Destination getData(){
        return data;
    }
    
    /**
     * Gets the city's name from a DestinationNode
     * @return a String. The name of the city in the DestinationNode variable
     * data
     */
    public String getCityName(){
        return data.getCityName();
    }
    
    /**
     * Gets the DestinationNode in the link variable of the calling object
     * @return The DestinationNode in the link variable
     */
    public DestinationNode getLink(){
        return link;
    }
    
    /**
     * Searches the linked linked list for a given node starting at the head
     * of the linked list
     * @param head the head of a linked list
     * @param targetName the name of a city whose node you would like returned
     * @return a Destination node that contains a City object with the cityName
     * of targetName
     * @precondition head refers to the head of a linked list. targetName refers
     * to the name of one of the cities in the linked list.
     * @postcondion a DestinationNode with a cityName equal to targetName
     * is returned
     */
    public static DestinationNode listSearch(DestinationNode head, 
            String targetName){
        
        DestinationNode cursor;
        
        for(cursor = head; cursor != null; cursor = cursor.getLink()){
            
            Destination mark = cursor.getData();
            String tempName = mark.getCityName();
            
            if(tempName.equals(targetName))
                return cursor;
        }
        return null;
    }
    
    /**
     * Removes the DestinationNode after the calling node object.
     * @precondition There is a node after the calling object.
     * @postcondition The node after the calling node has been removed.
     */
    public void removeNodeAfter(){
        link = link.link;
    }
    
    public void setData(Destination newDest){
        data = newDest;
    }
    
    public void setLink(DestinationNode newLink){
        link = newLink;
    }
    
    /**
     * Checks if the data variable of a DestinationNode is equal
     * to the data variable of another DestinationNode. The method does not
     * check if the link variables are equal.
     * @param other an Object that will be checked for equality with
     * the calling object.
     * @return true if the objects are equal, false if they are not.
     */
    public boolean equals(Object other){
        
        if(other == null)
            return false;
        else if(getClass() != other.getClass())
            return false;
        else{
            DestinationNode otherNode = (DestinationNode)other;
            return (otherNode.getData().equals(otherNode.getData()));
        }
    }
    
    /**
     * Creates a copy of the DestinationNode's data. The DestinationNode's
     * link is set to null.
     * @return 
     */
    public DestinationNode clone(){
        
        try{
            DestinationNode copy = (DestinationNode)super.clone();
            copy.data = (Destination)data.clone();
            copy.link = null;
            
            return copy;
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }
    
    /**
     * toString method for a DestinationNode. Returns the data variable
     * of a DestinationNode as a String
     * @return 
     */
    public String toString(){
        
        String ret;
        ret = new String(this.getCityName());
        return ret;
    }
    
}
