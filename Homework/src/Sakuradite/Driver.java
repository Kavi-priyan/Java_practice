package Sakuradite;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rat[] arr=new Rat[3];
		
		arr[0]=new Rat(90,"Hi");
		arr[1]=new Rat(80,"Li");
		arr[2]=new Rat(70,"Ki");
		
		System.out.println(arr[0].compareTo(arr[2]));

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(arr[1].stringTo(arr[2].fore));
	}

}
