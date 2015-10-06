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
    
    
    private ReceiptDataAccessStrategy db = new FakeDatabase();
    private ICustomer customer;
    private final String THANK_YOU_MSG = "Thank you for shopping at Kohl's!";
    private OutputStrategy out;
    Date today = Calendar.getInstance().getTime();
    private int saleNumber = 1;
    
    public Receipt(OutputStrategy out) {
        this.out = out;
    }
    
    public void setCustomer(String custID){
        if(db.findCustomer(custID) == null) {
            System.out.println("Sorry, This custId is not in found in the database.");
        }
        else {
            customer = db.findCustomer(custID);
        }    
    }
    
    public void addProductToSale(String productID, int qty){
        
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
        // some varibles to store runnning totals.
        double netSubTotal = 0;
        double totalSaved = 0;
        String totalDue;
        // header
        out.writeln(THANK_YOU_MSG);
        out.writeln("Sold to: " + customer.getName());
        out.writeln("Date of Sale: " + today );
        out.writeln("Reciept Number: " + saleNumber);
        out.writeln("custID \t Prod Discription \t Qty \t Price \t Subtotal \t Discount");
        out.writeln("-------------------------------------------------------------------------------");
        
        for(int i = 0; i < lines.length; i++){
            out.writeln(lines[i].getLineMsg());
            netSubTotal += lines[i].getSubTotal();
            totalSaved += lines[i].getDiscountedSubTotal(lines[i].getQty());
        }
        out.writeln("SubTotal: " + nf.format(netSubTotal));
        out.writeln("Total Saved: " + nf.format(totalSaved));
        totalDue =  nf.format(netSubTotal - totalSaved);
        out.writeln("Total Due: " + totalDue);
        saleNumber++;
    }
     
    public static void main(String[] args){
        Receipt r = new Receipt(new ConsoleOutput());
        r.setCustomer("100");
        r.addProductToSale("A101", 5);
        r.addProductToSale("B205", 5);
        r.addProductToSale("C222", 5);
        r.printReceipt();
        
    }
  
}
   