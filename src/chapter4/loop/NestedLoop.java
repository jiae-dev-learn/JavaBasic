package chapter4.loop;

public class NestedLoop {

	public static void main(String[] args) {
		// 2 x 3
		int dan;
		int count;
		
		for (dan = 2; dan <= 9; dan++) {
			System.out.println(dan+" 단 입니다.");
			for (count =1; count <= 9; count++) {
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
			System.out.println();
		}
	}

}
