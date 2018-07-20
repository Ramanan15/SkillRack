package DailyChallengeCodes;
import java.util.*;
public class CutTheCake010718 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int sizeOfCake = in.nextInt();
        int totalCuts = in.nextInt();
        int max = totalCuts;
        while(in.hasNext()) {
            int temp = in.nextInt();
            int currCut = Math.abs(totalCuts - temp);
            if(currCut > max) {
                max = currCut;
            }
            totalCuts = temp;
        }
        if(Math.abs(totalCuts - sizeOfCake) > max) {
            max = Math.abs(totalCuts - sizeOfCake);
        }
        System.out.println(max);
	}
}

/*

Cut the Cake

Initial size of a cake and values of position of N cuts are passed as the input. 
The program must print the size of largest cake piece after the N cuts.

Boundary Condition(s):
10 <= N <= 999999

Input Format:
The first line contains the size of cake.
The second line contains the values of position of N cuts in ascending order.

Output Format:
The first line contains the size of largest cake piece.

Example Input/Output 1:
Input:
16 
3 5 8

Ouput:
8

Explanation :
After the first cut the size of piece 1 is 3, after the second cut the size of piece 2 is 2,after the third cut the size of piece 3 is 3 and after the fourth cut the size of piece 4 is 8. Finally the largest cake piece is 8.

Example Input/Output 2:
Input:
25
5 10 16 

Ouput:
9

Explanation :
After the first cut the size of piece 1 is 5, after the second cut the size of piece 2 is 5,after the third cut the size of piece 3 is 6 and after the fourth cut the size of piece 4 is 9. Finally the largest cake piece is 9.

*/