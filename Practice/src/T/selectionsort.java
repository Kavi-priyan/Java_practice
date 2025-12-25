package T;

import java.util.Arrays;

public class selectionsort {
public static void main(String[] args) {



int arr[]={4,6,9,2,7};

for(int i=0;i<arr.length-1;i++){

int min=i;

for(int j=i+1;j<arr.length;j++){

if(arr[min]>arr[j]){
//      int temp=arr[min];
//      arr[min]=arr[j];
//      arr[j]=temp;
	min=j;

}

}
arr[i]=arr[i]+arr[min]-(arr[min]=arr[i]);
}

System.out.println(Arrays.toString(arr));






}}