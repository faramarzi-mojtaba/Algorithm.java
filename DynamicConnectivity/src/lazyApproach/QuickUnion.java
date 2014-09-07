package lazyApproach;

public class QuickUnion  implements IUnion{
	private int[] unionArray;
	public void initialize(int n){
		try {
			unionArray = new int[n];
			for(int i = 0;i < unionArray.length; i++){
				unionArray[i] = i;
			}
		} catch (Exception e) {
			System.out.println("QuickUnion--> initialize method"+e.getMessage());
		}
	}
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	public int root(int p){
		try {
			while (p != unionArray[p]) {
				p = unionArray[p];
			}
		} catch (Exception e) {
			System.out.println("QuickUnion--> root method"+e.getMessage());
		}
		return p;
	}
	public void union(int p, int q){
		try {
			int i = root(p);
			int j = root(q);
			unionArray[i] = j;
		} catch (Exception e) {
			System.out.println("QuickUnion--> union method"+e.getMessage());
		}

	}
}
