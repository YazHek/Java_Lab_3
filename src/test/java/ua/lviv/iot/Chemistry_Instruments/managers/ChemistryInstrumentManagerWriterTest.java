package ua.lviv.iot.Chemistry_Instruments.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.Chemistry_Instruments.models.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChemistryInstrumentManagerWriterTest {

    private List <ChemistryInstrument>
            chemistryInstrumentList = new LinkedList<>();

    ChemistryInstrumentManagerWriter
            writer = new ChemistryInstrumentManagerWriter();

    private  String path = "chemistryListFile";

    private Flask flask = new Flask(
            "FlaskBrand",
            "FlaskModel",
            2003, TypeOfInstruments.ACIDS,
            "FlaskName",
            11,
            1
    );

    private MeasuringCylinder measuringCylinder = new MeasuringCylinder(
            "CylinderBrand",
            "CylynderModel",
            2001, TypeOfInstruments.BASIS,
            12,
            2,
            3
    );

    private Pipette pipette = new Pipette(
            "PipetteBrand",
            "PipetteModel",
            2000, TypeOfInstruments.OXIDS,
            1, TypeOfPipette.ELECTRICAL
    );

    private Tripod tripod = new Tripod(
            "TripodBrand",
            "TripodModel",
            2004, TypeOfInstruments.ACIDS,
            4,
            1,
            3
    );

    @BeforeEach
    public void setUp(){

        chemistryInstrumentList.add(flask);
        chemistryInstrumentList.add(measuringCylinder);
        chemistryInstrumentList.add(pipette);
        chemistryInstrumentList.add(tripod);

        writer = new ChemistryInstrumentManagerWriter(path);
    }

    @Test
    void testWriteToFile() {

        File chemistryListFile = new File(path + ".csv");
        writer.writeToFile(chemistryInstrumentList);

        try (FileInputStream fis = new FileInputStream(chemistryListFile);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(isr)) {

            for (ChemistryInstrument
                    chemistryInstrument : chemistryInstrumentList) {

              assertEquals(chemistryInstrument.getHeaders(), reader.readLine());
              assertEquals(chemistryInstrument.toCSV(), reader.readLine());
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}