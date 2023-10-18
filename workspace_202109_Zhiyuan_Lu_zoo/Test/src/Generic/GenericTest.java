package Generic;

import java.util.*;

public class GenericTest {
	 public static void main(String[] args) {
		
	}
	
	
	
	public  void test1() {
		ArrayList<Integer> list=new ArrayList<>();
		List<Integer> arr = new ArrayList<Integer>();
	
		list.add(78);
		list.add(86);
		list.add(79);
		list.add(83);
		list.add(73);
		list.add(89);
		
		for(Integer score: list) {
			int stuScore= score;
			System.out.println(stuScore);
		}
		
		
		
}
}
