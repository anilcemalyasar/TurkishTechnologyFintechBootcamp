package InheritanceDemo.people;

public class Test {

    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.setCustomerId(101);
        cust.setFirstName("Anıl Cemal");
        cust.setLastName("Yaşar");
        cust.setTotalDept(500);

        // can we do this?
        Person person = new Customer();
        person.setFirstName("John");
        person.setLastName("Doe");

        // refer to page 453-454
        if (person instanceof Customer) {
            Customer custPerson = (Customer) person; // downcasting
            custPerson.setCustomerId(102);
            custPerson.setTotalDept(250);
        }

        // can we do this?
        // Person person1 = new Person(); -> Person' is abstract; cannot be instantiated

        Supplier supp = new Supplier();
        supp.setSuppId(2251);
        supp.setFirstName("Slim");
        supp.setLastName("Shady");
        supp.setMainSector("Music");

        Employee emp = new Employee();
        emp.setEmpId(151);
        emp.setFirstName("Jane");
        emp.setLastName("Smith");
        emp.setDepartment("Marketing");

        System.out.println(cust.getFullName());
        System.out.println(supp.getFullName());
        System.out.println(emp.getFullName());


    }
}
