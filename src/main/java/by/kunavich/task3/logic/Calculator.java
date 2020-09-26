/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task3.logic;


import by.kunavich.task3.model.Airplane;

/**
 *
 * @author Lord
 */
public class Calculator {

    public int calculatePassgers(Airplane airplane)  {

        return airplane.getPassangerList().size();
    }
    
}
