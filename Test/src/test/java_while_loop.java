package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class java_while_loop {

	
	//QUESTION 1
//	public static void main(String[] args) {
//		int i = 20;
//		while(i <=30) {
//			System.out.println(i);
//			i++;
//			
//		}
//	}
	//QUESTION 2
	
//	public static void main(String[] args) {
//		List<String> array = new ArrayList<>();
//		array.add("Phan");
//		array.add("Thanh");
//		array.add("Phu");
//		
//		Iterator<String> it = array.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	
//	}
	
	//QUESTION 3
	public static void main(String[] args) {
		while(true) {
			System.out.println("Start Processing");
			System.out.println("End Processing");
		try {
			Thread.sleep(2);
			
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted, ext now");
			System.exit(0);
		}
		}
	}
}
