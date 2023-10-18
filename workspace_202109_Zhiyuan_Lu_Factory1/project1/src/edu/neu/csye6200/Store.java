package edu.neu.csye6200;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Store extends AbstractStore{
	public static void demo() throws IOException {
		List<FoodItem> fooditem=new ArrayList<>();
		List<ElectronicItem> electronicitem=new ArrayList<>();
		List<ServiceItem> serviceitem=new ArrayList<>();
		/**********************************showFoodItems*********************/
		System.out.println("*************************showFoodItems*************************");
		FileUtil f1=new FileUtil();
		f1.writeFoodItems();
		f1.readFoodItems();
		System.out.println("Show: id, name ,price");
		System.out.println("The state of all fooditem:");
		for(FoodItem obj1: f1.readFoodItems()) {
			System.out.println(obj1.toString());
			fooditem.add(obj1);					
		}
		
		
		/**************************************sortFoodItems***************************************/
		System.out.println("**********************sortFoodItems***********************");
		
		/***********sortbyPrice*********************/
		System.out.println("sortbyprice");
		Collections.sort(fooditem,new Comparator<FoodItem>() {

			@Override
			public int compare(FoodItem o1, FoodItem o2) {			
				return Double.compare(o1.getPrice(), o2.getPrice());
			}});
    	System.out.println(fooditem);
    	
    	/***********sortbyID*********************/
    	System.out.println("sortbyID");
		Collections.sort(fooditem,new Comparator<FoodItem>() {

			@Override
			public int compare(FoodItem o1, FoodItem o2) {			
				return Integer.compare(o1.getID(), o2.getID());
			}});
    	System.out.println(fooditem);
    	
    	/***********sortbyName*********************/
    	System.out.println("sortbyName");
		Collections.sort(fooditem,new Comparator<FoodItem>() {

			@Override
			public int compare(FoodItem o1, FoodItem o2) {			
				return o1.getName().compareTo(o2.getName());
			}});
    	System.out.println(fooditem);
    	
    	
		System.out.println("***********showElectronicItems***************");
		FileUtil f2=new FileUtil();
		f2.writeElectronicItems();
		f2.readElectronicItems();
		System.out.println("Show: id, name ,price");
		System.out.println("The state of all electronicitem:");
		for(ElectronicItem obj2: f2.readElectronicItems()) {
			System.out.println(obj2.toString());
			
			electronicitem.add(obj2);					
		}
		/**************************************sortElectronicItems***************************************/
		System.out.println("**********************sortElectronicItems***********************");
		
		/***********sortbyPrice*********************/
		System.out.println("sortbyprice");
		Collections.sort(electronicitem,new Comparator<ElectronicItem>() {

			@Override
			public int compare(ElectronicItem o1, ElectronicItem o2) {			
				return Double.compare(o1.getPrice(), o2.getPrice());
			}});
    	System.out.println(electronicitem);
    	
    	/***********sortbyID*********************/
    	System.out.println("sortbyID");
		Collections.sort(electronicitem,new Comparator<ElectronicItem>() {

			@Override
			public int compare(ElectronicItem o1, ElectronicItem o2) {			
				return Integer.compare(o1.getID(), o2.getID());
			}});
    	System.out.println(electronicitem);
    	
    	/***********sortbyName*********************/
    	System.out.println("sortbyName");
		Collections.sort(electronicitem,new Comparator<ElectronicItem>() {

			@Override
			public int compare(ElectronicItem o1, ElectronicItem o2) {			
				return o1.getName().compareTo(o2.getName());
			}});
    	System.out.println(electronicitem);
		
		
		
		
		//FileUtil f3=new FileUtil();
		//f3.writeserviceItems();
		//utils.writeTeacherItems();
		System.out.println("***********showServiceItems***************");
		FileUtil f3=new FileUtil();
		f3.writeserviceItems();
		f3.readServiceItems();
		System.out.println("Show: id, name ,price");
		System.out.println("The state of all Serviceitem:");
		for(ServiceItem obj3: f3.readServiceItems()) {
			System.out.println(obj3.toString());
			
			serviceitem.add(obj3);					
		}
		/**************************************sortElectronicItems***************************************/
		System.out.println("**********************sortElectronicItems***********************");
		
		/***********sortbyPrice*********************/
		System.out.println("sortbyprice");
		Collections.sort(serviceitem,new Comparator<ServiceItem>() {

			@Override
			public int compare(ServiceItem o1, ServiceItem o2) {			
				return Double.compare(o1.getPrice(), o2.getPrice());
			}});
    	System.out.println(serviceitem);
    	
    	/***********sortbyID*********************/
    	System.out.println("sortbyID");
		Collections.sort(serviceitem,new Comparator<ServiceItem>() {

			@Override
			public int compare(ServiceItem o1, ServiceItem o2) {			
				return Integer.compare(o1.getID(), o2.getID());
			}});
    	System.out.println(serviceitem);
    	
    	/***********sortbyName*********************/
    	System.out.println("sortbyName");
		Collections.sort(serviceitem,new Comparator<ServiceItem>() {

			@Override
			public int compare(ServiceItem o1, ServiceItem o2) {			
				return o1.getName().compareTo(o2.getName());
			}});
    	System.out.println(serviceitem);
		
		
		
	}
}
