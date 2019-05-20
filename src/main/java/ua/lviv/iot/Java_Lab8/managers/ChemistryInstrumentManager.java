package ua.lviv.iot.Java_Lab8.managers;

import ua.lviv.iot.Java_Lab8.models.ChemistryInstrument;
import ua.lviv.iot.Java_Lab8.models.TypeOfInstruments;

import java.util.List;

public interface ChemistryInstrumentManager {

    List<ChemistryInstrument> sortByYear(
            List<ChemistryInstrument> chemistryInstrumentList, boolean reverse);
    List<ChemistryInstrument> sortByType(
            List<ChemistryInstrument> chemistryInstrumentList, boolean reverse);

    List<ChemistryInstrument> findByType(List<ChemistryInstrument>
                                                 chemistryInstrumentList,
                                         TypeOfInstruments typeOfInstruments);
}
