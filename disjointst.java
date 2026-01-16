import java.util.HashSet;
import java.util.Set;

class disjointset {
    private int[] parent;
    private int[] rank;

    public disjointset(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++){
            parent[i] =i;

        }
    }
    public int find(int x){
        if(parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }
    public void unite(int x,int y){
        int xRoot =find(x);
        int yRoot = find(y);

        if(xRoot == yRoot)
            return;


        if(rank[xRoot] < rank[yRoot])
            parent[xRoot] = yRoot;

        else if(rank[yRoot] < rank[xRoot])
            parent[yRoot] = xRoot;
        else{
            parent[yRoot]= xRoot;
            rank[xRoot]++;
        }

    }
    
}
public class disjointst{

        
    
    public static int countIslands(char[][] grid){
        int n= grid.length;
        int m= grid[0].length;
        disjointset ds = new disjointset(n*m);
        

        int[][] directions ={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,-1},{1,1}};
        for(int r= 0;r<n;r++){
            for(int c=0;c<m;c++){
                if(grid[r][c] ==  'L'){
                    for(int[] dir : directions){
                        int nr= r+ dir[0],nc = c+dir[1];

                        if(nr >=0 && nr <n && nc >=0 && nc<m &&grid[nr][nc] =='L')
                            ds.unite(r*m + c,nr * m+ nc);
                    }
                }
            }
        }
        

        Set<Integer> uniqueIslands = new HashSet<>();
        for(int r=0;r<n;r++){
            for(int c= 0;c<m;c++){
                if(grid[r][c] =='L')
                    uniqueIslands.add(ds.find(r*m+c));
            }
        }
        return uniqueIslands.size();
    }
    public static void main(String[] args) {
        char[][] grid = {{'L','L','W','W','W'},{'W','L','W','W','L'},{'L','W','W','L','L'},{'W','W','W','W','W'},{'L','W','L','L','W'}};

        System.out.println(countIslands(grid));
    }
        
    }


    

