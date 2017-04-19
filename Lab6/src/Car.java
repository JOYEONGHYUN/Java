public class Car implements Valuable {


private String name;
private double price;

public Car(String name,double price)
{
	this.name = name;
	this.price = price;
}

	@Override
	public double estimateValue(int month) {
		// TODO Auto-generated method stub
		
		
		return this.price*0.8-price*0.01*month;
	}
	
	@Override
	public double estimateValue() {
		// TODO Auto-generated method stub
		
		
		return this.price*0.8-price*0.01;
	}
	

	@Override
	public String toString() {
		
		return "Car name : " + name + "\n " + "initial price:"+price;
	}
	

}
