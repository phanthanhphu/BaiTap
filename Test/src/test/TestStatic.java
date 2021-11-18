package test;

import test.StaticExample.MyStaticClass;

public class TestStatic {
	public static void main(String[] args) {
		StaticExample.setCount(6);
		StaticExample.str = "abc";
		StaticExample se = new StaticExample();
		System.out.println(se.getCount());
		
		System.out.println(StaticExample.str + "and " + se.str );
		System.out.println(StaticExample.str == se.str);
		StaticExample.MyStaticClass ml = new StaticExample.MyStaticClass();
		ml.count = 100;
		StaticExample.MyStaticClass ml1 = new StaticExample.MyStaticClass();
		ml1.count = 200;
		
		System.out.println(ml.count);
		System.out.println(ml1.count);
			
		
	}
}
