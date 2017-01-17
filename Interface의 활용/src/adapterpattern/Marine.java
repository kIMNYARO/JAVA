package adapterpattern;

public class Marine implements TerranInterface {

	@Override
	public void attack() {
		System.out.println("총을 쏴요!! 따당따당..!!");
		
		
	}

	@Override
	public void move() {
		System.out.println("깡총깡총");
		
	}
	
	

	
}
