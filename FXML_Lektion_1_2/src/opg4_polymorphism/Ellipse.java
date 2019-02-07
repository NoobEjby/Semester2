package opg4_polymorphism;

/**
 *
 * @author Noob
 */
public class Ellipse extends AbstractShape{

    private double r1;
    private double r2;

    public Ellipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public double getArea() {
        return Math.PI * this.r1 * this.r2;
    }

    public double getCirrumference() {
        return 2 * Math.PI * Math.sqrt(1 / 2 * (Math.pow(r1, 2) + Math.pow(r2, 2)));
    }

    @Override
    public double getCircumference() {
       return 2 * Math.PI * Math.sqrt(0.5 * (Math.pow(r1, 2) + Math.pow(r2, 2)));
    }


}
