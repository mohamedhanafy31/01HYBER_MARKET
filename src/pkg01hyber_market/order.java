package pkg01hyber_market;
import java.util.ArrayList;
import java.util.*;
import java.time.*;

public class order {
    
//DATA FIELDS
    private ArrayList<Product>Products;
    private ArrayList<String> no_item;
    private static int no_orders;
    private int order_id;
    private String customer;
    private double order_cost;
    private String casher;
    private Date order_date;
    
//CONSTRUCTOR
    public order() {
        no_orders ++;
        order_id = no_orders;
        }            
    
//METHODS
     public void additem(Product p ,String no_items){
        Products.add(p);
        no_item.add(no_items);
}
    
    public ArrayList<Product> getProducts() {
        return Products;
    }
    
    public ArrayList<String> getNo_item() {
        return no_item;
    }
    
    public int getOrder_id() {
        return order_id;
    }

    public String getCasher() {
        return casher;
    }

    public void setCasher(String casher) {
        this.casher = casher;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date() {
        this.order_date = new Date();
    }

    public double getOrder_cost() {
        return order_cost;
    }

    public void setOrder_cost() {
        for(int i = 0 ; i < Products.size(); i++){
            int number = Integer.parseInt(no_item.get(i));
            order_cost = order_cost +(Products.get(i).getSellPrice() * number);
        }
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public static int getNo_orders() {
        return no_orders;
    }
    
    public void allDetails(){
        String details =  getOrder_id() + "\n"
                         +getCasher() + "\n"
                         +getOrder_date()+"\n"
                         +getCustomer()+"/n" ;
        System.out.println(details);
        
        for(int i= 0 ;i < Products.size() ; i++ ){
            int number = Integer.parseInt(no_item.get(i));
            double sum = (Products.get(i).getSellPrice() * number);
            String allProducts = i + "" + "\t" 
                    +Products.get(i).getBarCode() + "\t"
                    +Products.get(i).getName() + "\t"
                    +no_item.get(i) + "\t"
                    + Products.get(i).getSellPrice() + "\t"
                    + sum + "" + "\t";
            System.out.println(allProducts);
        }
        System.out.println("=======================================================================================");
        System.out.println("Total Price\t" + order_cost);        
    }
    
//new salesReturn =old sales return + no_items*sellPrice
//new no_items = old no_items - no_item
//new no_soldItems = old no_soldItems + no_item
}
