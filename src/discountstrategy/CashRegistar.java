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
public class CashRegistar {
    private Receipt receipt;
    
    public void startNewSale(OutputStrategy out) {
        receipt = new Receipt(out);
    }   
    
    public void setCustomer(String custID){
        receipt.setCustomer(custID);
    }
    
    public void addItemsToSale(String custID, int qty){
       receipt.addProductToSale(custID, qty);
    }
    
    public void printReceipt(){
        receipt.printReceipt();
    }
    // extra cool things you could add Don't DO any untill this all works first.
    
    public void voidLastItem(){
        // basicailly undo the last bit. 
    }
    
    public void reviewOrder(){
        // Joptionpane a copy of the order before printing to the console.
        // Really just calling... WAIT A FUCKING SECOND... 
        // You need some output strat. possibly some input strat... however... like... you really only have ...Fuck.
    }
}
