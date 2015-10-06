/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author andre_000
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        CashRegistar cashReg = new CashRegistar();
        cashReg.startNewSale(new ConsoleOutput());
        cashReg.setCustomer("100");
        cashReg.addItemsToSale("A101", 2);
        cashReg.addItemsToSale("B205", 6);
        cashReg.addItemsToSale("C222", 2);
        cashReg.printReceipt();
        
    }
    }
    

