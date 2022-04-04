package week04;

import java.util.Scanner;

public class ArrEx1 {
	//----------------------------------------------------------------------
	public static void ArrIns(int[] arr1, int idx, int val) {
		int i;
		for(i = arr1.length -1; i > idx; i--) {
			arr1[i] = arr1[i-1];
		}
		arr1[idx] = val;
	}
	//----------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = {10, 20, 30, 40, 50};
		int index, value;
		
		System.out.print("삽입할 index 번호 입력 : ");
		index = scn.nextInt();
		System.out.print("삽입할 value 입력 : ");
		value = scn.nextInt();
		ArrIns(a, index, value);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		scn.close();
	}
	//----------------------------------------------------------------------
}