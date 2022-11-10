import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = input.nextInt();
		System.out.println("Nhap ma tran 1: ");
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int sum_arr[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Ma tran thu nhat la: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Ma tran thu hai la: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum_arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Tong cua 2 ma tran la: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(sum_arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
