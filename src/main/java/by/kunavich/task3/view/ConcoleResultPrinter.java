/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task3.view;

/**
 *
 * @author Lord
 */
public class ConcoleResultPrinter implements ResultPrinter{

    @Override
    public void printResult(int amount) {
        System.out.println("Amount of passangers: "+ amount);

    }
}
