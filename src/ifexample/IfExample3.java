package ifexample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char degree = 0;
		if(score<0 || score >100) {
			System.out.println("�߸��� �����Դϴ�. 0���� 100������ ���ڸ� �Է��c�ּ���.");
			return;
		}
		
		if(score <= 59) {
			degree = 'F';
		}
		else if (score <= 69) {
			degree = 'D';
		}
		else if (score <= 79) {
			degree = 'C';
		}
		else if (score <= 89){
			degree = 'B';
		}
		else{
			degree = 'A';
		}

		System.out.println("����: "+ score);
		System.out.println("����: "+ degree);
	}

}
