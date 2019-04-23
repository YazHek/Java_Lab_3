package ua.lviv.iot.Chemistry_Instruments.managers;

import ua.lviv.iot.Chemistry_Instruments.models.ChemistryInstrument;
import ua.lviv.iot.Chemistry_Instruments.models.TypeOfInstruments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChemistryInstrumentManagerImpl implements

        ChemistryInstrumentManager {

    private List<ChemistryInstrument>
            chemistryInstrumentList = new ArrayList<>();

    public final void setChemistryInstrumentList(
            final List<ChemistryInstrument> chemistryInstrumentListObj) {
        this.chemistryInstrumentList = chemistryInstrumentListObj;
    }

    @Override
    public final List<ChemistryInstrument> sortByYear(
            final List<ChemistryInstrument>
                    chemistryInstrumentListObj, final boolean reverse) {

        if (reverse) {
            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing(
                            ChemistryInstrument::getYearOfRelease).reversed());
        } else {

            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing(
                            ChemistryInstrument::getYearOfRelease));
        }

        return chemistryInstrumentListObj;

    }

    @Override
    public final List<ChemistryInstrument> sortByType(
            final List<ChemistryInstrument>
                    chemistryInstrumentListObj, final boolean reverse) {


        if (reverse) {

            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing(
                        ChemistryInstrument::getTypeOfInstruments).reversed());
        } else {

            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing(
                            ChemistryInstrument::getTypeOfInstruments));

        }
        return chemistryInstrumentListObj;
    }

    @Override
    public final List<ChemistryInstrument>
    findByType(final List<ChemistryInstrument> chemistryInstrumentList,
                                final TypeOfInstruments typeOfInstruments) {
        return chemistryInstrumentList.stream().filter(chemistryInstrument ->
                chemistryInstrument.getTypeOfInstruments()
                        .equals(typeOfInstruments))
                .collect(Collectors.toList());
    }
}
