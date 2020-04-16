import java.util.Hashtable;

public class TwoSums {
    /*
        Looks if the target sum can be met by taking two of the values from an array.
        The values are added to a hashtable with the number as the key and the index as value.
        If a complement value for the index value is found in the hashtable an array with the two indexes is returned.
        If no pair is found then an exception is thrown.

        worst = O(n)
        best = O(1)
    */
    public int[] twoSums(int[] arr, int target){
        Hashtable<Integer, Integer> numbers = new Hashtable<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(numbers.containsKey(complement)){
                return new int[] {arr[numbers.get(complement)], i};
            }
            numbers.put(arr[i], i);
        }
        throw new IllegalArgumentException("No 2 values for target sums");
    }
}
