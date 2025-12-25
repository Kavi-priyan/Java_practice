package Map;

import java.util.TreeMap;

public class Freq {

	
	public static void main(String[] args) {
		
		
		TreeMap<Integer,Integer> tree=new TreeMap<>();
		
		
		int[] arr= {4,5,6,3,1,9,1,8,9,2,5,7,3,5};;
		
		
		for(int i:arr) {
			tree.put(i, tree.getOrDefault(i, 0)+1);
		}
		
		System.out.println(tree);
	}

	@Override
	public String toString() {
		return "Freq [toString()=" + super.toString() + "]";
	}
}
