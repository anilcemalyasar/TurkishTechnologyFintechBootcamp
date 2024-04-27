package InheritanceDemo.people;
public class Customer extends Person {
    private long customerId;
    private double totalDept;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public double getTotalDept() {
        return totalDept;
    }

    public void setTotalDept(double totalDept) {
        this.totalDept = totalDept;
    }

    @Override
    public String getFullName() {
        return "Customer " + getFirstName() + " " + getLastName();
    }
}
