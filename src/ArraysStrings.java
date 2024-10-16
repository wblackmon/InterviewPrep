import java.util.Arrays;

public class ArraysStrings {
    public  static int[] sortedSquares(int[] nums) {

        return null;
    }
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right  && right > 0)
        {
            if(left < s.length) {
                char c = s[left];
                s[left] = s[right];
                s[right] = c;
                left++;
                right--;
            }


        }
        System.out.println(Arrays.toString(s));
    }
}
