package pkg01hyber_market;

enum employeeType{marketing,invintory,seller}
public class EmployeeClass extends person implements newRetail{
    protected int salary;
    protected String userName;
    protected String Dept;
    /*--------------------------------------------------------------------------*/

    public EmployeeClass(){};

    public EmployeeClass(int salary, String userName, String Name,int id, String phoneNumber) {
        super(Name, id,phoneNumber);
        this.salary = salary;
        this.userName = userName;
        
    }
    
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    
}
