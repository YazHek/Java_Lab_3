package ua.lviv.iot.Chemistry_Instruments.managers;

import ua.lviv.iot.Chemistry_Instruments.models.ChemistryInstrument;

import java.io.*;
import java.util.List;

public class ChemistryInstrumentManagerWriter {

    private String path;

    ChemistryInstrumentManagerWriter() {

    }

    ChemistryInstrumentManagerWriter(final String pathObj) {
        this.path = pathObj;
    }

    public final void writeToFile(
            final List<ChemistryInstrument> chemistryInstrumentList) {

        File chemistryListFile = new File(path + ".csv");

        try (FileOutputStream fos = new FileOutputStream(chemistryListFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bWriter = new BufferedWriter(osw)) {

            for (ChemistryInstrument
                    chemistryInstrument : chemistryInstrumentList) {

                bWriter.write(chemistryInstrument.getHeaders());
                bWriter.newLine();
                bWriter.write(chemistryInstrument.toCSV());
                bWriter.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final String getPath() {

        return path;
    }

    public final void setPath(final String pathObj) {

        this.path = pathObj;
    }
}
