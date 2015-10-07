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
public class Product {
    
    private double unitPrice;
    private String productID;
    private String name;
    private DiscountStrategy discount;

    
    public Product(){
        
    
 
    }
    public Product(String productID, String name, double unitPrice, DiscountStrategy discount) {
        this.unitPrice = unitPrice;
        this.productID = productID;
        this.name = name;
        this.discount = discount;
    }

    public final double getAmountSaved(int  qty){
        return discount.getAmountSaved(unitPrice, qty);
    }
    
    public final double getDiscountedProductTotal(int qty){
        return discount.getDiscountedProductTotal(unitPrice, qty);
    }
    
    
    
    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        if(productID == null) {
            System.out.println("Sorry, Product.setProductID method has "
                    + "illegal argument");
        }    
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null) {
            System.out.println("Sorry, Product.setName method has "
                    + "illegal argument");
        }    
        
        this.name = name;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        if(discount == null) {
            System.out.println("Sorry, Product.setDiscount method has "
                    + "illegal argument");
        }    
        this.discount = discount;
    }
    
    
    
 
}
