package test4;

abstract class Vehicle {
	
	protected String name;
	protected int speed;
	
	public Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	
	public void start() {
		System.out.println(name + " 시동을 켭니다.");
	}
	
	public void stop() {
		System.out.println(name + " 정지합니다.");
	}
	
	public abstract void run();
}

class Bus extends Vehicle {
	
	public Bus(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void run() {
		System.out.println(name + "가 " + speed + "km 달립니다.");
	}
}

class Taxi extends Vehicle {
	public Taxi(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void run() {
		System.out.println(name + "가 " + speed + "km 달립니다.");
	}
}

public class Test06 {
	
	public static void main(String[] args) {
		
		Vehicle[] vehicles = { new Bus("버스", 60), new Taxi("택시", 80) };
				
		for (Vehicle v : vehicles) {			
			v.start();
			v.run();
			v.stop();
			System.out.println("-------------------");
		}
	}
}










