package ua.lviv.iot.Chemistry_Instruments.models;

public class MeasuringCylinder extends ChemistryInstrument {

    private int height;
    private int volume;
    private int radius;

    public MeasuringCylinder() {

    }

    public MeasuringCylinder(final int heightObj,
                             final int volumeObj, final int radiusObj) {
        this.height = heightObj;
        this.volume = volumeObj;
        this.radius = radiusObj;

    }

    public final int getHeight() {
        return height;
    }

    public final void setHeight(final int heightObj) {
        this.height = heightObj;
    }

    public final int getVolume() {
        return volume;
    }

    public final void setVolume(final int volumeObj) {
        this.volume = volumeObj;
    }

    public final int getRadius() {
        return radius;
    }

    public final void setRadius(final int radiusObj) {
        this.radius = radiusObj;
    }

    @Override
    public final String toString() {
        return "MeasuringCylinder{"
                + "height="
                + height
                + ", volume="
                + volume
                + ", radius="
                + radius
                + '}';
    }
}
