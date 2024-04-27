package InheritanceDemo.people;

public class Supplier extends Person {
    private long suppId;
    private String mainSector;

    public long getSuppId() {
        return suppId;
    }

    public void setSuppId(long suppId) {
        this.suppId = suppId;
    }

    public String getMainSector() {
        return mainSector;
    }

    public void setMainSector(String mainSector) {
        this.mainSector = mainSector;
    }

    @Override
    public String getFullName() {
        return "Supplier " + getFirstName() + " " + getLastName();
    }
}
