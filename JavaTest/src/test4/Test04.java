package test4;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(name + " - 멍멍!");
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(name + " - 야옹!");
	}
}

public class Test04 {
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog("순돌이"); // 업캐스팅(다형성)
		Animal a2 = new Cat("야옹이");
		
		if (a1 instanceof Dog) {
			Dog d = (Dog) a1; // 다운캐스팅
			d.sound();
		}
		
		if (a2 instanceof Cat) {
			Cat c = (Cat) a2;
			c.sound();
		}
	}
	
}













