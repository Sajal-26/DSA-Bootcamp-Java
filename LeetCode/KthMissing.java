// Description : Kth Missing Positive Number
// Link : https://leetcode.com/problems/kth-missing-positive-number/description/

class KthMissing {
    static int findKthPositive(int[] arr, int k) {
        int i = 1, c = 0, j = 0;
        while(c < k){
            if(j < arr.length && i == arr[j])
                j++;
            else
                c++;
            if(c < k)
                i++;
        }        
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr, 2));
    }
}