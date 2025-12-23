// // class node{
// //     int data;
// //     node left,right;
// //     node(int data){
// //         this.data=data;
// //         left=right=null;

// //     }
// // }
 

    


// //  class trees {
// //     node root;
// //     void preorder(node node){
// //         if(node==null)
// //             return;
// //         System.out.print(node.data+ " ");
// //         preorder(node.left);
// //         preorder(node.right);


// //     }
// //     void inorder(node node){
// //         if(node==null)
// //             return;

// //         inorder(node.left);
// //         System.out.print(node.data+ " ");
// //         inorder(node.right);
// //     }
// //      void postorder(node node){
// //         if(node==null)
// //             return;

// //        postorder(node.left);
      
// //         postorder(node.right);
// //           System.out.print(node.data+ " ");

    
// // }
// // public static void main(String[] args) {
// //     trees t1=new trees();
// //     t1.root=new node(1);
// //     t1.root.left=new node(2);
// //       t1.root.right=new node(3);
// //       t1.root.left.left=new node(4);
// //       t1.root.left.right=new node(5);
    

// //     System.out.println("inorder traversal:");
// //     t1.inorder(t1.root);
    
// //     System.out.println("preorder traversal:");
// //     t1.preorder(t1.root);
    
// //     System.out.println("postorder traversal:");
// //     t1.postorder(t1.root);

// // }
// //  }


//     //Build tree
//     public class trees{
//         static class node{
//             int data;
//             node left;
//             node right;

//             node(int data){
//                 this.data = data;
//                 this.left = null;
//                 this.right= null;
//             }
//         }
//         static class bstTrre{
//             static int idx = -1;
//             public static node buildTree(int nodes[]){
//                 idx++;
//                 if(nodes[idx]==-1){
//                  return null;
//                 }
//                 node newNode = new node(nodes[idx]);
               
//                 newNode.left=buildTree(nodes);
//                  newNode.right=buildTree(nodes);

//                  return newNode;

//             }
//         }
//         public static void main(String[] args) {
//             int nodes[]={9,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//             bstTrre tree = new bstTrre();
//             node root = tree.buildTree(nodes);

//             System.out.println(root.data);
//         }
//     }
