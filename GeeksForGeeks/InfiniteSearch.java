// Link : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Discription : Find position of an element in a sorted array of infinite numbers

public class InfiniteSearch {
    static int search(int[] arr, int target){
        int start = 0, end = 1;
        try{
            while(target > arr[end]){
                int newstart = end + 1;
                end += (end - start + 1) * 2;
                start = newstart;
            }
        } catch(ArrayIndexOutOfBoundsException e){
            end--;
        }
        end--;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 170;
        System.out.println(search(arr, target));
    }
}
