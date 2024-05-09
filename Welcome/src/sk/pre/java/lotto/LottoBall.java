package sk.pre.java.lotto;

public class LottoBall {
	private int number;
	//뽑힌 정보를 스스로 관리(중복처리) version2에 추가
	private boolean isSelected;
	
	
	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public LottoBall(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
//	public void setNumber(int number) {
//		this.number = number;
//	}
	
}
