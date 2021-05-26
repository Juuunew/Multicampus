package day07;

@FunctionalInterface
public interface Command {
	public abstract void exec();
	
	default public void base() {
		System.out.println( "!!!!!!!!!!!!!!!!!!" );
	}
	
}
