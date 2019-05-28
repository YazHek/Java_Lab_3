package ua.lviv.iot.Java_Lab8.models;

import javax.persistence.Entity;

@Entity
public class Flask extends ChemistryInstrument {

    private String name;
    private int height;
    private int radius;

    public Flask() {

    }

    public Flask(final String brandObj, final String modelObj,
                 final int yearOfReleaseObj,
                 final TypeOfInstruments typeOfInstrumentsObj,
                 final String nameObj,
                 final int heightObj, final int radiusObj) {
        super(brandObj, modelObj, yearOfReleaseObj, typeOfInstrumentsObj);
        this.name = nameObj;
        this.height = heightObj;
        this.radius = radiusObj;


    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameObj) {
        this.name = nameObj;
    }

    public final int getHeight() {
        return height;
    }

    public final void setHeight(final int heightObj) {
        this.height = heightObj;
    }

    public final int getRadius() {
        return radius;
    }

    public final void setRadius(final int radiusObj) {
        this.radius = radiusObj;
    }


    @Override
    public final String toString() {
        return "Flask{"
                + "name='"
                + name
                + '\''
                + ", height="
                + height
                + ", radius="
                + radius
                + '}';
    }

    public String getHeaders(){

        return super.getHeaders()
                + "name"
                + ","
                + "height"
                + ","
                + "radius";
    }

    public String toCSV(){

        return super.toCSV()
                + name
                + ","
                + height
                + ","
                + radius;
    }
}
