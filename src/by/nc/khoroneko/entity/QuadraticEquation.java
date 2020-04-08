package by.nc.khoroneko.entity;


public class QuadraticEquation {
    private double aCoefficient;
    private double bCoefficient;
    private double cCoefficient;

    public QuadraticEquation(double aCoefficient, double bCoefficient, double cCoefficient) {
        this.aCoefficient = aCoefficient;
        this.bCoefficient = bCoefficient;
        this.cCoefficient = cCoefficient;
    }

    public double getaCoefficient() {
        return aCoefficient;
    }

    public void setaCoefficient(double aCoefficient) {
        this.aCoefficient = aCoefficient;
    }

    public double getbCoefficient() {
        return bCoefficient;
    }

    public void setbCoefficient(double bCoefficient) {
        this.bCoefficient = bCoefficient;
    }

    public double getcCoefficient() {
        return cCoefficient;
    }

    public void setcCoefficient(double cCoefficient) {
        this.cCoefficient = cCoefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuadraticEquation that = (QuadraticEquation) o;

        if (Double.compare(that.aCoefficient, aCoefficient) != 0) return false;
        if (Double.compare(that.bCoefficient, bCoefficient) != 0) return false;
        return Double.compare(that.cCoefficient, cCoefficient) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(aCoefficient);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bCoefficient);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cCoefficient);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "by.nc.khoroneko.entity.QuadraticEquation{" +
                "aCoefficient=" + aCoefficient +
                ", bCoefficient=" + bCoefficient +
                ", cCoefficient=" + cCoefficient +
                '}';
    }
}
