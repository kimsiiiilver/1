package sec02;

import java.util.Scanner;

public class For확인문제1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(1~100사이)");
		int num = s.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합계는 : %d 입니다.",num,sum);
	}

}
