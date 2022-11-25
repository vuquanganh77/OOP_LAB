import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[] args) {
		int m, y;
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Nhap thang: ");
		m = input.nextInt();
		System.out.println("Nhap nam: ");
		y = input.nextInt();
		while(m<1||m>12||y<0) {
			System.out.println("Khong thoa man, moi ban nhap lai!");
			System.out.println("Nhap thang: ");
			m = input.nextInt();
			System.out.println("Nhap nam: ");
			y = input.nextInt();
		}
		
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			System.out.println("So ngay cua thang " + m + " la 31 ngay");
		}
		else if(m==4 || m==6 || m==9 || m==11 ) {
			System.out.println("So ngay cua thang " + m + " la 30 ngay");
		}
		else {
			if(y%4==0) {
				if(y%100==0) {
					if(y%400==0) {
						System.out.println("So ngay cua thang " + m + " la 29 ngay");
					}else {
						System.out.println("So ngay cua thang " + m + " la 28 ngay");
					}
				}else {
					System.out.println("So ngay cua thang " + m + " la 29 ngay");
				}
				
			}else {
				System.out.println("So ngay cua thang " + m + " la 28 ngay");
			}
		}
	}
}
