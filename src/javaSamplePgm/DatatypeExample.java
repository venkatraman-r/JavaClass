package javaSamplePgm;

public class DatatypeExample 
{
	
   static int a=15;
   static int b=15;
   static int c; 
    
    public static int addition()
    {
    	
    	c=a+b;
    	return c;
    }
    
	public static void main(String[] args) 
	{
		//DatatypeExample objname = new DatatypeExample();
		System.out.println(addition());
	}

}
