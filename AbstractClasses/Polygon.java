package AbstractClasses;

import Interface.Prectangle;

public abstract class Polygon extends Figure implements Prectangle {
    public Polygon(Integer nSides, Double[] lSides) {
        this.nSides = nSides;
        this.lSides = lSides;
    }

    public Double[] getlSides() {
        return lSides;
    }

    private Integer nSides;
    private Double[] lSides = new Double[100];

    @Override
    public Double getPeremetr() {
        Double res = 0.0;
        for (Double side : lSides) {
            if (side != null)
                res += side;
        }
        return res;
    }
}
