package okyoun.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []date= {31,28,31,30,31,30,31,30,31,30,31,31};
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num<1||num>12)
			System.out.println("1~12������ ���ڸ� �Է�����");
		else {
			System.out.println(num+"����"+date[num-1]+"���� �ֽ��ϴ�.");
		}
		s.close();

	}

}
