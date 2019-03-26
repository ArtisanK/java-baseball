/**
 * �� Ŭ������ baseball ������ �����ϴ� Ŭ�����̴�.
 * start() �޼��带 �����ϸ� ������ ���۵ȴ�.
 * 
 *className PlayingGame
 *version 	1.0.0
 *Date		26/03/2019
 *author	�ǰ浿 
 */

import java.util.Scanner;
public class PlayingGame {
	
	private int stCount;
	private int ballCount;
	private RandomNumbers ranNum;
	private InputNumbers inNum;
	
	public void start() {
		gameSet();
		
		do {
			play();
			printCount();			
		} while (stCount != 3);		
		continueCheak();
	}
	
	private void gameSet() {
		ranNum = new RandomNumbers();			
	}
	
	private void play() {
		stCount = 0;
		ballCount = 0;
		
		System.out.print("���ڸ� �Է��� �ּ���:");		
		inNum = new InputNumbers();
			
		for(int i = 0; i < 3 ; i ++) {
			for(int j = 0 ; j <3 ; j++) {
				count(i,j);
			}
		}				
	}
	
	private void count(int i , int j) {		
		if(ranNum.num[i] == inNum.num[j]) {
			if(i == j) {
				stCount++;
			} else {
				ballCount++;
			}
		}
	}
	
	private void printCount() {		
		if(stCount == 0 && ballCount == 0) {
			System.out.println("����");
		} else {
			if(stCount != 0) {
				System.out.print(stCount + " ��Ʈ����ũ");
			}
			if(ballCount != 0) {
				System.out.print(ballCount + " ��");
			}
			System.out.println();
		}			
		
		if(stCount == 3) {
			System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
		}
	}
	
	private void continueCheak() {
		Scanner sc = new Scanner(System.in);
		int inputNum;
		
		System.out.println("������ ���� �����Ϸ��� 1,�����Ϸ��� 2�� �Է��ϼ���.");
		inputNum = sc.nextInt();
		if(inputNum == 1) {
			start();
		} else if(inputNum == 2) {}
	}
	
}
