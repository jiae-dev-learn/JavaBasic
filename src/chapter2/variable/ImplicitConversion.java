package chapter2.variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10; // 1byte
		int iNum = bNum; // 4byte (λ¬΅μ?  ?λ³??)
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // ?€?κ°? ? ?λ³΄λ€ ? ? λ°?? ??΄κΈ? ?λ¬Έμ λ¬΅μ?  ?λ³???΄ ?Ό?΄?¨
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // iNum?΄ floatλ‘? λ¬΅μ?  ?λ³???΄ ?Ό?΄?? ??΄μ§?
		
		System.out.println(dNum);
	}

}
