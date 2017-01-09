package prob5;

import java.util.*;

public class Prob5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			Random r = new Random();
			int k = r.nextInt(100)+1
					;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int max = 100, min = 0;

			for (int i = 1;; i++) {
				System.out.println(min + "-" + max);
				System.out.print(" " + i + " >> ");
				int num = sc.nextInt();
				if (num > k) {
					System.out.println("더 낮게");
					max = num;
				}
				if (num < k) {
					System.out.println("더 높게");
					min = num;
				}
				if (num == k) {
					System.out.println("맞췄습니다.");
					System.out.println("다시하시겠습니다?(y/n)");
					if (sc.next().equals("y")) {
						break;
					} else {
						System.out.println("종료");
						System.exit(0);
					}
				}
			}
		}
	}
}
