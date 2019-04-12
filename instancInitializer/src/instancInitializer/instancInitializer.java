package instancInitializer;
//http://www.javatpoint.com/instance-initializer-block
class bike{
	int speed;
	bike(){ System.out.println(" speed " + speed);
	
	}
	{speed = 100;}
}

public class instancInitializer {
	public static void main(String[] args) {
		bike b1 = new bike();
		bike b2 = new bike();
		
		/**
		 * There are three places in java where you can perform operations:

    1-method
    2-constructor
    3-block

		 */
		
		
	}

}
