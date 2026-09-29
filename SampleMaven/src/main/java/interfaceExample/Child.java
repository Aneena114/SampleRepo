package interfaceExample;

public class Child implements Parent {
	public void show() {
	System.out.println("show");}

	public static void main(String[] args) {
	Child obj = new	Child();
	obj.display();
	obj.print();
	obj.show();
	//Reference Creation
	//syntax - Interfacename objectname = new className();
	Parent obj1 = new Child();
	obj.display();
	obj.print();

	}

	@Override
	public void print() {
	System.out.println("hello");	
		
	}

	@Override
	public void display() {
	System.out.println("java");	
		
	}

}
