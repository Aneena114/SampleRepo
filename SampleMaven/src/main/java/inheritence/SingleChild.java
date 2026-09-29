package inheritence;

public class SingleChild  extends SingleParent{
public void show() {
	System.out.println("ok");
}
	public static void main(String[] args) {
	SingleChild obj = new SingleChild();	
    obj.display();
    obj.show();
	}

}
