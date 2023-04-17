
package pkg01hyber_market;


public class customerClass extends person implements newRetail{
    private int orderID;
    private String password;
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    
    
    }