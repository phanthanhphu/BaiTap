package test;
import java.util.ArrayList;
import java.util.List;
public class List_one {
	
	public static void main(String args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 10; i<201; i++) {
			if((i%7 == 0) && (i%5 != 0)) {
				list.add(i);
				
			}
		}
		showList(list);
		
		
	}
	public static void showList(List<Integer> list) {
		if(list != null && !list.isEmpty()) {
			int size = list.size();
			System.out.println(size);
		}
	}
}
