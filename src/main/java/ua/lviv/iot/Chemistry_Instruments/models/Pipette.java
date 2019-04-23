package ua.lviv.iot.Chemistry_Instruments.models;

public class Pipette extends ChemistryInstrument {

    private int volume;
    private TypeOfPipette typeOfPipette;

    public Pipette() {

    }

    public Pipette(final String brandObj, final String modelObj,
                   final int yearOfReleaseObj,
                   final TypeOfInstruments typeOfInstrumentsObj,
                   final int volumeObj, final TypeOfPipette typeOfPipetteObj) {
        super(brandObj, modelObj, yearOfReleaseObj, typeOfInstrumentsObj);
        this.volume = volumeObj;
        this.typeOfPipette = typeOfPipetteObj;

    }

    public final int getVolume() {
        return volume;
    }

    public final void setVolume(final int volumeObj) {
        this.volume = volumeObj;
    }

    public final TypeOfPipette getTypeOfPipette() {
        return typeOfPipette;
    }

    public final void setTypeOfPipette(final TypeOfPipette typeOfPipetteObj) {
        this.typeOfPipette = typeOfPipetteObj;
    }

    @Override
    public final String toString() {
        return "Pipette{"
                + "volume="
                + volume
                + ", typeOfPipette="
                + typeOfPipette
                + '}';
    }

    public String getHeaders(){

        return super.getHeaders()
                + "volume"
                + ","
                + "typeOfPipette";
    }

    public String toCSV() {
        return super.toCSV()
                + volume
                + ","
                + typeOfPipette;
    }
}
