package Dummy;

import java.util.Arrays;

public class parallel {
public static void main(String[] args) {
//	int[][] points={{2,5},{128653,-2370425}};
	int[][] points = { {3, 1}, {1, 3}, {1, 1} };
;

    Arrays.parallelSort( points, (p, q) -> {
        return p[0]==q[0]?(p[1]-q[1]):(q[0]-p[0]);
    });
    
    System.out.println(Arrays.deepToString(points));
}
}
