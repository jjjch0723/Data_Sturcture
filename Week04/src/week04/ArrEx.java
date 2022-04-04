package week04;

import java.util.Scanner;

public class ArrEx {
	public static void ArrDel(int[] arr1, int idx) {
		int i;
		for (i = idx; i < arr1.length-1; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[i] = 0;
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = {10, 20, 30, 40, 50};
		int index;
		
		System.out.print("삭제할 index 번호 입력 : ");
		index = scn.nextInt();
		ArrDel(a, index);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
