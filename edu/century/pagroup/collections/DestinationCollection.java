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
public class DestinationCollection implements Cloneable{
    
    /**
     * Invariant of the class DestinationCollection:
     * DestinationCollection is a LinkedList of Destination objects.
     * The variable head refers to the first node in the DestinationCollection.
     * The variable tail refers to the last node in the DestinationCollection.
     * The int variable numberOfNodes refers to the number of nodes currently
     * in the DestinationCollection.
     */
    private DestinationNode head;
    private DestinationNode tail;
    private int numberOfNodes;
    
    /**
     * Null constructor for an object of class DestinationCollection
     * @postcondition an object of Class DestinationCollection is created.
     */
    public DestinationCollection(){
        
        head = null;
        tail = null;
    }
    
    /**
     * Adds a Destination object to the LinkedList DestinationCollection
     * @param element a Destination that will be added to the front of
     * DestinationCollection.
     * @precondition element is a Destination object.
     * @postcondition DestinationNode containing the Destination element
     * will be added to the front of the DestinationCollection.
     */
    public void add(Destination element){
        
        if(head == null){
            head = new DestinationNode(element, null);
            tail = head;
            numberOfNodes++;
        }
        else{
            DestinationNode tmp = new DestinationNode(element, head);
            head = tmp;
            numberOfNodes++;
        }
    }
    
    /**
     * Checks if the DestinationCollection is empty.
     * @return a boolean, true if the DestinationCollection is empty, false
     * if it is not.
     */
    public boolean isEmpty(){
        return (numberOfNodes == 0);
    }
    
    /**
     * Gets a specified DestinationNode.
     * @param cityName used to identify the DestinationNode that will be 
     * returned. 
     * @return a DestinationNode that has the cityName argument as its
     * cityName
     * @throws StationNotFoundException 
     */
    public DestinationNode getTargetNode(String cityName) throws StationNotFoundException{
        
        DestinationNode cursor;
        
        for(cursor = head; cursor != null; cursor = cursor.getLink()){
            String element = cursor.getData().getCityName();
            if(cityName.equals(element))
                return cursor;
        }
        throw new StationNotFoundException();
    }
    
    public DestinationNode getTargetNode(int vertex) throws StationNotFoundException{
        
        DestinationNode cursor;
        
        for(cursor = head; cursor != null; cursor = cursor.getLink()){
            int element = cursor.getData().getCity().getVertex();
            if(vertex == element)
                return cursor;
        }
        throw new StationNotFoundException();
    }
    
    /**
     * Checks if the DestinationCollection contains a City with the 
     * cityName argument as its cityName variable.
     * @param cityName
     * @return a boolean, true if there is a Destination with the cityName
     * variable of the cityName argument.
     * @throws StationNotFoundException 
     */
    public boolean containsTarget(String cityName) throws StationNotFoundException{
        
        DestinationNode cursor;
        
        for(cursor = head; cursor != null; cursor = cursor.getLink()){
            String element = cursor.getCityName();
            if(cityName.equals(element))
                return true;
        }
        return false;
    }
    
    /**
     * Checks if the DestinationCollection contains a Destination with argument 
     * cityName as its cityName variable
     * @param cityVertex The method will search for a Destination with the
     * vertexNumber equal to cityVertex
     * @return a boolean, true if the DestinationCollection contains a
     * Destination object with a vertexNumber of cityVertex, false if it
     * does not.
     * @throws StationNotFoundException 
     */
    public boolean containsTarget(int cityVertex) throws StationNotFoundException{
        
        DestinationNode cursor;
        
        for(cursor = head; cursor != null; cursor = cursor.getLink()){
            int element = cursor.getData().getCity().getVertex();
            if(cityVertex == element)
                return true;
        }
        return false;
    }
    
    /**
     * Removes the first DestinationNode from a DestinationCollection
     * @precondition the calling object is a non-empty DestinationCollection
     * @postcondition the first node from the linked list DestinationCollection
     * has been removed.
     * @throws EmptyListException 
     */
    public void removeFirst() throws EmptyListException{
        if(isEmpty()){
            throw new EmptyListException();
        }
        if(head.getLink() == null){
            head = null;
            tail = null;
            numberOfNodes--;
        }
        else{
            head = head.getLink();
            numberOfNodes--;
        } 
    }
    
    /**
     * Removes the last node from a DestinationCollection
     * @precondition the calling object is a non-empty DestinationCollection
     * @postcondition the last node from the DestinationCollection has been
     * removed.
     * @throws EmptyListException 
     */
    public void removeLast() throws EmptyListException{
        if(isEmpty()){
            throw new EmptyListException();
        }
        if(head != null && head == tail){
            head = null;
            tail = null;
            numberOfNodes--;
        }
        else{
            DestinationNode currentNode;
            DestinationNode nodeBefore;
            
            for(currentNode = head, nodeBefore = null; currentNode != null;
                    nodeBefore = currentNode, 
                    currentNode = currentNode.getLink()){
                if(currentNode == tail){
                    tail = nodeBefore;
                    tail.setLink(null);
                    numberOfNodes--;
                }
            }
        }
    }
    
    /**
     * Gets the tail node from a DestinationCollection
     * @return the tail node of a DestinationCollection
     */
    public DestinationNode getTail(){
        return tail;
    }
    
    /**
     * Gets the head node from a DestinationCollection
     * @return the head node of a DestinationCollection
     */
    public DestinationNode getHead(){
        return head;
    }
    
    /**
     * Gets the size of a Destination collection, i.e. the number of nodes
     * in the DestinationCollection
     * @return the number of nodes in the DestinationCollection
     */
    public int getSize(){
        return numberOfNodes;
    }
    
    /**
     * toString method for the DestinationCollection class
     * @return String of the contents of the DestinationCollection object that
     * called the method
     */
    public String toString(){
        
        String ret = "";
        
        DestinationNode cursor;
        
        for(cursor = head; cursor != null; cursor = cursor.getLink()){
            ret += cursor.getData().toString();
            ret += "\n\n";
        }
        
        return ret;
    }
    
    /**
     * Checks if the calling object DestinationCollection is equal to the 
     * Object other
     * @param other an Object. The method will check if other is equal to the
     * calling DestinationCollection object.
     * @return true if the two objects are equal, false if they are not.
     */
    public boolean equals(Object other){
        
        if(other == null)
            return false;
        else if(getClass() != other.getClass())
            return false;
        else{
            
            DestinationCollection otherList = (DestinationCollection)other;
            
            DestinationNode cursor1;
            DestinationNode cursor2;
            
            for(cursor1 = this.getHead(), cursor2  = otherList.getHead();
                    cursor1 != null;
                    cursor1 = cursor1.getLink(), cursor2 = cursor2.getLink()){
                if(!cursor1.getData().equals(cursor2.getData()))
                    return false;    
            }
            return true;
        }
    }
    
    /**
     * clone method for the DestinationCollection class
     * @return a deep copy of the calling DestinationCollection calling
     * object.
     */
    public DestinationCollection clone(){
        
        DestinationCollection answer;
        
        try{
            answer = (DestinationCollection)super.clone();
        }
        catch(CloneNotSupportedException e){
            return null;
        }
        
        return answer;
    }
}
