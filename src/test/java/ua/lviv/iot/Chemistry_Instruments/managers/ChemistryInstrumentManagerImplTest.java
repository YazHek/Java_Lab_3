package ua.lviv.iot.Chemistry_Instruments.managers;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.Chemistry_Instruments.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChemistryInstrumentManagerImplTest {

    @Test
    void sortByYear() {

        Flask flask = new Flask();
        Pipette pipette = new Pipette();
        Tripod tripod = new Tripod();
        ChemistryInstrumentManagerImpl myManager = new ChemistryInstrumentManagerImpl();

        flask.setYearOfRelease(2001);
        pipette.setYearOfRelease(2020);
        tripod.setYearOfRelease(2010);

        List<ChemistryInstrument> chemistryInstrumentList = new ArrayList<>();
        List<ChemistryInstrument> chemistryInstrumentsTest = new ArrayList<>();

        chemistryInstrumentList.add(flask);
        chemistryInstrumentList.add(pipette);
        chemistryInstrumentList.add(tripod);

        chemistryInstrumentsTest.add(flask);
        chemistryInstrumentsTest.add(tripod);
        chemistryInstrumentsTest.add(pipette);
        assertEquals(chemistryInstrumentsTest, myManager.sortByYear(
                chemistryInstrumentList,  false));

        chemistryInstrumentsTest.clear();
        
        chemistryInstrumentsTest.add(pipette);
        chemistryInstrumentsTest.add(tripod);
        chemistryInstrumentsTest.add(flask);

        assertEquals(chemistryInstrumentsTest, myManager.sortByYear(
                chemistryInstrumentList,  true));
    }

    @Test
    void sortByType() {

        Flask flask = new Flask();
        Pipette pipette = new Pipette();
        Tripod tripod = new Tripod();
        ChemistryInstrumentManagerImpl myManager = new ChemistryInstrumentManagerImpl();

        flask.setTypeOfInstruments(TypeOfInstruments.OXIDS);
        pipette.setTypeOfInstruments(TypeOfInstruments.BASIS);
        tripod.setTypeOfInstruments(TypeOfInstruments.ACIDS);

        List<ChemistryInstrument> chemistryInstrumentList = new ArrayList<>();
        List<ChemistryInstrument> chemistryInstrumentsTest = new ArrayList<>();

        chemistryInstrumentList.add(flask);
        chemistryInstrumentList.add(pipette);
        chemistryInstrumentList.add(tripod);

        chemistryInstrumentsTest.add(tripod);
        chemistryInstrumentsTest.add(pipette);
        chemistryInstrumentsTest.add(flask);

        assertEquals(chemistryInstrumentsTest, myManager.sortByType(
                chemistryInstrumentList,  false));

        chemistryInstrumentsTest.clear();

        chemistryInstrumentsTest.add(flask);
        chemistryInstrumentsTest.add(pipette);
        chemistryInstrumentsTest.add(tripod);


        assertEquals(chemistryInstrumentsTest, myManager.sortByType(
                chemistryInstrumentList,  true));
    }

    @Test
    void findByType() {

        Flask flask = new Flask();
        Pipette pipette = new Pipette();
        Tripod tripod = new Tripod();
        ChemistryInstrumentManagerImpl myManager = new ChemistryInstrumentManagerImpl();

        flask.setTypeOfInstruments(TypeOfInstruments.OXIDS);
        pipette.setTypeOfInstruments(TypeOfInstruments.BASIS);
        tripod.setTypeOfInstruments(TypeOfInstruments.ACIDS);

        List<ChemistryInstrument> chemistryInstrumentList = new ArrayList<>();
        List<ChemistryInstrument> chemistryInstrumentsTest = new ArrayList<>();

        chemistryInstrumentList.add(flask);
        chemistryInstrumentList.add(pipette);
        chemistryInstrumentList.add(tripod);

        chemistryInstrumentsTest.add(flask);

        assertEquals(chemistryInstrumentsTest, myManager.findByType(
                chemistryInstrumentList, TypeOfInstruments.OXIDS));


    }
}