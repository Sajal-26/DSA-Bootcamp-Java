// Link : https://leetcode.com/problems/search-a-2d-matrix/description/
// description : Search a 2D Matrix

public class SearchSorted2d {
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        if(rows == 1)
            return binarysearch(matrix, 0, target, 0, cols-1);
        
        int rstart = 0, rend = rows - 1, cmid = cols / 2;

        while(rstart < rend - 1){
            int mid = rstart + (rend - rstart) / 2;
            if(matrix[mid][cmid] == target)
                return true;
            else if(matrix[mid][cmid] > target)
                rend = mid;
            else
                rstart = mid;
        }

        if(matrix[rstart][cmid] == target)
            return true;

        else if(cmid > 0 && matrix[rstart][cmid - 1] >= target)
            return binarysearch(matrix, rstart, target, 0, cmid - 1);
        
        else if(cmid < cols-1 && matrix[rstart][cmid + 1] <= target && matrix[rstart][cols - 1] >= target)
            return binarysearch(matrix, rstart, target, cmid + 1, cols-1);

        else if(rstart < rows-1 && matrix[rstart + 1][cmid] == target)
            return true;
        
        else if(rstart < rows - 1 && cmid > 0 && matrix[rstart + 1][cmid - 1] >= target)
            return binarysearch(matrix, rstart + 1, target, 0, cmid - 1);
        
        else if(rstart < rows - 1 && cmid < cols - 1 && matrix[rstart + 1][cmid + 1] <= target && matrix[rstart + 1][cols - 1] >= target)
            return binarysearch(matrix, rstart + 1, target, cmid + 1, cols-1);

        return false;
    }

    static boolean binarysearch(int[][] matrix, int row, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] > target)
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 3));
    }
}
