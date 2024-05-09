package sk.pre.java.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
	private ArrayList<LottoBall> balls;
	
	public void setBalls(ArrayList<LottoBall> balls) {
		this.balls = balls;
	}
	
	public void startMachine() {
		this.selectBalls();
	}
	
	private void selectBalls() {
		LottoBall[] selectedBalls = new LottoBall[6];
		LottoBall ball = null;
		for(int i=0;i<6;i++) {
			ball = this.getBall();
			ball.setSelected(true);
			selectedBalls[i] = ball;
		}
		this.printBalls(selectedBalls);
	}
	// 뽑힌 볼은 통에서 제거되므로 해당 내용을 표현할 수 있어야 한다.
	// 리스트에서 삭제 메소드를 사용하고
	// 공을 선택하기 위한 인덱스 범위는 현재 통의 크기를 동적으로 구해야 한다.
	private LottoBall getBall() {
		Random r = new Random();
		int index = r.nextInt(balls.size());
		
		return balls.remove(index);
	}
	
	private void printBalls(LottoBall[] balls) {
		System.out.println(Arrays.toString(balls));
	}
}







