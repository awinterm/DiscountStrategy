
package discountstrategy;

public class ConsoleOutput implements OutputStrategy {
	

	public void writeln( String line ) {
            System.out.println( line );
	}
}
