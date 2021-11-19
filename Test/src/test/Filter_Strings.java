package test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter_Strings {
	
	public List<String> search(List<String> list){
		
	return list.stream()
			.filter(s->s.startsWith("a"))
			.filter(s->s.length() == 3)
			.collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		
		
		
	}

}
