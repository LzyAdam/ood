package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
List<AnimalAbstractAPI> list = new ArrayList<>();
	
	public void add(AnimalAbstractAPI o) {
		list.add(o);
	}
	
	public void showList() {
		for (AnimalAbstractAPI a : list) {
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
