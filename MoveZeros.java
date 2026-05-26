public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        for(int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}