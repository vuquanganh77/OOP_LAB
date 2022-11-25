import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int t = (n-1)*2+1;
		int mid = n-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<t;j++) {
				if(j>=mid-i&&j<=mid+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
