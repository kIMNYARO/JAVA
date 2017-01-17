package templatemethodpattern;

public abstract class Human {

	public void makefriends(){ // 전체 로직을 담당하는 method -> template method
		dress();
		search();
		doAction();
		confess();
	}
	
	public void dress(){
		System.out.println("옷을 입어요!!");
	}
	
	public void confess(){
		System.out.println("고백을 해요.");
	}
	
	public abstract void search(); // 각각
	public abstract void doAction();
	
	
}
