public class Triangle extends TwoDShape{

    private String style;
    public Triangle(String style, double width, double height) {
        super(width, height);  // call superclass constructor
        this.style = style;
    }


    double area() {
        return getHeight() * getWidth();
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
