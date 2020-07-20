package tg.edu;

public class Calc {
	
	
	public void addNum(int num) {
		int result = 0;
		
		for (int i = 0; i <= num; i++) {
			
			result += i;
		}
		
		System.out.println("1부터" + num + "값은?" + result + "입니다.");
	}
	
}
