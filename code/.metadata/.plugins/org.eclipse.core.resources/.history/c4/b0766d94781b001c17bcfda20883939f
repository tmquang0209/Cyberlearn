package testSort;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Nhập số phần tử: ");
	int n = Integer.parseInt(scan.nextLine());
	
	int arr[] = new int[n];
	
	for(int i = 0; i < n;i++) {
		System.out.print("arr["+i+"] : ");
		arr[i] = Integer.parseInt(scan.nextLine());
	}
	
//	for(int i = 0; i < arr.length;i++) {
//		for(int j = i+1; j < arr.length;j++) {
//			if(arr[j] < arr[i]) {
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//			}
//		}
//	}
	
	for(int i = 0; i < arr.length;i++) {
		for(int j = arr.length-1;j > i;j--) {
			if(arr[j] < arr[i]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	for(int pt : arr) {
		System.out.print(pt + "\t");
	}

	}

}
