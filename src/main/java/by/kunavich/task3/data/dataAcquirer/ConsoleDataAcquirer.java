/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task3.data.dataAcquirer;

import by.kunavich.task3.data.DataException;

import java.util.Scanner;

/**
 *
 * @author Lord
 */
public class ConsoleDataAcquirer implements DataAcquirer{

    @Override
    public String getName() throws DataException {
        System.out.println("Enter name of passanger");
        try (Scanner scanner = new Scanner(System.in)){
            String input =scanner.next();


            return input;
        }



    }
}
