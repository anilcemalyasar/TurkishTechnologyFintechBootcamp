public class TwoDShape {
    private double width;
    private double height;

    // Add default constructor
    public TwoDShape() {
        width = height = 0;
    }


    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

}
