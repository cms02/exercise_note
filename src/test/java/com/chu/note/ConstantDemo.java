package com.chu.note;

import org.junit.Test;

public class ConstantDemo {
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
	
	private final static int COMPANY_GOOGLE = 1;
	private final static int COMPANY_APPLE = 2;
	private final static int COMPANY_ORACLE = 3;

	@Test
	public void test() {
		
		int type = FRUIT_APPLE;
		switch(type) {
			case FRUIT_APPLE:
				System.out.println(57);
				break;
			case FRUIT_PEACH:
				System.out.println(34);
				break;
			case FRUIT_BANANA:
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
