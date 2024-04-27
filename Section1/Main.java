package Section1;

public class Main {

    public static void main(String[] args) {
        Power x = new Power(2, 4);
        Power y = new Power(5, 0);
        System.out.println(x.base + " raised to " + x.exp + " = " + x.getValue());
        System.out.println(y.base + " raised to " + y.exp + " = " + y.getValue());
    }

}

