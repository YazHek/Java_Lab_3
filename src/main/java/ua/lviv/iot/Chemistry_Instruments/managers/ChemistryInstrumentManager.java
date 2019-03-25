package ua.lviv.iot.Chemistry_Instruments.managers;

import ua.lviv.iot.Chemistry_Instruments.models.ChemistryInstrument;
import ua.lviv.iot.Chemistry_Instruments.models.TypeOfInstruments;

import java.util.List;

public interface ChemistryInstrumentManager {

    List<ChemistryInstrument> sortByYear(
            List<ChemistryInstrument> chemistryInstrumentList, boolean reverse);
    List<ChemistryInstrument> sortByType(
            List<ChemistryInstrument> chemistryInstrumentList, boolean reverse);
    List<ChemistryInstrument> findByType(TypeOfInstruments typeOfInstruments);
}
