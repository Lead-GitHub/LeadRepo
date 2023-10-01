package linkedlist_class;

import java.util.Iterator;
import java.util.LinkedList;

public class A {

	public static void main(String[] args) {

		EmployeeDetail e1 = new EmployeeDetail();
		e1.setFirstName("suraj");
		e1.setLastName("Gupta");
		e1.setId(100);

		EmployeeDetail e2 = new EmployeeDetail();
		e2.setFirstName("bikash");
		e2.setLastName("sah");
		e2.setId(102);

		EmployeeDetail e3 = new EmployeeDetail();
		e3.setFirstName("RAMESH");
		e3.setLastName("SAH");
		e3.setId(101);

		LinkedList<EmployeeDetail> emp = new LinkedList<EmployeeDetail>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);

		System.out.println(emp);

	     for(EmployeeDetail ed:emp) { // copying e1 of emp into class datatype variable so that we can acess method of that class.
	    	 
	    	 System.out.println(ed.getFirstName());
	 		System.out.println(ed.getLastName());
	 		System.out.println(ed.getId());
	 	}
	     
	     System.out.println("outuput using iterator method of arraylist class");
               // 2nd way of running loop .
		Iterator<EmployeeDetail> itr = emp.iterator(); // here object e1,e2,e3 stored into itr object
		while (itr.hasNext()) {                       // here hasNext() confirm avaliability of e1,e2,e3 into itr object .if gives true it moves inside flower bracket.
			EmployeeDetail ed = itr.next();           // here next() method give member of e1 to ed object  
			System.out.println(ed.getFirstName());    // here using ed object we can acess member of ed.
			System.out.println(ed.getLastName());
			System.out.println(ed.getId());
		}

	}

}
