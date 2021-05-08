
public class DynamicBinding {

	public class FastFood {
		public void create() {
			System.out.println("Creating in FastFood class");
		}
	}
	public class Pizza extends FastFood {
		public void create() {
			System.out.println("Creating in Pizza class");
		}	
	}
	public class Main {
		public void main(String[] args) {
			FastFood fastFood = new FastFood();
			fastFood.create();
			//Dynamic binding
			FastFood pza= new Pizza(); //in this case, object pza is referred to
			pza.create();
		}
	}
	//Dynamic binding is a run-time decision to choose which instance method to call
	
	
	//Overloading is an example of static binding
	//Method overriding is an example of dynamic binding

}
