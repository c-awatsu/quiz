package quiz101;


public abstract class DecoratePrinter {

	public abstract void print();

	public final void decoratePrint() {
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+");
		print();
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+");
	}

}
