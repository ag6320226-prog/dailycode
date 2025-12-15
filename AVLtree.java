class Node{
    int key,height;
    Node left,right;;
        
    Node(int d){
        key=d;
        height=1;

    }
}

public class AVLtree {
    Node root;
    int height(Node N){
        if(N==null)
            return 0;
        return N.height;

    }
    int getBalance( Node  N){
        if(N==null)
            return 0;
        return height (N.left)-height(N.right);
    }
    Node rightRotate(Node y){
        Node x = y.left;
        Node T2=x.right;
        x.right=y;
        y.left=T2;

        y.height=Math.max(height(y.left),height(y.right))+1;
        x.height=Math.max(height(x.left),height(x.right))+1;

        return x;
    }
    Node leftRotate(Node x){
        Node y= x.right;
        Node T2=y.left;


        //rotationnn
        y.left=x;
        x.right=T2;
        //height change
        x.height=Math .max(height(x.left),height(x.right))+1;
                y.height=Math .max(height(y.left),height(y.right))+1;

                return y;

    }

    Node insert(Node node,int key){
        //normal bst insertion

        if(node==null)
            return new Node(key);
        if(key<node.key)
            node.left=insert(node.left ,key);
            else if(key>node.key)
                node.right=insert(node.right, key);
            else
                return node;//duplicate keys not allowed
            // update height
            node.height=1+Math.max(height(node.left),height(node.right));

            //check balance
            int balance =getBalance(node);
            //case1:LL
            if(balance>1&& key>node.left.key){
                return rightRotate(node);

            }
            //case2:RR
            if(balance<-1&& key>node.right.key)
                return leftRotate(node);

                //case 3:LR
                if(balance>1&& key>node.left.key){
                    node.left=leftRotate(node.left);
                    return rightRotate(node);
                

                }
                //case 4:RL
                if(balance<-1 && key<node.right.key){
                      node.right=rightRotate(node.right);
                    return leftRotate(node);
                }
                return node;

            }
            //inorder teraversal
            void inorder(Node node){
                if(node!=null){
                    inorder(node.left);
                    System.out.print(node.key+ " ");
                    inorder(node.right);

                }
            }
            public static void main(String[] args) {
                AVLtree t1=new AVLtree();

                t1.root=t1.insert(t1.root, 25);
                  t1.root=t1.insert(t1.root, 20);
                    t1.root=t1.insert(t1.root, 40);
                     t1.root=t1.insert(t1.root, 70);
                        t1.root=t1.insert(t1.root, 30);
                         t1.root=t1.insert(t1.root, 80);
                            t1.root=t1.insert(t1.root, 60);
                              t1.root=t1.insert(t1.root, 50);
System.out.println("\n inorder traversal of AVLtree:");
t1.inorder(t1.root);

            }
    }

