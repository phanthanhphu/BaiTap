package test;

public class StaticExample {

	static {
		System.out.println("StaticExample static block");
		 str = "Test";
	  	 setCount(2);
		
	}
	
	static {
		System.out.println("StaticExample static block2");
	}
	
	public static String str;
	private static int count;
	
	public int getCount() {
		return count;
	}
	
	public static int setCount(int count) {
		if(count > 0)
			StaticExample.count = count;
		return count;
		
	}
	
	public static class MyStaticClass{
		public int count;
	}
}
