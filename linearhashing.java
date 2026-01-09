import java.util.*;
public class linearhashing{
    private List<List<Integer>> table;
    private int level;
    private  int split;
    private int bucketSize = 2;
    
    public linearhashing(){
        table = new ArrayList<>();
        table.add(new ArrayList<>());
        table.add(new ArrayList<>());
        level =1;
        split =0;

    }
    private int hash(int key){
        int h = key% (int)Math.pow(2, level);
        if(h<split){
            h= key % (int)Math.pow(2, level+1);
        }
        return h;
    }
    public void insert(int key){
        int index = hash(key);

        while(index >= table.size()){
            table.add(new ArrayList<>());
        }
        table.get(index).add(key);

        if(table.get(index).size() > bucketSize){
            splitBucket();
        }

    }
    private void splitBucket(){
        table.add(new ArrayList<>());

        List<Integer> bucket= table.get(split);
        List<Integer> newBucket = new ArrayList<>();

        for(int key: bucket){
            int newIndex = key % (int) Math.pow(2, level+1);
            if(newIndex != split){
                newBucket.add(key);

            }
        }
        bucket.removeAll(newBucket);
        table.set(table.size() - 1,newBucket);

        split++;

        if(split == Math.pow(2,level)){
            split = 0;
            level++;
        }


    }
    public void display(){
        System.out.println("linear hash table:");
        for(int i=0;i<table.size();i++){
            System.out.println(i + "->"+ table.get(i));
        }
    }
    public static void main(String[] args) {
        linearhashing h= new linearhashing();
        int[] keys = {21,4,6,9,2,33,5,46,7,54,3,59,3,5};

        for(int key :keys){
            h.insert(key);
        }
        h.display();
    }

}