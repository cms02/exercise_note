package com.chu.note;

import org.junit.Test;

//interface FRUIT{
//	int APPLE = 1, PEACH = 2, BANANA = 3;
//	
//}
//interface COMPANY{
//	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}

/*class Fruit{
	public static final Fruit APPLE = new Fruit(); 
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	
}*/
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	
	Fruit(String color){
//		System.out.println("Call Constructor " + this);
		this.color = color;
	}
}
/*
 * class Company{ 
 * public static final Company GOOGLE = new Company(); 
 * public static final Company APPLE = new Company(); 
 * public static final Company ORACLE = new Company(); 
 * }
 */
enum Company{
	GOOGLE, APPLE, ORACLE;
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
		
//		if(Fruit.APPLE == Company.GOOGLE) {
//			System.out.println("과일애플과 기업애플은 같습니다.");
//		}
		
//		Fruit type = Fruit.APPLE;
//		switch(type) {
//			case APPLE:
//				System.out.println(57+" kcal, color " + Fruit.APPLE.getColor());
//				break;
//			case PEACH:
//				System.out.println(34+" kcal, color " + Fruit.PEACH.getColor());
//				break;
//			case BANANA:
//				System.out.println(93+" kcal, color " + Fruit.BANANA.getColor());
//				break;
//		}
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
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
