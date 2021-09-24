package Task;

public class varargs {
	  static void fun2(String str, int ...a)
	    {
	        System.out.println("String: " + str);
	        System.out.println("Number of arguments is: "+ a.length);
	  
	      
	        for (int i: a)
	            System.out.print(i + " ");
	  
	        System.out.println();
	    }
	  
	    public static void main(String args[])
	    {
	      
	        fun2("unknown", 100, 200);
	        fun2("portal", 1, 2, 3, 4, 5);
	        fun2("geekster");
	    }
}

