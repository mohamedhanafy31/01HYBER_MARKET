package pkg01hyber_market;
import java.util.*;
import java.time.*;

enum catigories {bakery, freshFood, dairyAndEggs , forzenAndChield, beverage, sweetAndSnacks, cleaningAndBeauty, pets};
public class Product implements retail_item{
    private String name;
    private int barCode;
    private int inventory_id;
    private static int no_product;
    private String type;
    private LocalDate expireDate;
    private LocalDate productionDate;
    private double buyPrice;
    private double sellPrice;
    private double discountAmount;
    private int no_damage;
    private int no_of_items;
    private int no_of_SoldItems;
    private double salesReturn;
    private boolean haveSpaceOffer;
    private int specialAmount;
    
    public Product (){
    }
    
     public Product(String name, int barCode, String type, LocalDate expireDate, LocalDate productionDate, double buyPrice, double sellPrice, int no_of_items, int specialAmount) {
        this.name = name;
        this.barCode = barCode;
        this.type = type;
        this.expireDate = expireDate;
        this.productionDate = productionDate;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.no_of_items = no_of_items;
        this.specialAmount = specialAmount;
        haveSpaceOffer = false;
        no_product ++;
    }
    
     @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public void setInventoryId(int id){
        this.inventory_id = id;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setNo_damage(int no_damage) {
        this.no_damage = no_damage;
    }

    public void setNo_of_items(int no_of_items) {
        this.no_of_items = no_of_items;
    }

    public void setNo_of_SoldItems(int no_of_SoldItems) {
        this.no_of_SoldItems = no_of_SoldItems;
    }

    public void setSalesReturn() {
        salesReturn = (no_of_SoldItems * sellPrice) + no_damage * buyPrice;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getType(){   //(Farraj) getter of type;
        return type;
    }

    public void setSpecialAmount(int specialAmount) {
        this.specialAmount = specialAmount;
    }

    public void setHaveSpaceOffer(boolean haveSpaceOffer) {
        this.haveSpaceOffer = haveSpaceOffer;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;
    }
    
    public int getInventory_Id(){
        return inventory_id;
    }
    
    public static int getNo_product(){
        return no_product;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getNo_damage() {
        return no_damage;
    }

    public int getNo_of_items() {
        return no_of_items;
    }

    public int getNo_of_SoldItems() {
        return no_of_SoldItems;
    }

    public double getSalesReturn() {
        return salesReturn;
    }

    public boolean isHaveSpaceOffer() {
        return haveSpaceOffer;
    }
    
    public int getSpecialAmount(){
        return specialAmount;
    }
    
    public String allDetails(){
        String details =  getName()+"\t"+ getBarCode()+""+"\t" + getInventory_Id()+""+"\t" + getNo_product()+""+"\t"
                +getExpireDate()+""+"\t" + getProductionDate()+""+"\t" + getBuyPrice()+""+"\t"+getNo_damage()+""+"\t"
                +getNo_of_items()+""+"\t" + getNo_of_SoldItems()+""+"\t" + getSalesReturn()+""+"\t" + isHaveSpaceOffer()+""+"\t"
                + getSpecialAmount()+ "" ;
        return details;         
                                     
    }
    
    
    
     
    
    
    
}


