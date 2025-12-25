package Sakuradite;

public class Mail {
public static void main(String[] args) {
	String[] arr= {"afas@gmail.com","sadas@gmail.com","lokce@yahoo.com"};
	
	String s="@gmail.com";
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i].endsWith(s)) {
			arr[i]=arr[i].substring(0,arr[i].length()-s.length());
			arr[i]=arr[i]+"@yahoo.com";
		}
	}
	
	for(String i:arr) {
		System.out.println(i);
	}
}
}
