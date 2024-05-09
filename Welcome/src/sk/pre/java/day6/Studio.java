package sk.pre.java.day6;

import java.util.ArrayList;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio studio = new Studio();
		studio.onAir();
	}
	
	public void onAir() {
		//추첨이 진행되는 곳
		LottoMachine machine = this.readyOnAir();
		machine.startMachine();
	}
	
	
	public LottoMachine readyOnAir() {
		//방송준비 
		//로또머신과 공을 준비한다.
		LottoMachine machine = new LottoMachine();
		machine.setBalls(this.makeBalls());
		return machine;
	}
	
	private ArrayList<LottoBall> makeBalls() {
		ArrayList<LottoBall> ballBox = null;
		ballBox = new ArrayList<LottoBall>();
		for(int i=0;i<45;i++) {
			ballBox.add(new LottoBall(i+1));
		}
		return ballBox;
	}

}
