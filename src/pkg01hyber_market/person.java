
package pkg01hyber_market;

enum gender{male,female};

public class person implements retail_item{
    protected String Name;
    protected int id;
    protected String sex;
    protected String  phoneNumber;
    protected String password;
    /*---------------------------------------------------------------------------------------*/
    public person(){}
    
    public person(String Name,int id,String  phoneNumber){
        this.Name = Name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String firstName) {
        this.Name = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return sex;
    }

    public void setGender(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
