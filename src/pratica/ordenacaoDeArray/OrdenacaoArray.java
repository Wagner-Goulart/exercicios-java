package pratica.ordenacaoDeArray;

import java.util.Arrays;

public class OrdenacaoArray {
    static int[] nums = { 2,6,8,190,1};
    public static void main(String[] args) {
        Arrays.sort(nums);
        for(int num : nums) {
            System.out.println(num);
        }
    }
}
