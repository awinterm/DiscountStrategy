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
public class ICustomer {
    private String custID;
    private String name;

    public ICustomer(){
        
    }
    
    
    public ICustomer(String custID, String name) {
        this.custID = custID;
        this.name = name;
    }
    

    
    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    
}
