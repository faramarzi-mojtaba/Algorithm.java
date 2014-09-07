package lazyApproach;

/**
 * @author mojtaba
 * in this case the order of growth is lg*n for the n nodes in union functionality.
 * lg* 65536 = lg* 2^16 = lg 2+lg 2^4 = 1+ lg2 + Lg 4= 1+1+lg2+lg2 =4 !
 */
public class WeightedUnionPathCompression extends WeightedQuickUnion {

	@Override
	public int root(int p) {
		try {
			while (p != unionArray[p]) {
				unionArray[p] = unionArray[unionArray[p]];
				p = unionArray[p];
			}
		} catch (Exception e) {
			System.out.println("QuickUnion--> root method"+e.getMessage());
		}
		return p;
	}
	

}
