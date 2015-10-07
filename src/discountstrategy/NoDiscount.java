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
class NoDiscount implements DiscountStrategy {

    public NoDiscount() {
        
    }

    @Override
    public final double getAmountSaved(double unitPrice, int qty) {
        return 0;
    }

    @Override
    public final double getDiscountRate() {
        return 0;
    }

    @Override
    public final double getDiscountedProductTotal(double unitPrice, int qty) {
        return unitPrice * qty;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
       
    }
    
}
