package lviv.iot.java.labs.models;

public class Tripod extends ChemistryInstrument {

    private int height;
    private int diametr;
    private int lenght;

    public Tripod() {

    }

    public Tripod(final int heightObj,
                  final int diametrObj, final int lenghtObj) {
        this.height = heightObj;
        this.diametr = diametrObj;
        this.lenght = lenghtObj;

    }

    public final int getHeight() {
        return height;
    }

    public final void setHeight(final int heightObj) {
        this.height = heightObj;
    }

    public final int getDiametr() {
        return diametr;
    }

    public final void setDiametr(final int diametrObj) {
        this.diametr = diametrObj;
    }

    public final int getLenght() {
        return lenght;
    }

    public final void setLenght(final int lenghtObj) {
        this.lenght = lenghtObj;
    }

    @Override
    public String toString() {
        return "Tripod{" +
                "height=" + height +
                ", diametr=" + diametr +
                ", lenght=" + lenght +
                '}';
    }
}
