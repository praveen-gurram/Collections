                 // ARRAYLIST PROGRAMS   


// CREATE  NEW ARAYLIST ADD SOME COLORS
/*import java.util.*;
public class Collections {
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("orange");
		list.add("green");
		list.add("white");
		list.add("black");
			System.out.println(list);
			String element=list.set(2,"blue");
			System.out.println(list);
			
		
		
	}

}*/    //[red, orange, blue, white, black]

// REMOVE ELEMENT AT 2ND POSITION

/*import java.util.*;
public class Collections {
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("orange");
		list.add("green");
		list.add("white");
		list.add("black");
			System.out.println(list);
			String element=list.remove(2);
			System.out.println(list);
			
		
		
	}

}*/ //[red, orange, white, black]

// ELEMENT PRESENT OR NOT 
 /*import java.util.*;
public class Collections {
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("orange");
		list.add("green");
		list.add("white");
		list.add("black");
		if(list.contains("red")) {
			System.out.println(" found");
		}
		else {
			System.out.println("not found");
		}
			
		
		
	}

}*/ // found
   

// SORT(ARRANGE ALAPHABET ORDER)ELEMENTS

  /*import java.util.*;
import java.util.List;
public class Collection {
	public static void main(String[]args)
	{
		List<String>list=new ArrayList<String>();
		list.add("red");
		list.add("orange");
		list.add("green");
		list.add("white");
		list.add("black");
		System.out.println(" list before sort:"+list);
		Collections.sort(list); 
		System.out.println(" after sort :"+list);	
	}

}*/ // after sort :[black, green, orange, red, white]

//COPYING TO ARRAYS

/*
 import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		System.out.println(" list1:"+list1);
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.add("e");
		System.out.println(" list2:"+list2);
		Collections.copy(list1,list2);
		System.out.println(" after copy");
		System.out.println(" list1 :"+list1);
		System.out.println(" list2 :"+list2);
	}	

}  // list1:[1, 2, 3, 4, 5]
list2:[a, b, c, d, e]
after copy
list1 :[a, b, c, d, e]
list2 :[a, b, c, d, e]*/

//SHUFFLE THE ARRAY
/*
   import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("orange");
		list.add("green");
		list.add("white");
		list.add("black");
	    System.out.println(list);
	    Collections.shuffle(list);
	    System.out.println(" after shuffle:\n"+list);
	}
}

[red, orange, green, white, black]
		 after shuffle:
		[white, black, orange, green, red]*/

//REVERSE PRINT  ELEMENTS IN COLLECTION

/* import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("orange");
		list.add("green");
		list.add("white");
		list.add("black");
	    System.out.println(list);
	    Collections.reverse(list);
	    System.out.println(" after shuffle:\n"+list);
	}
}

[red, orange, green, white, black]
		 after shuffle:
		[black, white, green, orange, red]*/

//PRINT FIRST 2 ELEMENTS

 /*import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("green");
		list.add("orange");
		list.add("white");
		list.add("black");
	    System.out.println( " original list:"+list);
	   List<String>sublist=list.subList(0,3);
	    System.out.println(" first 2 elements:\n"+sublist);
	}
}
original list:[red, green, orange, white, black]
first 2 elements:
[red, green, orange]*/

//TWO ARRRAYS ELEMENT PRESENT IN ARRRAY OR NOT
/*
import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("green");
		c1.add("orange");
		c1.add("white");
		c1.add("black");
		ArrayList<String>c2=new ArrayList<String>();
		c2.add("red");
	    c2.add("green");
		c2.add("orange");
		c2.add("black");
		ArrayList<String>c3=new ArrayList<String>();
		for(String s:c1)
		{
			c3.add(c2.contains(s)?"yes":"no");
			System.out.println(c3);
		}
		
	 
	}
}
[yes]
[yes, yes]
[yes, yes, yes]
[yes, yes, yes, no]
[yes, yes, yes, no, yes] */
/*
 
 
 //SWAP ELEMENTS IN COLLECTIONS
 import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		c1.add("white");
	    c1.add("black");
		for(String a:c1)
			System.out.println(a);
		Collections.swap(c1, 0, 2);
		System.out.println(" arraylist is after swap :");
		for(String b:c1) 
		{
			System.out.println(b);
			
		}
		
	}
	
} [green, orange,red, white, black]*/

//ADD TWO COLLECTIONS IN PRINT IN ONE COLLECTION

 /* import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		c1.add("white");
	    c1.add("black");
	    ArrayList<String>c2=new ArrayList<String>();
	    c2.add("red");
		c2.add("orange");
	    c2.add("black");
	    ArrayList<String>a=new ArrayList<String>();
	    a.addAll(c1);
	    a.addAll(c2);
	    System.out.println(a);
	    
	}
}

[red, orange, green, white, black, red, orange, black]
*/

//REMOVE ARRAY ALL ELEMENTS

 /*import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		c1.add("white");
	    c1.add("black");
	    System.out.println(c1);
	    c1.removeAll(c1);
	    System.out.println(c1);
	}
}*/

//ELEMENT PRESENT TRUE OR FALSE 

/*import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		c1.add("white");
	    c1.add("black");
	    System.out.println("original array list:"+c1);
	    System.out.println("original array empty or not:"+c1.isEmpty());
	    c1.removeAll(c1);
	    System.out.println("original array list afterremoveall:"+c1); 
	    System.out.println("original array empty or notafterremoveall :"+c1.isEmpty());
	}
}
original array list:[red, orange, green, white, black]
original array empty or not:false
original array list afterremoveall:[]
original array empty or notafterremoveall :true*/

//TRIM TO SIZE CAPACITY

/*
import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		c1.add("white");
	    c1.add("black");
	    System.out.println("original array list:"+c1);
	    System.out.println("let trim to size the above array:");
	    c1.trimToSize();
	    System.out.println(c1);
	}
}
original array list:[red, orange, green, white, black]
let trim to size the above array:
[red, orange, green, white, black]*/

//ADD INCRESING CAPACITY OF ARRAY

 /*import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		System.out.println(" original array list:"+c1);
		c1.ensureCapacity(5);
		c1.add("white");
	    c1.add("black");
	    System.out.println("new arraylist :"+c1);
	}
}
original array list:[red, orange, green]
new arraylist :[red, orange, green, white, black]*/


//REPLACE ELEMENT IN ONE TO ANOTHER

/*
import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		System.out.println("original arraylist:");
		System.out.println(c1);
		String newc1="white";
		c1.set(1, newc1);
		System.out.println("original afterreplace arraylist:");
		 int num=c1.size();
		 for(int i=0;i<num;++i)
		 {
			 System.out.println(c1.get(i));
		 }
	}
}

original arraylist:
[red, orange]
original afterreplace arraylist:
red
white */

//ITERATE THROUGH INDEX ELEMENTS

 /*import java.util.*;
public class Collection {
	public static void main(String[]args)
	{
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("red");
		c1.add("orange");
		c1.add("green");
		c1.add("white");
	    c1.add("black");
	    System.out.println("original list: "+c1);
	    for(int i=0;i<c1.size();++i)
	    {
	    	System.out.println(c1.get(i));
	    }
	}
}*/


