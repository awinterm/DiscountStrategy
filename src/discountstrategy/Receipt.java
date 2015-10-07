/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author andre_000
 */
public class Receipt {
    
    private LineItem[] lines = new LineItem[0];
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    
    //private ReceiptDataAccessStrategy db = new FakeDatabase();
    private ReceiptDataAccessStrategy db;
    private Customer customer;
    private final String THANK_YOU_MSG = "Thank you for shopping at Kohl's!";
    private OutputStrategy out;
    Date today = Calendar.getInstance().getTime();
    private int saleNumber = 1;
    
    public Receipt(OutputStrategy out, ReceiptDataAccessStrategy db) {
        this.out = out;
        this.db = db;
    }
    
    public final void setCustomer(String custID){
        if(db.findCustomer(custID) == null) {
            System.out.println("Sorry, This custId is not in found in the database.");
        }
        else {
            customer = db.findCustomer(custID);
        }    
    }
    
    public final void addProductToSale(String productID, int qty){
        if(db.findProduct(productID) == null) {
            System.out.println("Sorry, This ProductId is not in found in the database.");
        }
        LineItem[] temp = new LineItem[lines.length + 1];
        Product p = new Product();
        p = db.findProduct(productID);
        LineItem line = new LineItem(p, qty);

        for(int i = 0; i < lines.length; i++){
        temp[i] = lines[i];
        }
        temp[temp.length-1] = line;
        lines = temp;
        temp = null;   
    }
    
    public final void printReceipt(){
        out.printReceipt(THANK_YOU_MSG, customer.getName(), today, saleNumber, lines);
    }
     
    public static void main(String[] args){
        Receipt r = new Receipt(new ConsoleOutput(), new FakeDatabase());
        r.setCustomer("100");
        r.addProductToSale("A101", 5);
        r.addProductToSale("B205", 5);
        r.addProductToSale("C222", 5);
        r.printReceipt();
        
    }
  
}
   