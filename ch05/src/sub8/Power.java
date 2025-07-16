package sub8;

public class Power implements Socket {
	
	private Bulb bulb;
	
	public Power(Bulb bulb) {
		this.bulb = bulb;
	}	

	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

}
