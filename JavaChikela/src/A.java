
public class A {
    
	static int x=1;
	 
	static int z=1;
	static int k=1;
	
	
	A(){
		this(0);
		System.out.println("This is a null constructor");
		
	}
	A(int x){
		this(0,0);
		System.out.println("This is one Argument constructor");
	}
	
	A(int x,int y){
	
		System.out.println("this is a two argument constructor ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=1;
	    System.out.println(x++);
	    System.out.println(y-- - --y );
	    System.out.println(++z);
	    System.out.println(--k);
	    
	    
		A a= new A();
	}

}
