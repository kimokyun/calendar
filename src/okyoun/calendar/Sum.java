package okyoun.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두수를 입력하세요");
		Scanner scanner=new Scanner(System.in);
		int first=scanner.nextInt();
		int second=scanner.nextInt();
		int result=first+second;
		//System.out.println("두수의 합은"+result+"입니다");
		System.out.printf("두수의 합은%d입니다",result);
		scanner.close();

	}

}
