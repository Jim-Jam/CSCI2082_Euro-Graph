/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.century.pagroup.exceptions;

/**
 *
 * @author Matt
 */
public class EmptyListException extends Exception{
    
    public EmptyListException(){
        super("List is empty");
    }
}
