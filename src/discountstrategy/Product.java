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
    public Product(double unitPrice, String productID, String name, DiscountStrategy discount) {
        this.unitPrice = unitPrice;
        this.productID = productID;
        this.name = name;
        this.discount = discount;
    }

    public double getAmountSaved(int  qty){
        return discount.getAmountSaved(unitPrice, qty);
    }
    
    public double getDiscountedProductTotal(int qty){
        return discount.getDiscountedProductTotal(unitPrice, qty);
    }
    
    
    
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
    public static void main(String[] args) {
        Product shirt = new Product(100.00, "BLue Shirt", "1aa11111",new PercentOffDiscount(.10));
        double amountSaved = shirt.getAmountSaved(1);
        System.out.println("amount saved " +  amountSaved);
    }
}
