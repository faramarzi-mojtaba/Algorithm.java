package greedyApproach;

import lazyApproach.IUnion;

public class QuickFind implements IUnion{

	private int[] unionArray;
	public void initialize(int n){
		try {
			unionArray = new int[n];
			for(int i = 0;i < unionArray.length; i++){
				unionArray[i] = i;
			}
		} catch (Exception e) {
			System.out.println("QuickFind--> initialize method"+e.getMessage());
		}
	}
	public boolean connected(int p, int q){
		return unionArray[p] == unionArray[q];
	}
	public void union(int p, int q){
		try {
			int pIndex = unionArray[p];
			int qIndex = unionArray[q];
			for(int i = 0; i< unionArray.length; i++){
				if(pIndex == unionArray[i])
					unionArray[i] = qIndex;
			}
		} catch (Exception e) {
			System.out.println("QuickFind--> union method"+e.getMessage());
		}
	}
}
