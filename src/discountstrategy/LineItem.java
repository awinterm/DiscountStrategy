/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author andre_000
 */
public class LineItem {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    private Product product;
    private int qty;

    public final void setQty(int qty) { 
        this.qty = qty;
    }

    public final int getQty() {
        return qty;
    }
    

    public LineItem() {
    }

    public LineItem(Product product, int qty) {   
        this.product = product;
        this.qty = qty;
    }
    
    public final String getProductID(){
        return product.getProductID();
    }
    
    public final String getProductName(){
        return product.getName();
    }
    
    public final double getProductPrice(){
        return product.getUnitPrice();
    }
    
    public final double getDiscountTotal(int qty){
        return product.getDiscountedProductTotal(qty);
    }
    
    public final Product getProduct() {
        return product;
    }
 
    public final void setProduct(Product product) {
        if(product == null) {
            System.out.println("Sorry, LineItem.setProduct method has "
                    + "illegal argument");
        }
        this.product = product;
    }
    
    public final double getSubTotal(){
        return product.getUnitPrice() * qty;
    }
    
    public final double getDiscountedSubTotal(int qty){
        return  (product.getUnitPrice()* qty) - product.getDiscountedProductTotal(qty);
        
    } 
    
    
        public String getLineMsg(){       
        String linemsg = (product.getProductID() + " \t "
                + product.getName() + " \t " + qty + " \t " + nf.format(product.getUnitPrice()) 
                + " \t " + nf.format((product.getUnitPrice() * qty)) + " \t " 
                + nf.format(((product.getUnitPrice() * qty) - (product.getDiscountedProductTotal(qty)))));
        return linemsg;
        }
        
   
        
}
