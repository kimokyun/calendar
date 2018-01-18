package okyoun.calendar;

import java.util.Scanner;

public class Calendar {
	String PROMPT="cal>";
	private static final int[] MAX_DAY=  {1,2,3,4,5,6,31,30,31,30,31,31};
	public int maxDaysOfMonth(int month) {
		return MAX_DAY[month-1];
	}
	public void getMonth() {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("월을 입력");
			System.out.println(PROMPT);
			int month=s.nextInt();
			if(month==-1)break;
			if(month>12||month<1)continue;
			System.out.println(MAX_DAY[month-1]);
		}	
	s.close();
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		Calendar cal=new Calendar();
		
		
		//System.out.println("반복횟수를 입력");
		//int num=s.nextInt();
		cal.getMonth();
		System.out.println("끝");
		
//		if(num<1||num>12)
//			System.out.println("1~12사이의 숫자를 입력해줘");
//		else {
//			System.out.println(num+"월은"+cal.maxDaysOfMonth(num)+"까지 있습니다.");
//		}
		s.close();

	}

}
