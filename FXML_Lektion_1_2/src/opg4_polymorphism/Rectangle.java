package opg4_polymorphism;

/**
 *
 * @author Noob
 */
public class Rectangle extends AbstractShape{

    private double l1;
    private double l2;

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getArea() {
        return this.l1 * this.l2;
    }


    @Override
    public double getCircumference() {
       return 2 * (this.l1 + this.l2);
    }

}
