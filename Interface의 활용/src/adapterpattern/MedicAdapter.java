package adapterpattern;

public class MedicAdapter implements TerranInterface{

	private MedicInterface medic; 
	// 메딕 인터페이스의 인스턴스를 필드로 가진다
	
	
	public MedicAdapter(MedicInterface medic){
		this.medic = medic;
	}
	
	@Override
	public void attack() {
		medic.heal(); 		
	}

	@Override
	public void move() {
		medic.move();
		
	}

	// 이 클래스를 통해서 
	
}
