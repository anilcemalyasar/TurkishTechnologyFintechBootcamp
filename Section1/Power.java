package Section1;

public class Power {
    double base;
    int exp;
    double val;

    Power(double base, int exp) {
        this.base = base;
        this.exp = exp;

        this.val = 1;
        if (exp == 0) return;
        for( ; exp > 0; exp--) this.val *= this.base;
    }

    double getValue() {
        return this.val;
    }

}
