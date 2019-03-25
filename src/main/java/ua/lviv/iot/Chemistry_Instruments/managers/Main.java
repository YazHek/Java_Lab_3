package ua.lviv.iot.Chemistry_Instruments.managers;

import ua.lviv.iot.Chemistry_Instruments.models.ChemistryInstrument;
import ua.lviv.iot.Chemistry_Instruments.models.TypeOfInstruments;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

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


        ((ChemistryInstrumentManagerImpl) manager).setChemistryInstrumentList(
                chemistryInstrumentList);


        System.out.println(manager.findByType(TypeOfInstruments.BASIS));
        System.out.println(manager.sortByType(chemistryInstrumentList,
                true));
        System.out.println(manager.sortByYear(chemistryInstrumentList,
                false));







    }
}
