
public class Referencevsprimitive {
	
	public Referencevsprimitive(int a, int b, int c) {
	
	}
	Referencevsprimitive d = new Referencevsprimitive(2, 17, 1948); //creates
	
	Referencevsprimitive birthday = d; //birthday and d point to the data {2, 17, 1948}
	//This can cause problems if one is changed, so if birthday wants to make a copy of the object
	//it can do
	
//	Referencevsprimitive newbirthday = new Referencevsprimitive(d.getMonth(), d.getDay(), d.getYear());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3;
		int num2 = num;

	}

}
