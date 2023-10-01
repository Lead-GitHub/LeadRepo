package arraylist_class;

import java.util.ArrayList;

//COLLECTION EXAMPLE- Arraylist clas 
public class A {
public static void main(String[] args) {
   ArrayList<Integer> a = new ArrayList<Integer>();// bydefault size of this array is 10 & its size is dynamic i.e when size exceed 10 automalically array size increase to 1.5 times.
	// use of add(value) method
	a.add(10); // Putting the variable into object and further storing that object into Arraylist data structure.(Boxing) 
	a.add(20); 
	a.add(30);
	System.out.println("compiled by add(): "+a);
	//use of add(index, value) method.
	a.add(1, 50);
	System.out.println("compiled by add(index, value): "+a);
	// use of addAll(index, collection) method
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(100);
	b.add(200);
	a.addAll(2, b); // carefull
	System.out.println("compiled by addAll(index, collection): "+a);
	// use of remove(value) method 
	a.remove(0);
	System.out.println("compiled by remove(index): "+a);
	// use of contains() method
	if(a.contains(200)) {
		System.out.println("compiled by contain(value): "+"yes present in collection");
	}else {
		System.out.println("compiled by contain(value): "+"not present in collection");
	}
	// use of get(index) method
	System.out.println("compiled by get(index): "+a.get(1));
}

}
