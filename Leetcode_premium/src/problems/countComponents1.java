package problems;

public class countComponents1 {
	  public int countComponents(int n, int[][] edges) {
	        UnionFind uf = new UnionFind(n);
	        for (int[] edge : edges) {
	            uf.union(edge[0], edge[1]);
	        }
	        return uf.countComponents();
	    }
	  

	    private static class UnionFind {
	        private int[] parent;
	        private int[] rank;
	        private int count;

	        public UnionFind(int n) {
	            parent = new int[n];
	            rank = new int[n];
	            count = n;
	            for (int i = 0; i < n; i++) {
	                parent[i] = i;
	            }
	        }

	        public int find(int x) {
	            if (parent[x] != x) {
	                parent[x] = find(parent[x]);
	            }
	            return parent[x];
	        }

	        public void union(int x, int y) {
	            int rootX = find(x);
	            int rootY = find(y);
	            if (rootX != rootY) {
	                if (rank[rootX] > rank[rootY]) {
	                    parent[rootY] = rootX;
	                } else if (rank[rootX] < rank[rootY]) {
	                    parent[rootX] = rootY;
	                } else {
	                    parent[rootY] = rootX;
	                    rank[rootX]++;
	                }
	                count--;
	            }
	        }

	        public int countComponents() {
	            return count;
	        }
	    }

	    public static void main(String[] args) {
	    	countComponents1 solution = new countComponents1();
	        int n = 5;
	        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
	        System.out.println("Number of connected components: " + solution.countComponents(n, edges));
	    }

}
