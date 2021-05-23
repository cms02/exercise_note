package com.chu.note;

import org.junit.Test;

interface FRUIT{
	int APPLE = 1, PEACH = 2, BANANA = 3;
	
}
interface COMPANY{
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo {
//	public final static int FRUIT_APPLE = 1;
//	public final static int FRUIT_PEACH = 2;
//	public final static int FRUIT_BANANA = 3;
//	
//	public final static int COMPANY_GOOGLE = 1;
//	public final static int COMPANY_APPLE = 2;
//	public final static int COMPANY_ORACLE = 3;

	@Test
	public void test() {
		
		if(FRUIT.APPLE == COMPANY.GOOGLE) {
			System.out.println("과일애플과 기업애플은 같습니다.");
		}
		
		int type = FRUIT.APPLE;
		switch(type) {
			case FRUIT.APPLE:
				System.out.println(57);
				break;
			case FRUIT.PEACH:
				System.out.println(34);
				break;
			case FRUIT.BANANA:
				System.out.println(93);
				break;
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		/*
//		 * 1. 사과 
//		 * 2. 복숭아 
//		 * 3. 바나나
//		 */
//		
//		int type = 1;
//		switch(type) {
//			case 1:
//				System.out.println(57);
//				break;
//			case 2:
//				System.out.println(34);
//				break;
//			case 3:
//				System.out.println(93);
//				break;
//		}
		
		
		
		
	}

}
