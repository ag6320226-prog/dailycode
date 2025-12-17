public class inO_preO_PosO {

    static class node{
        int data;
        node left;
        
    node right;

    node(int data){
        this.data= data;
    }

 }
    public static node insert(node root,int val){
        if(root==null){
            root = new node(val);
            return root;
        }
        if(root.data>val){

            root.left = insert(root.left,val);

        }
        else{
            root.right = insert(root.right,val);

        }
        return root;
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
       public static void preorder(node root){
        if(root==null){
            return;
        }
    System.out.print(root.data+" ");
    preorder(root.left);
      preorder(root.right);
    }

    
    // public static boolean search(node root, int key){
    //     if(root==null){
    //         return false;
    //     }
    //     if(root.data> key){
    //         return search(root.left, key);
    //     }
    //     else if(root.data == key){
    //         return true;
    //     }
    //     else{
    //         return search(root.right, key);
    //     }

    //     }
       
    
        
    
    public static void main(String[] args) {
        int valuse[]={3,4,7,4,9,67,7,46,41,9};
       node root = null;
        for(int i=0;i<valuse.length;i++){
            root =insert(root, valuse[i]);
        }
        inorder(root);
        preorder(root);
        System.out.println(" ");

        // if(search(root,67)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("no found");
        // }
    }
}

   

