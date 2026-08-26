class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int n=nums.length;
        int left = 1;
        int right = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = right;
            right = right*nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i] = ans[i]*left;
            left = left*nums[i];
        }
        return ans;
    }
}