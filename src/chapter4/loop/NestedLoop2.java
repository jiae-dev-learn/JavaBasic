package chapter4.loop;

public class NestedLoop2 {

	public static void main(String[] args) {
		// 2 x 3
		int dan = 2;
		
		while(dan<=9) {
			int count = 1;
			System.out.println(dan+" 단 입니다.");
			while(count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count ++;
			}
			dan++;
			System.out.println();
		}
	}

}
