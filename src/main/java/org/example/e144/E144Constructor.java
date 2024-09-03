package org.example.e144;
public class E144Constructor {
    public static void main(String[] args) {
        StoreProduct obj1=new StoreProduct("Eggs",3.0,"Produce",true,10);
        StoreProduct obj2=new StoreProduct("Paper Towels",2.0,24);
        StoreProduct obj3=new StoreProduct("Paper Towels",2.0);
        obj1.display();
        obj2.display();
        obj3.display();
        //calling display method

    }
}
class StoreProduct{
    private String label; //name of product
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    //main constructor
    public StoreProduct(String label,double price,String category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    //second constructor
    public StoreProduct(String label,double price,int stock){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=stock;
    }
    //third constructor
    public StoreProduct(String label,double price){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=0;
    }
    public void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}