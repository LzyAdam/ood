package collectionTest;



import java.util.ArrayList;

public class collection {
		public static void main(String[] args) {
			ArrayList<Integer> coll=new ArrayList<>();
			coll.size();
			coll.add(1);
			coll.add(7888);
			System.out.println(coll.size()); 
			
			ArrayList coll1=new ArrayList();
			coll1.add(3734);
			coll1.add(3437);
			coll.addAll(coll1);
			
			System.out.println(coll.size()); 
			System.out.println(coll); 
			
			
		}
   
}
