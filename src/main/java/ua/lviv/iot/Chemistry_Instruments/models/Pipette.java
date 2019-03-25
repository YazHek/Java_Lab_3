package ua.lviv.iot.Chemistry_Instruments.models;

public class Pipette extends ChemistryInstrument {

    private int volume;
    private TypeOfPipette typeOfPipette;

    public Pipette() {

    }

    public Pipette(final int volumeObj, final TypeOfPipette typeOfPipetteObj) {
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
}
