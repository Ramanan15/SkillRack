package DailyChallengeCodes;
import java.util.*;
public class FrequentSortNumbers290318 {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int noOfElements = in.nextInt();
        int[] arr = new int[noOfElements];
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        for(int i = 0; i < noOfElements; i++) {
            arr[i] = in.nextInt();
            tSet.add(arr[i]);
        }
        Iterator itr = tSet.iterator();
        ArrayList<Integer> aList1 = new ArrayList<Integer>();
        ArrayList<Integer> aList2 = new ArrayList<Integer>();
        ArrayList<Integer> aList3 = new ArrayList<Integer>();
        while(itr.hasNext()) {
            int temp = (int)itr.next();
            aList1.add(temp);
            int count = 0;
            for(int i = 0; i < noOfElements; i++) {
                if(temp == arr[i]) {
                    count++;
                }
            }
            aList2.add(count);
            aList3.add(count);
        }
        System.out.println(aList1);
        Collections.sort(aList2);
        for(int i = aList2.size() - 1; i >= 0; i--) {
            for(int j = 0; j < aList3.size(); j++) {
                if(aList2.get(i) == aList3.get(j)) {
                    for(int k = 0; k < aList2.get(i); k++) {
                        System.out.print(aList1.get(j) + " ");
                    }
                    aList3.set(j, 0);
                    break;
                }
            }
        }
	}
}

/*

8
2 1 2 8 7 3 7 2

*/