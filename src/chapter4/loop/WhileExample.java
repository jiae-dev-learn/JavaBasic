package chapter4.loop;

public class WhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num++;
			System.out.println(num);
		}
		System.out.println("총합은 "+ sum + " 입니다.");		
	}
}
