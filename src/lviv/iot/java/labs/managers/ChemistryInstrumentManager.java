package lviv.iot.java.labs.managers;

import lviv.iot.java.labs.models.ChemistryInstrument;
import lviv.iot.java.labs.models.TypeOfInstruments;

import java.util.List;

public interface ChemistryInstrumentManager {

    List<ChemistryInstrument> sortByYear(
            List<ChemistryInstrument> chemistryInstrumentList, boolean reverse);
    List<ChemistryInstrument> sortByType(
            List<ChemistryInstrument> chemistryInstrumentList, boolean reverse);
    List<ChemistryInstrument> findByType (TypeOfInstruments typeOfInstruments);
}
