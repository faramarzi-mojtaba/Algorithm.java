package greedyApproach;

import lazyApproach.IUnion;
import lazyApproach.Utility;

public class Demo {
	public static void main(String[] args) {
		IUnion UC = new QuickFind();
		Utility.tester(UC,"quickfind.txt");
	}
}
