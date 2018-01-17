package okyoun.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAY=  {31,28,31,30,31,30,31,30,31,30,31,31};
	public int maxDaysOfMonth(int month) {
		return MAX_DAY[month-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		Calendar cal=new Calendar();
		int num=s.nextInt();
		if(num<1||num>12)
			System.out.println("1~12사이의 숫자를 입력해줘");
		else {
			System.out.println(num+"월은"+cal.maxDaysOfMonth(num)+"까지 있습니다.");
		}
		s.close();

	}

}
