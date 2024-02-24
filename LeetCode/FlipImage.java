// Link : https://leetcode.com/problems/flipping-an-image/description/
// Description : Flipping an Image

public class FlipImage {
    static int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image)
            for(int i=0; i < (image[0].length+1)/2 ;i++){
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;
            }
        
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        image = flipAndInvertImage(image);
        for(int[] i : image){
            for(int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
