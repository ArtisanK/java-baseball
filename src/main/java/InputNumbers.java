/**
 * �� Ŭ������ 3���� ���� �ٸ� ���� �Է¹ޱ����ϳ� Ŭ�����̴�.
 * Ŭ���� ������ ���ÿ� ���ӵ� 1~9 ������ ���� �ٸ� �ڿ����� �Է¹޾� �迭�� �����Ѵ�.
 * 
 *className InputNumbers
 *version 	1.0.0
 *Date		26/03/2019 
 *author	�ǰ浿 
 */
import java.util.Scanner;

public class InputNumbers {
	int[] num = new int[3];		

	public InputNumbers() {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		for(int i = 0 ; i < 3 ; i++) {
			this.num[i] = temp.charAt(i)-48;
		}
	}
}
