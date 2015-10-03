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
    private String[] prodID = new String[0];
    
    
    
    
    public void addItemsToSale(String[] string, String custID){
        // start up is gonna basicaily dump an array of productsIDs into this method...
        // So I'll take a String Array.
        // Do I need to? and should I do this here? This would require access to the FakeDatabase...
        // Jim Covered this... this should be handled by the receipt class, which I have one in this class...
        // So This should call a method of the receipt object that can take in this info. 
        // What is the point of this method. Why have this layer? why not go right to receipt....  
        // ok here is the plan. Loop Validate and then send the info over to Receipt. 
        // since we are looping here... you could count like things.... maybe? to get the qty?
        // needs validation.
        // This next bit should be in receipt.
        //LineItem[] tempItems = new LineItem[lineItems.length + 1];
        //System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        //tempItems[lineItems.length] = item;
        //lineItems = tempItems;
        // It's also going to give me a CustomerID which I need to tell the receipt class about. 
    }
    
    public void printReceipt(){
        // call the receipt.printMe Method yo. 
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
    
    
    
    
    
    // what do I do? 
    // you ring shit up yo.
    // so like... I totes should like add products to a sale. 
    // probably...
    // sounds pretty good to me...
    // I don't need access to customer.
    // I need... access to the receipt... which is weird cause like... I seem higher up then the receipt.
    // So... I will... Add things to the sale and I will tell the receipt to do things. Awesome. 
    // Hey How exactly is out start up class going to input this shit. 
    // Nice and easy down the middle. Its gonna need a way to feed me the sale. 
    // I tell the receipt what to print... or rather when to print? 
    // so I add things to the sale. 
    // do I have a receipt? Fuck yeah you do.
    // what do I do with it? 
    
    
    
}
