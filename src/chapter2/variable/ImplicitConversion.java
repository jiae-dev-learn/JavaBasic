package chapter2.variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10; // 1byte
		int iNum = bNum; // 4byte (ë¬µì‹œ?  ?˜•ë³??™˜)
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // ?‹¤?ˆ˜ê°? ? •?ˆ˜ë³´ë‹¤ ?” ? •ë°??•œ ?ˆ˜?´ê¸? ?•Œë¬¸ì— ë¬µì‹œ?  ?˜•ë³??™˜?´ ?¼?–´?‚¨
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // iNum?´ floatë¡? ë¬µì‹œ?  ?˜•ë³??™˜?´ ?¼?–´?‚˜?„œ ?”?•´ì§?
		
		System.out.println(dNum);
	}

}
