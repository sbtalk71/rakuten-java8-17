package greet.module;



public class Greeter {

	public void greet() {
		System.out.println("Hello There from "+this.getClass().getModifiers());
		
	}
	
	public static void main(String[] args) {
		Greeter g = new Greeter();
		System.out.println("Hello from "+g.getClass().getModule());
	}
}
