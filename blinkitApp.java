import java.util.*;
class product{
    int id;
String name;
double price;

product(int id,String name,double price){
    this.id=id;
    this.name=name;
    this.price=price;
}
}




public class blinkitApp {
static List<product> product= new ArrayList<>();
static Map<product,Integer>cart = new HashMap<>();

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    product.add(new product(1, "milk", 60));
     product.add(new product(2, "egg", 8));
      product.add(new product(3, "biscut", 50));
       product.add(new product(4, "kukure", 20));
        product.add(new product(51, "sugar(1kg)", 40));

        System.out.println("welcome  to blinkit grocery app");

        while(true){
            System.out.println("\n1.viewproducts:");
            System.out.println("2.addtocart:");
            System.out.println("3 view to cart:");
            System.out.println("4.checkout:");
            System.out.println("5.exist:");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    viewproducts();


                 break;
                 case 2:
                    addtocart(sc);
                    break;
                    case 3:
                    viewcart();
                    break;
                    case 4:
                    checkout();
                        return;
                        case 5:
                            System.out.println("Thankyou for shopping with blinkit!");
                            return;
                            default:
                                System.out.println("invalidchoice ,plase try again.");
                        



            }
        }


}
static void viewproducts(){
    System.err.println("\n available products:");
    for(product p: product){
        System.out.println(p.id+"."+p.name+"-$"+p.price);
    }
}
static void addtocart(Scanner sc){
    viewproducts();

    System.out.println("Enter product id to add:");
    int id=sc.nextInt();
    product selected=null;
    for(product p:product){
        if(p.id==id){
            selected = p;
            break;

        }
    }
    if(selected==null){
        System.out.println("invalid product id:");
        return;

    }
    System.out.println("Enter quntity:");
    int quntity= sc.nextInt();
    cart.put(selected,cart.getOrDefault(selected, 0)+quntity);
    System.out.println("^"+selected.name+"added to cart!");
    
}
static void viewcart(){
    if(cart.isEmpty())
{
    System.out.println("your cart is empty:");
    return ;


}
System.out.println("\n your cart");
double total=0;
for(Map.Entry<product,Integer>entry: cart.entrySet()){
    product p=entry.getKey();
    int quntity= entry.getValue();
    double cost =p.price*quntity;
    total +=cost;
    System.out.println(p.name+"x"+quntity+"=$"+ cost);
}
System.out.println("Total:$"+total);
}
static void checkout(){
    if(cart.isEmpty()){
        System.out.println("your cart is empty Add items first.");
        return ;
    }
    viewcart();
    System.out.println("\n order placed succsesfully:");
    cart.clear();


}



    
}
