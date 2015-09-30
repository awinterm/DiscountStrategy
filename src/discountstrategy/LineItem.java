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
public class LineItem {
    // Pretty sure I need this.
    private Product product;
    
    // this probably won't be in the final version as this will come from customer input.
    // Not sure I'll need to store this depending on how I get it passed in. 
    private int qty;
    

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
        this.product = product;
    }
    
    public final double getSubTotal(){
        return product.getUnitPrice() * qty;
    }
    
    public final double getDiscountedSubTotal(int qty){
        return product.getDiscountedProductTotal(qty);
    } 
    
    // this is bad news bears. Just for testing. However... using a msg variable here isn't a horrible idea. 
    
        public String getLineMsg(Product product, int qty){
        
        String linemsg = ("Product ID: " + product.getProductID() + " Product Name: "
                + product.getName() + " Qty: " + qty + " Unit Price: " + product.getUnitPrice() 
                + " total: " + (product.getUnitPrice() * qty) + " Total Discount: " 
                + product.getDiscountedProductTotal(qty));
        return linemsg;
        }
        
    public static void main(String[] args) {
        
        
        // just doing this for testing. I'm... actually going to need a method that adds up like items to find qty.
        
        
         Product[] customerDropsThisOnTheDesk = {
            new Product(9.00, "BLue Shirt", "1aa44411111",new PercentOffDiscount(.10)),
            new Product(19.00, "Red Shirt", "1aa411141",new PercentOffDiscount(.10)),
            new Product(109.00, "BLue Shirt", "1aa4411411",new PercentOffDiscount(.10)),
            new Product(105.00, "Yellow Shirt", "14aa14111",new PercentOffDiscount(.10)),
            new Product(10.00, "Neon Shirt", "1aa1114411",new PercentOffDiscount(.10)),
         };
                 
         LineItem test = new LineItem();
           
         
         for(int i = 0; i < customerDropsThisOnTheDesk.length; i++){
             System.out.println(test.getLineMsg(customerDropsThisOnTheDesk[i], 7));
         }
                 
    }  
        
}
