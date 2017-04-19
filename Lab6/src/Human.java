public class Human implements Valuable {

	
	private String name;
	private int age;
	
	public Human(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public double estimateValue(int month) {
		// TODO Auto-generated method stub
		return Double.POSITIVE_INFINITY;
	}

	@Override
	public double estimateValue() {
		// TODO Auto-generated method stub
		return Double.POSITIVE_INFINITY;
	}

	
	@Override
	public String toString() {	
		
		return "Human name : " + name + "\n " + "registered age:"+age;
}
	
}
