package javainner;

import java.util.*;

public class ListTest {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("tom");
	list.add("tom");
	list.add("jack");
	list.add("rose");
	//list.add(1,"Adam");
	//System.out.println(list);
	//System.out.println(list.get(2));
	System.out.println(list.indexOf("tom"));//tom第一次出现的位置
	System.out.println(list.lastIndexOf("tom"));//tom最后一次出现的位置
	
}
}
