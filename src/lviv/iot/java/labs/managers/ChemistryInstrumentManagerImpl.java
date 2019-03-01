package lviv.iot.java.labs.managers;

import lviv.iot.java.labs.models.ChemistryInstrument;
import lviv.iot.java.labs.models.TypeOfInstruments;

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
                    chemistryInstrumentListObj, boolean reverse) {

        if (reverse) {
            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing
                            (ChemistryInstrument::getYearOfRelease).reversed());
        } else {

            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing
                            (ChemistryInstrument::getYearOfRelease));
        }

        return chemistryInstrumentListObj;

    }

    @Override
    public final List<ChemistryInstrument> sortByType(
            final List<ChemistryInstrument>
                    chemistryInstrumentListObj, boolean reverse) {


        if (reverse) {

            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing
                            (ChemistryInstrument::getTypeOfInstruments).reversed());
        } else {

            Collections.sort(chemistryInstrumentListObj,
                    Comparator.comparing
                            (ChemistryInstrument::getTypeOfInstruments));

        }
        return chemistryInstrumentListObj;
    }

    @Override
    public final List<ChemistryInstrument> findByType(final TypeOfInstruments
                                                              typeOfInstruments) {
        return chemistryInstrumentList.stream().filter(chemistryInstrument ->
                chemistryInstrument.getTypeOfInstruments().equals(typeOfInstruments))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        ChemistryInstrumentManager manager = new ChemistryInstrumentManagerImpl();

        ChemistryInstrument flask = new ChemistryInstrument("Abra",
                "Cadabra", 2001, TypeOfInstruments.ACIDS);

        ChemistryInstrument pipette = new ChemistryInstrument("Eniki",
                "Beniki", 2010, TypeOfInstruments.BASIS);

        ChemistryInstrument tripod = new ChemistryInstrument("Company",
                "Model", 2019, TypeOfInstruments.OXIDS);


        List<ChemistryInstrument> chemistryInstrumentList = new ArrayList<>();
        chemistryInstrumentList.add(flask);
        chemistryInstrumentList.add(pipette);
        chemistryInstrumentList.add(tripod);


        ((ChemistryInstrumentManagerImpl) manager).setChemistryInstrumentList
                (chemistryInstrumentList);

        System.out.println(manager.findByType(TypeOfInstruments.BASIS));
        System.out.println(manager.sortByType(chemistryInstrumentList, true));
        System.out.println(manager.sortByYear(chemistryInstrumentList, false));


    }

}
