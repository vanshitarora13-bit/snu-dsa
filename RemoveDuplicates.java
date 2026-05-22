public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        
        return k + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(arr);
        
        System.out.print("Array: ");
        for(int i = 0; i <= k-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Count: " + k);
    }
}