public class floodfill {
    static void ff(int[][] img,int x,int y,int oldColor,int newColor){
        if(x<0 || x>= img.length || y<0 || y>=img[0].length || img[x][y] != oldColor){
            return;
        }
        img[x][y]= newColor;

        ff(img, x+1, y, oldColor, newColor);
         ff(img, x+1, y, oldColor, newColor);
          ff(img, x, y+1, oldColor, newColor);
           ff(img, x, y-1, oldColor, newColor);
    }
    static int[][] floodsfill(int[][] img,int sr,int sc,int newColor){

        if(img[sr][sc]== newColor){
            return img;
        }
        int oldColor = img[sr][sc];
        ff(img, sr, sc, oldColor, newColor);

        return img;
    }
    public static void main(String[] args) {
        int[][]img ={{1,1,1,0},{0,1,1,1},{1,0,1,1}};
    
        int sr=1;
        int sc=2;
        int newColor =2;

        int[][]result = floodsfill(img, sr, sc, newColor);

        for(int[] row :result){
            for(int pixel: row){
                System.out.println(pixel +" ");

            }
            System.out.println();
        }
    }
    
}
