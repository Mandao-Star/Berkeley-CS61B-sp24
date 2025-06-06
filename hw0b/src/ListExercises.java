import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int total = 0;

        for(int num: L){
            total += num;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<Integer>();

        for(int num: L){
            if(num % 2 == 0){
                result.add(num);
            }
        }
        return result;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> result = new ArrayList<Integer>();
        for(int num: L1){
            if(L2.contains(num) && !result.contains(num)){
                result.add(num);
            }
        }

        return result;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for(String str: words){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }
}
