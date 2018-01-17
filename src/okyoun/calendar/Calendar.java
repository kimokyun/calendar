package okyoun.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []date= {31,28,31,30,31,30,31,30,31,30,31,31};
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num<1||num>12)
			System.out.println("1~12사이의 숫자를 입력해줘");
		else {
			System.out.println(num+"월은"+date[num-1]+"까지 있습니다.");
		}
		s.close();

	}

}
