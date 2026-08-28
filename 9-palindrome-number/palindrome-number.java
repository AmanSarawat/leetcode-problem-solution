class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }  
        int origanalNum = x;
        int reverse = 0;
        while(x>0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x = x/10;
        }
        if(origanalNum == reverse){
            return true;
        }
        else{
            return false;
        }   
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        isPalindrome(x);

    }
}