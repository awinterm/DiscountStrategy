
package discountstrategy;

public class ConsoleOutput implements OutputStrategy {
	

        @Override
	public void writeln( String line ) {
            System.out.println( line );
	}
}
