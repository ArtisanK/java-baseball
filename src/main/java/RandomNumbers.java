/**
 * �� Ŭ������ 3���� ���� �ٸ� ���ڸ� �ڿ����� �����ϱ� ���� Ŭ�����̴�.
 * Ŭ���� ������ ���ÿ�  1~9 ������ ���� �ٸ� �ڿ����� �����Ͽ� �迭�� �����Ѵ�.
 * 
 *className RandomNumbers
 *version 	1.0.0
 *Date		26/03/2019
 *author	�ǰ浿 
 */

import java.util.Random;

public class RandomNumbers {
	int[] num = new int[3];
	
	public RandomNumbers() {
		Random random = new Random();
		for(int i = 0 ; i < 3 ;) {
			int temp = random.nextInt(9)+1;
			if((this.num[0] != temp) && (this.num[1] != temp) && (this.num[2] != temp)) {
				this.num[i] = temp;
				i++;
			} else {
				continue;
			}
		}		
	}
}
