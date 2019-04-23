package ua.lviv.iot.Chemistry_Instruments.models;

public class ChemistryInstrument {


    private String brand;
    private String model;
    private int yearOfRelease;
    private TypeOfInstruments typeOfInstruments;


   public ChemistryInstrument() {

    }


    public ChemistryInstrument(final String brandObj, final String modelObj,
                               final int yearOfReleaseObj,
                               final TypeOfInstruments typeOfInstrumentsObj) {
        this.brand = brandObj;
        this.model = modelObj;
        this.yearOfRelease = yearOfReleaseObj;
        this.typeOfInstruments = typeOfInstrumentsObj;
    }


    public final String getBrand() {
        return brand;
    }

    public final void setBrand(final String brandObj) {
        this.brand = brandObj;
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(final String modelObj) {
        this.model = modelObj;
    }

    public final int getYearOfRelease() {
        return yearOfRelease;
    }

    public final void setYearOfRelease(final int yearOfReleaseObj) {
        this.yearOfRelease = yearOfReleaseObj;
    }

    public final TypeOfInstruments getTypeOfInstruments() {
        return typeOfInstruments;
    }

    public final void setTypeOfInstruments(final TypeOfInstruments
                                                   typeOfInstrumentsObj) {
        this.typeOfInstruments = typeOfInstrumentsObj;
    }

    @Override
    public  String toString() {
        return "ChemistryInstrument{"
                + "brand='"
                + brand
                + '\''
                + ", model='"
                + model
                + '\''
                + ", yearOfRelease="
                + yearOfRelease
                + ", typeOfInstruments="
                + typeOfInstruments
                + '}';
    }

    public  String getHeaders(){

       return "brand" + ","
               + "model" + ","
               + "yearOfRelease" + ","
               + "typeOfInstruments";
    }

    public String toCSV(){

       return brand + ","
               + model + ","
               + yearOfRelease + ","
               + typeOfInstruments;
    }
}
