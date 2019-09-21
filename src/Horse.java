public class Horse {
	String name;
	double speed;
	double distance;

	public Horse(String name, double speed, double distance) {
		this.name = name;
		this.speed = speed;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void move(){
		distance += getSpeed() * Math.random();
	}

	public void print(){
		int dots = (int)getDistance();
		for(int i = 0; i < dots; i++)
			System.out.print(".");
		System.out.println(getName());
	}
}
