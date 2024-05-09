package sk.pre.java.lotto2;

import java.util.ArrayList;

public class Studio {
	private int ballCount;
	private int selectCount;
	
	public Studio(int ballCount,int selectCount) {
		this.ballCount = ballCount;
		this.selectCount = selectCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio studio = new Studio(45,6);
		studio.onAir();
	}
	
	public void onAir() {
		//추첨이 진행되는 곳
		LottoMachine machine = this.readyOnAir();
		System.out.println("지금부터 XXX회 로또 추첨을 시작합니다.");
		LottoBall[] selectedBalls = machine.startMachine();
		System.out.println("6개의 공이 모두 뽑혔습니다.");
		System.out.println("뽑힌 공은  ");
		for(LottoBall ball : selectedBalls) {
			System.out.print(ball.getNumber()+" ");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("입니다.");
		System.out.println("로또 추첨을 마칩니다.");
	}
	
	
	public LottoMachine readyOnAir() {
		//방송준비 
		//로또머신과 공을 준비한다.
		LottoMachine machine = new LottoMachine(selectCount);
		machine.setBalls(this.makeBalls(ballCount));
		return machine;
	}
	
	private ArrayList<LottoBall> makeBalls(int ballCount) {
		ArrayList<LottoBall> ballBox = null;
		ballBox = new ArrayList<LottoBall>();
		for(int i=0;i<ballCount;i++) {
			ballBox.add(new LottoBall(i+1));
		}
		return ballBox;
	}

}
