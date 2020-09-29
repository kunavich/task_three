/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task3.data.dataAcquirer;


import by.kunavich.task3.data.DataException;

/**
 *
 * @author Lord
 */
public interface DataAcquirer {
    String getName() throws DataException;
    
}
