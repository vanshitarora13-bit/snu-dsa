public class arrayrotation {
    public static boolean check(int[] nums) {
        int drops = 0;
        int n = nums.length;
        
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] > nums[i+1]) {
                drops++;
            }
        }
        
        if(nums[n-1] > nums[0]) {
            drops++;
        }
        
        return drops <= 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(check(arr));
    }
}