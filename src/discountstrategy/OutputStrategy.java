
package discountstrategy;

import java.util.Date;


public interface OutputStrategy {
	
	public abstract void printReceipt(String msg, String name, Date today, int saleNumber, LineItem[] lines);
}
