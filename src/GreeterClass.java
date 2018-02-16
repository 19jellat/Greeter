
public class GreeterClass {

	private String name;
	private int age;
	
	public GreeterClass (){
		name = "BOB";
		age = 10;
	}
	
	public GreeterClass (String x, int y){
		name = x;
		age = y;
	}

	public String toString(){
		return name + age;
	}
	
}
