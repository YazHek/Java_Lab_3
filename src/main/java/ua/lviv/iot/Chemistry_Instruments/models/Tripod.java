package ua.lviv.iot.Chemistry_Instruments.models;

public class Tripod extends ChemistryInstrument {

    private int height;
    private int diametr;
    private int lenght;

    public Tripod() {

    }

    public Tripod(final String brandObj, final String modelObj,
                  final int yearOfReleaseObj,
                  final TypeOfInstruments typeOfInstrumentsObj,
                  final int heightObj,
                  final int diametrObj, final int lenghtObj) {
        super(brandObj, modelObj, yearOfReleaseObj, typeOfInstrumentsObj);
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
    public final String toString() {
        return "Tripod{"
                + "height="
                + height
                + ", diametr="
                + diametr
                + ", lenght="
                + lenght
                + '}';
    }


    public String getHeaders() {
        return super.getHeaders()
                + "height"
                + ","
                + "diametr"
                + ","
                + "lenght";
    }

    public String toCSV() {
        return super.toCSV()
                + height
                + ","
                + diametr
                + ","
                + lenght;
    }
}
