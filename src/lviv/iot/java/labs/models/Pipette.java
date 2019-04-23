package lviv.iot.java.labs.models;

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

    public final void setVolume(int volumeObj) {
        this.volume = volumeObj;
    }

    public final TypeOfPipette getTypeOfPipette() {
        return typeOfPipette;
    }

    public final void setTypeOfPipette(TypeOfPipette typeOfPipetteObj) {
        this.typeOfPipette = typeOfPipetteObj;
    }

    @Override
    public String toString() {
        return "Pipette{" +
                "volume=" + volume +
                ", typeOfPipette=" + typeOfPipette +
                '}';
    }
}
