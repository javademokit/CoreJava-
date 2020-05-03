package Top_10_Interview_basic;

public class Car
{
	private String type;
	private String color;

	public Car(String type, String color) {
	    super();
	    this.type = type;
	    this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) { 
	    if (this.getClass() == obj.getClass()){
	        Car other =(Car)obj;
	        if(this.color.equals(other.color) && this.type.equals(other.type)){
	            return true;
	        }
	    }
	    return false;
	}
	public static void main(String[] args) {
		
	    Car car1 = new Car("Suv","Green");
	    Car car2 = new Car("Suv","Green");
	    System.out.println(car1.equals(car2)); //true
	}
}
