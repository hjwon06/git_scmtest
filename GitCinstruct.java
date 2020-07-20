package tg.edu;

import java.util.Scanner;

public class GitCinstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		
		calc.addNum(num);
		
	}

}
