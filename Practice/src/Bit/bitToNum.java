package Bit;

public class bitToNum {
public static void main(String[] args) {
	String bit="0101";
	int num=0;
	
	for(int i=0;i<bit.length();i++) {
		
		int value=bit.charAt(bit.length() -1-i)-'0';
		
		num+=value *Math.pow(2,i);
	}
	System.out.println(num);
}
}
