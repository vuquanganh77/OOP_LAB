import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
		 int[] arr = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i] = input.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(arr[i]>arr[j]) {
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp; 
				 }
			 }
		 }
		 System.out.println("Mang sau khi sap xep la: ");
		 for(int i =0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 int sum=0,avg;
		 for(int i =0;i<n;i++) {
			 sum += arr[i];
		 }
		 avg = sum/n;
		 System.out.println("Tong cua cac phan tu trong mang la: " + sum);
		 System.out.println("Trung binh cong cua cac phan tu trong mang la: " + avg);
	}
}
