public class Sandbox {
    public static void main(String[] args){
        // 1. Two Sum
        int[] numbers = {3, 2, 5};
        int target = 8;

        TwoSums twoSums = new TwoSums();
        int[] valuesForSum = twoSums.twoSums(numbers, target);

        for(int value : valuesForSum){
            System.out.println(value);
        }
    }
}
