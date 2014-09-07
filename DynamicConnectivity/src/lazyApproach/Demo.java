package lazyApproach;

public class Demo {
	public static void main(String[] args) {
		IUnion UC = new QuickUnion();
		Utility.tester(UC, "quickunion.txt");
	}
}
