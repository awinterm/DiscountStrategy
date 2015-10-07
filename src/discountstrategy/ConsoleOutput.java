
package discountstrategy;

import java.text.NumberFormat;
import java.util.Date;

public class ConsoleOutput implements OutputStrategy {
	NumberFormat nf = NumberFormat.getCurrencyInstance();

        @Override
	public final void printReceipt(String msg, String name, Date today, int saleNumber, LineItem[] lines) {
             if (msg == null){
            throw new IllegalArgumentException("msg is null");
            }
             if (name == null){
                 throw new IllegalArgumentException("name is null");
             }
             if (today == null){
                 throw new IllegalArgumentException("today is null");
             }
             if (saleNumber == 0){
                 throw new IllegalArgumentException("today is null");
             }
             if ( lines == null){
                 throw new IllegalArgumentException("lines is null");
             }
            
            double netSubtotal = 0;
            double totalSaved = 0;
            String totalDue;
        // header
            System.out.println(msg);
            System.out.println("Sold to: " + name);
            System.out.println("Date of Sale: " + today );
            System.out.println("Reciept Number: " + saleNumber);
            System.out.println("custID \t Prod Discription \t Qty \t Price \t\t Subtotal \t Discount");
            System.out.println("-------------------------------------------------------------------------------");
        
            for (LineItem line : lines) {
                System.out.println(line.getLineMsg());
                netSubtotal += line.getSubTotal();
                totalSaved += line.getDiscountedSubTotal(line.getQty());
            }
            System.out.println("SubTotal: " + nf.format(netSubtotal));
            System.out.println("Total Saved: " + nf.format(totalSaved));
            totalDue =  nf.format(netSubtotal - totalSaved);
            System.out.println("Total Due: " + totalDue);
            saleNumber++;
	}
        
        
        
}
