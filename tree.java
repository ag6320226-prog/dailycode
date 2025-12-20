class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        left=right=null;

    }
}
 

    


 class tree {
    node root;
    void preorder(node node){
        if(node==null)
            return;
        System.out.print(node.data+ " ");
        preorder(node.left);
        preorder(node.right);


    }
    void inorder(node node){
        if(node==null)
            return;

        inorder(node.left);
        System.out.print(node.data+ " ");
        inorder(node.right);
    }
     void postorder(node node){
        if(node==null)
            return;

       postorder(node.left);
      
        postorder(node.right);
          System.out.print(node.data+ " ");

    
}
public static void main(String[] args) {
    tree t1=new tree();
    t1.root=new node(1);
    t1.root.left=new node(2);
      t1.root.right=new node(3);
      t1.root.left.left=new node(4);
      t1.root.left.right=new node(5);
    

    System.out.println("inorder traversal:");
    t1.inorder(t1.root);
    
    System.out.println("preorder traversal:");
    t1.preorder(t1.root);
    
    System.out.println("postorder traversal:");
    t1.postorder(t1.root);

}
 }
