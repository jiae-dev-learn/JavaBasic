package chapter2.variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10; // 1byte
		int iNum = bNum; // 4byte (묵시?�� ?���??��)
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // ?��?���? ?��?��보다 ?�� ?���??�� ?��?���? ?��문에 묵시?�� ?���??��?�� ?��?��?��
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // iNum?�� float�? 묵시?�� ?���??��?�� ?��?��?��?�� ?��?���?
		
		System.out.println(dNum);
	}

}
