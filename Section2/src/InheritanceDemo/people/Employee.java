package InheritanceDemo.people;

public class Employee extends Person {

    private long empId;
    private String department;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getFullName() {
        return "Employee : " + getFirstName() + " " + getLastName();
    }
}
