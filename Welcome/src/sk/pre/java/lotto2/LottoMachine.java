package sk.pre.java.lotto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
	private ArrayList<LottoBall> balls;
	private int selectCount;
	
	public LottoMachine(int selectCount) {
		this.selectCount = selectCount;
	}
	
	public void setBalls(ArrayList<LottoBall> balls) {
		this.balls = balls;
	}
	
	public LottoBall[] startMachine() {
		return this.selectBalls(selectCount);
	}
	//공을 뽑는 시간을 추가하여 코딩하시오
	//시간은 매번 틀리게 적용합니다.(1~5초사이)
	//공이 뽑히면 공의 번호 출력하고
	//모든 공이 뽑히면 아나운서가 뽑힌 공을 오름차순으로 발표하고 마치는 것으로 코딩하시오
	private LottoBall[] selectBalls(int selectCount) {
		LottoBall[] selectedBalls = new LottoBall[selectCount];
		LottoBall ball = null;
		Random r = new Random();
		for(int i=0;i<selectCount;i++) {
			System.out.print("공을 뽑는 중입니다...  ");
			int time = r.nextInt(4001)+1000;
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			ball = this.getBall();
			ball.setSelected(true);
			System.out.println(ball.getNumber());
			selectedBalls[i] = ball;
		}
		//this.printBalls(selectedBalls);
		return selectedBalls;
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







