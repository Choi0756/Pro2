package sk.pre.java.lotto;

import java.util.ArrayList;

public class Studio {
	private LottoMachine machine;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio mbc = new Studio();
		mbc.readyOnAir();
		mbc.onAir();
	}
	
	public void readyOnAir() {
		//기계 준비 (볼을 가진)
		machine = new LottoMachine();
		ArrayList<LottoBall> balls = this.readyBall();
		machine.setBalls(balls);
	}
	
	public void onAir() {
		//방송시작
		this.startMachine();

	}
	
	public void startMachine() {
		// 로또 추점 시작
		machine.selectBallsV2();
	}
	
	public ArrayList<LottoBall> readyBall() {
		//LottoBall 준비
		ArrayList<LottoBall> ballBox = new ArrayList<LottoBall>();
		for(int i=0;i<45;i++) {
			ballBox.add(new LottoBall(i+1));
		}
		return ballBox;
	}
	
	public LottoBall[] readyBallOld() {
		//LottoBall 준비
		LottoBall[] ballBox = new LottoBall[45];
		for(int i=0;i<45;i++) {
			ballBox[i] = new LottoBall(i+1);
		}
		return ballBox;
	}

}
