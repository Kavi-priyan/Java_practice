package T;

public class Relation {
protected  boolean[][] matrix;


Relation(boolean[][] matrix){
	this.matrix=matrix;
}


protected  boolean knows(int a, int b) {
    return matrix[a][b];
}
}
