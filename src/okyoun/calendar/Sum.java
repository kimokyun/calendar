package okyoun.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�μ��� �Է��ϼ���");
		Scanner scanner=new Scanner(System.in);
		int first=scanner.nextInt();
		int second=scanner.nextInt();
		int result=first+second;
		//System.out.println("�μ��� ����"+result+"�Դϴ�");
		System.out.printf("�μ��� ����%d�Դϴ�",result);
		scanner.close();

	}

}
