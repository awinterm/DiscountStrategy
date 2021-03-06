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
public class QtyDiscount implements DiscountStrategy {
    private double discountRate;
    private int minQty;

    public QtyDiscount(double discountRate, int minQty ) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }
    
    
    @Override
    public final double getAmountSaved(double unitPrice, int  qty){
        if(qty >= minQty){
        return unitPrice * qty * discountRate;
    } else {
            return 0;
        }
    }
    
    @Override
    public final double getDiscountedProductTotal(double unitPrice, int qty){
         if(qty >= minQty){
        return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
    } else {
             return unitPrice * qty;
         }
    }
    
    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
   
    
}
