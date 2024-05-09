package sk.pre.java.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoMachine {
	//private LottoBall[] balls;
//	public void setBalls(LottoBall[] balls) {
//		this.balls = balls;
//	}
	
	// 뽑힌 공이 비복원(다시 통에 넣지 않고 추첨)가능하게
	private ArrayList<LottoBall> balls;
	
	public void setBalls(ArrayList<LottoBall> balls) {
		this.balls = balls;
	}
	
	
	
//	public LottoBall[] getBalls() {
//		return balls;
//	}
	
	public void selectBallsV2() {
		LottoBall[] selectedBalls = new LottoBall[6];
		//공을 섞는 과정 -> 메소드가 아니라 필드를 바로 shuffle처리 가능함
		//this.shuffle();
		Collections.shuffle(balls);
		//공을 하나 뽑는 과정 -> 하나의 메소드(6회 반복)
		LottoBall ball = null;
		for(int i=0;i<6;i++) {
			ball = this.getBall();
			//선택된 공을 중복처리할 필요가 없으므로 삭제가능한 컬렉션을 사용할 경우
			//공 클래스는 중복여부에 대한 정보를 저장할 필요가 없다.
			selectedBalls[i] = ball;
		}
		
		System.out.println("selected balls : ");
		for(LottoBall temp : selectedBalls) {
			System.out.print(temp.getNumber()+" ");
		}
				
	}
	public void selectBallsV2Old() {
		LottoBall[] selectedBalls = new LottoBall[6];
		//공을 섞는 과정 ->하나의 메소드
		this.shuffle();
		//공을 하나 뽑는 과정 -> 하나의 메소드(6회 반복)
		LottoBall ball = null;
		int index = 0;
		while(true) {
			ball = this.getBall();
			boolean flag = false;
			flag = ball.isSelected();
			if(!flag) {
				ball.setSelected(true);
				selectedBalls[index] = ball;
				index = index + 1;
			} 
			// 빠져나올 조건
			if(index==6) {
				break;
			}
		}
		
		System.out.println("selected balls : ");
		for(LottoBall temp : selectedBalls) {
			System.out.print(temp.getNumber()+" ");
		}
				
	}
	
	//볼을 뽑는 행동
	public void selectBalls() {
		LottoBall[] selectedBalls = new LottoBall[6];
		//공을 섞는 과정 ->하나의 메소드
		this.shuffle();
		//공을 하나 뽑는 과정 -> 하나의 메소드(6회 보ㄱ)
		LottoBall ball = null;
		for(int i=0;i<6;i++) {
			 ball = this.getBall();
			 if(i==0) {
				 selectedBalls[i] = ball;
				 continue;
			 }
			//뽑은 공의 중복을 처리해야 함 -> 여기서 처리
			//공이 중복인지는 가지고 있는 공을 모두 검사해야 함 
			boolean flag = false;
			for(int n=0;n<i;n++) {
				if(ball.getNumber()==selectedBalls[n].getNumber()) {
					flag = true;
					break;
				} 
			}
			//모두 검사한 결과를 가지고 공을 보관할 것인지 결정
			//중복이면 인덱스를 하나 감소(그렇게 해야지 해당 인덱스가 비는 것을 방지할 수 있다)
			if(!flag) {
				selectedBalls[i] = ball;
			} else {
				i = i - 1;
			}	
		}
		
		System.out.println("selected balls : ");
		for(LottoBall temp : selectedBalls) {
			System.out.print(temp.getNumber()+" ");
		}
				
	}

	private LottoBall getBall() {
	// TODO Auto-generated method stub
		LottoBall ball = null;
		Random r = new Random();
		// ball을 가지고 있는 통의 크기가 변하므로 동적으로 통에 든 공의 갯수를 파악해야 함
		int index = r.nextInt(balls.size());
		//ball = balls[index];
		ball = balls.get(index);
		return ball;
	}

	private void shuffle() {
		// TODO Auto-generated method stub
		Random r = new Random();
		Collections.shuffle(balls);
//		for(int i=0;i<10;i++) {
//			int index1 = r.nextInt(45);
//			int index2 = r.nextInt(45);
//			LottoBall temp = balls.get(index1);
//			balls.set(index1, balls.get(index2));
//			balls.set(index2, temp);
//			
////			LottoBall temp = balls[index1];
////			balls[index1] = balls[index2];
////			balls[index2] = temp;
//		}
	}
	
	
	
}
