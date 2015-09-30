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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate;

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    
    @Override
    public double getAmountSaved(double unitPrice, int  qty){
        return unitPrice * qty * discountRate;
    }

    @Override
    public double getDiscountedProductTotal(double unitPrice, int qty){
        return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
    }
    
    
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    public static void main(String[] args) {
        DiscountStrategy discount = new QtyDiscount(.10, 5);
        double amt = discount.getAmountSaved(10.00, 2);
        System.out.println("Discount amount " + amt);
        System.out.println("Discounted Total " + discount.getDiscountedProductTotal(10.0, 2));

    }
    
}
