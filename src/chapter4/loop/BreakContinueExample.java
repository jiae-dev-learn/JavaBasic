package chapter4.loop;

public class BreakContinueExample {
	public static void main(String[] args) {
		int dan;
		int count;
		
		for(dan = 2; dan<=9; dan++) {
			if ((dan % 2) != 0)	continue;
			System.out.println(dan + "단 입니다.");
			for (count = 1; count <= 9; count++) {
				if(count > dan) break;
				System.out.println(dan + " X " + count + "=" + dan * count);
			}
		}
	}
}
