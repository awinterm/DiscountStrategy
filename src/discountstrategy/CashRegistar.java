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
    /**
     * This method starts a new sale. It creates a new receipt and passes a OutputStrategy object 
     * and a ReceiptDataAccessStrategy object to it. This Java Doc comment shows what I know about Java Doc.  
     * 
     * @param out an OutputStrategy object
     * @param db  a ReceiptDataAccessStrategy object
     */
    public final void startNewSale(OutputStrategy out, ReceiptDataAccessStrategy db) {
        if (out == null){
            throw new IllegalArgumentException("OutputStrategy is null");
        }
        if (db == null){
            throw new IllegalArgumentException("ReceiptDataAccessStrategy is null");
        }
        receipt = new Receipt(out, db);
    }   
    
    public final void setCustomer(String custID){
           if (custID == null){
            throw new IllegalArgumentException("custID is null");
        }
        receipt.setCustomer(custID);
    }
    
    public final void addItemsToSale(String custID, int qty){
        if (custID == null){
            throw new IllegalArgumentException("custID is null");
        }
        if (qty == 0){
            throw new IllegalArgumentException("qty is null");
        }
        
        receipt.addProductToSale(custID, qty);
    }
    
    public final void printReceipt(){
        receipt.printReceipt();
    }
    


// extra cool things you could add Don't DO any untill this all works first.
    
    public void voidLastItem(){
        // basicailly undo the last bit. 
    }
    
    public void reviewOrder(){
        // Joptionpane a copy of the order before printing to the console.
    }
}
