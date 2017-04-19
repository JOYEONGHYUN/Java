public interface Valuable {

	
	// 각 사물의 가치를 추산하는 메소드 , 사물에 따라 가치를 추산하는 공식이 다르다.

	public abstract double estimateValue(int month);

	public abstract double estimateValue();

}
