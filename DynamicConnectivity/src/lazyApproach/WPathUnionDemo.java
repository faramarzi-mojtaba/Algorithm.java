package lazyApproach;

public class WPathUnionDemo {
	public static void main(String[] args) {
		IUnion UC = new WeightedUnionPathCompression();
		Utility.tester(UC, "quickunion.txt");
	}

}
