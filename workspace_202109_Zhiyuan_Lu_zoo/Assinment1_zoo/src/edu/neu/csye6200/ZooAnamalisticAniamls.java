package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnamalisticAniamls {
		
	List<AnimalInterfaceAPI> list = new ArrayList<>();
	
	public void add(AnimalInterfaceAPI o) {
		list.add(o);
	}
	
	public void showList() {
		for (AnimalInterfaceAPI a : list) {
			System.out.println(a);
		}
	}
	
	public static void demo() {
		ZooAnimals z = new ZooAnimals();
		z.add(new Cat());
		z.showList();
		ZooAnimals z1 = new ZooAnimals();
		z1.add(new Dog());
		z1.showList();
		ZooAnimals z2 = new ZooAnimals();
		z2.add(new Bird());
		z2.showList();
	}	
	
}
