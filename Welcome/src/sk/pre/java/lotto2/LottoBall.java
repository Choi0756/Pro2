package sk.pre.java.lotto2;

public class LottoBall {
	private int number;
	private boolean isSelected;
	
	public LottoBall(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return number+", "+isSelected;
	}
}
