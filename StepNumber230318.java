package DailyChallengeCodes;
import java.util.*;
public class StepNumber230318 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int flag = 0;
        while(number >= 10) {
            int first = number % 10;
            number /= 10;
            int second = number % 10;
            if(Math.abs(first - second) != 1) {
                flag++;
                break;
            }
        }
        if(flag == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
	}
}
