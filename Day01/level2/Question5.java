import java.util.*;
class CartItem {
    String itemName;
    int price;
    int quantity;
    static String [][]items=new String[20][3];
    static int index=0;
    public CartItem(String item,int price,int quantity){
      this.itemName=item;
      this.price=price;
      this.quantity=quantity;
    }
    public void addItem(){
        if(index<20){
        items[index][0]=itemName;
      items[index][1]=String.valueOf(price);
      items[index][2]=String.valueOf(quantity);
      index++;
        }
        else{
            System.out.println("cart is already full: ");
        }
    }
    public void removeItem(String item){
        for(int i=0;i<20;i++){
            if(items[i][0] != null && items[i][0].equals(item)){
                items[i][1]=String.valueOf(0);
                items[i][2]=String.valueOf(0);
            }

        }
    }
    public void itemDetails(){
        int j=0;
        System.out.println("itemName  price  quantity");
        for(int i=0;i<index;i++){
            System.out.println(items[i][0]+"\t"+price+"\t"+quantity);
        }
    }

    public void totalCost(){
        int total=0;
        for(int i=0;i<index;i++){
           total+=(Integer.parseInt(items[i][2]))*(Integer.parseInt(items[i][1]));
        }
        System.out.println("total value of cart is :" + total);

    }
    
}



public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter item name: ");
        String item=sc.next();
        System.out.print("enter item price: ");
        int price=sc.nextInt();
        System.out.print("enter quantity: ");
        int quantity=sc.nextInt();
        CartItem ct=new CartItem(item,price,quantity);
        ct.addItem();
        ct.itemDetails();
        ct.totalCost();
        System.out.print("enter item name to remove: ");
         item=sc.next();
        ct.removeItem(item);
        ct.totalCost();
        
        }
        
    }
    

