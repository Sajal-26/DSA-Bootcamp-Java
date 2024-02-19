// Link : https://leetcode.com/problems/find-in-mountain-array/description/
// Discription : Find in Mountain Array

interface MountainArray {
    public int get(int index);
    public int length();
}

class Mountain implements MountainArray{
    
    private int[] arr;
    
    public Mountain(int[] arr){
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

public class BitonicSearch {

    static int peak(MountainArray arr){
        int start = 0, end = arr.length() - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr.get(mid) > arr.get(mid + 1))
                end = mid;
            else 
                start = mid + 1;
        }
        return end;
    }

    static int search(MountainArray arr, int target, int start, int end, boolean accending){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr.get(mid) == target)
                return mid;
            else if(accending){
                if(arr.get(mid) > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else{
                if(arr.get(mid) > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr);
        int ans = search(mountainArr, target, 0, peak, true);
        if(ans != -1)
            return ans;
        return search(mountainArr, target, peak+1, mountainArr.length()-1, false);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        Mountain array = new Mountain(arr);
        int target = 3;
        System.out.println(findInMountainArray(target, array));
    }
}
