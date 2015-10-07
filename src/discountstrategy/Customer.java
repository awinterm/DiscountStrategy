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
public class Customer {
    private String custID;
    private String name;

    public Customer(){
        
    }
    
    
    public Customer(String custID, String name) {
        this.custID = custID;
        this.name = name;
    }
    

    
    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        if(custID == null) {
            System.out.println("Sorry, Customer.setCustID method has "
                    + "illegal argument");
        }
        this.custID = custID;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null) {
            System.out.println("Sorry, Customer.setName method has "
                    + "illegal argument");
        }
        this.name = name;
    }



    
}
