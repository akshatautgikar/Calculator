
class Calculate{
	int a;
	int b;
	
	int addition(int a, int b) {
		this.a = a;
		this.b = b;
		int sum = a + b;
		return sum;
	}
	
	int subtraction(int a, int b) {
		this.a = a;
		this.b = b;
		int diff = a - b;
		return diff;
}

	int sum = this.addition(10, 20);
	void displaySum() {
		System.out.println("The addition of given numbers is: " + sum);
	}
	
	int diff = this.subtraction(10, 20);
	void displayDiff() {
		System.out.println("The subtraction of given numbers is: " + diff);
	}

}
public class Calculator {

	public static void main(String[] args) {
		
		Calculate c = new Calculate();
		
		//c.addition(10, 100);
		c.displaySum();

	}

}
