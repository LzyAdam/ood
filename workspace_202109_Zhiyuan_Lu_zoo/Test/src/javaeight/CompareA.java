package javaeight;

public interface CompareA {
     public static void method1() {
    	 System.out.println("Compare Beijing");
     }
     public default void method2() {
    	 System.out.println("Comapre Shanghai");
     }
}
