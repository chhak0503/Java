package sub1;

//치환변수 T를 갖는 제네릭 클래스
public class FruitBox<T> { 
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
