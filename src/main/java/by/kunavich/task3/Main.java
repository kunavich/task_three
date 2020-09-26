/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task3;

import by.kunavich.task3.data.*;
import by.kunavich.task3.logic.Calculator;
import by.kunavich.task3.model.Airplane;
import by.kunavich.task3.view.ConcoleResultPrinter;
import by.kunavich.task3.view.ResultPrinter;
import by.kunavich.task3.view.ResultPrinter;


/**
 *
 * @author Lord
 */
public class Main {
     public static void main(String[] args) throws Exception {

         // get
         AirplaneCreator airplaneCreator = new AirplaneCreator();
         Airplane airplane =airplaneCreator.createAirplane();

         //count
         Calculator calculator = new Calculator();
         int amount= calculator.calculatePassgers(airplane);

         //out
         ResultPrinter printer= new ConcoleResultPrinter();
         printer.printResult(amount);


    }
}
