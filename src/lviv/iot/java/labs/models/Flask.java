package lviv.iot.java.labs.models;

public class Flask extends ChemistryInstrument {

    private String name;
    private int height;
    private int radius;

    public Flask(){

    }

    public Flask(final String nameObj,
                 final int heightObj, final int radiusObj){
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

    public final void setHeight(int heightObj) {
        this.height = heightObj;
    }

    public final int getRadius() {
        return radius;
    }

    public final void setRadius(int radiusObj) {
        this.radius = radiusObj;
    }


    @Override
    public String toString() {
        return "Flask{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }
}
