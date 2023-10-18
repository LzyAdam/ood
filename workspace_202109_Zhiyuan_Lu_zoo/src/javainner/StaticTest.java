package javainner;

public class StaticTest {
public static void main(String[] args) {
	Chinese c1=new Chinese();
	c1.name="ren";
	c1.age=40;
	//c1.nation="CHN";
	Chinese c2=new Chinese();
	c2.name="Lindan";
	c2.age=39;
	c2.nation="PRC";
	System.out.println(c2.nation);
	System.out.println(c1.nation);
}
}
class Chinese{
	static String nation;
	String name;
	int age;
	
	
}