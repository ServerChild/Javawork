package ex_20231027;

public class Tv_Ex03 {
	private String model;
	private int inch;
	private boolean power;
	private int channel;
	private int volume;
	
	// Tv 전원 on / off
	public void power() {
		power = !power;
		
		if(power)
			System.out.println("Tv를 켬");
		else
			System.out.println("Tv를 끔");
	}

	// getter, setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
