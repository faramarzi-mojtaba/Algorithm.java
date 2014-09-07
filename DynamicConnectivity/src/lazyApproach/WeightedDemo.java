package lazyApproach;

public class WeightedDemo {

	public static void main(String[] args) {
		IUnion UC = new WeightedQuickUnion();
		Utility.tester(UC, "quickunion.txt");
	}
}
