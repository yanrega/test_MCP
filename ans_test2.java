import java.util.*;

public class MyFunction {
    public static int[] doesNotReturnX(int[] nums, int x) {
        int[] copy_nums = nums;
        ArrayList<Integer> list_result = new ArrayList<Integer>();
        for (int number : nums) {
            int counter = 1;
            for (int numb : copy_nums) {
                if (number / numb == x) {
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
        int[] nums = { 1, 2, 3, 4 };
        int x = 4;
        System.out.println(Arrays.toString(doesNotReturnX(nums,x)));
    }

}