class CarDrive{
    private String company;
    private int price;
    private String Model;

    public String getcompany(){
        return company;
    }
    public void setcompany(String c){
        company=c;
        System.out.println("company:"+ getcompany());
    }
    public int getprice(){
        return price;

    }
       public void setprice(int p){
        price=p;
        System.out.println("price:"+ getprice());
       }
       public String getModel(){
        return Model;
       }
       public void setModel(String M){
        Model = M;
        System.out.println("Model:"+ getModel());
       }
         public void dilevery(){
            System.out.println("delivery succesfull");
         }
}
public class Car{
    public static void main(String[] args) {
        CarDrive c=new CarDrive();
        c.setcompany("mersdies");
        c.setprice(10000000);
        c.setModel("G-WAGON");
        c.dilevery();
    }
}
