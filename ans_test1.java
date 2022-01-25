import java.util.*;
public class MyFunction {
    public static int[] getNotZero(int[] nums) {
        int[] copy_nums = nums;
        ArrayList<Integer> list_result = new ArrayList<Integer>();
        for (int number : nums) {
            int counter = 1;
            for (int numb : copy_nums) {
                if (number - numb < 0) {
                    break;
                }
                if (counter == nums.length) {
                    list_result.add(number);
                }
                counter++;
            }
        }
        int[] result = new int[list_result.size()];
        for (int i = 0; i < list_result.size(); i++)
            result[i] = list_result.get(i);
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 2 };
        System.out.println(Arrays.toString(getNotZero(nums)));
    }

}