package staticdemos;

public class StatDemo 
{
	static int x; //global, class variable
	//shares across all the instances.
    int y; //instance
    static void setValues()
    {
    	x=100;
    	//y=200; //can't access non static variables
    }
    void setVals()
    {
    	x=200;
    	y=100;
    }
	public static void main(String[] args) 
	{
		StatDemo s1=new StatDemo();
		StatDemo s2=new StatDemo();
		StatDemo s3=new StatDemo();
		StatDemo.setValues();
		s1.setVals();
		
		//s1.x=200;
		//s2.x=300;
		 
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
		
		System.out.println(StatDemo.x);
		System.out.println(x);
		}

     }
