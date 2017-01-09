package prob1;
import java.util.*;
public class Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		
		int price[]={50000,10000,5000,1000,500,100,50,10,5,1};
		int temp = won,temp2=won;
		for(int i=0;i<price.length;i++){
			temp = temp2/price[i];
			System.out.println(price[i]+"원 :"+temp);
			temp2=temp2%price[i];
		}
	}
}