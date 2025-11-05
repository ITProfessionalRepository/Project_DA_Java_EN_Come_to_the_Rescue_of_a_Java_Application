package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * This method provide a result treatment text file named "result.out".
     * In this file symptoms are ordered by alphabetic order and have been count.
     * The file is in src folder.
     *
     * For working this method take in parameters the lists provide by methods,
     * getSymptoms and symptomsUniqueList.
     *
     * @param symptomsList
     * @param uniqueSymptomsList
     */

    @Override
    public void writeSymptoms(List<String> symptomsList, List<String> uniqueSymptomsList) {
        try {
            // Création du fichier de sortie
            FileWriter writer = new FileWriter("result.out");

            writer.write("File name: result.out " + "\n" +
                    "Symptoms count and sort by alphabetical order :" + "\n" + "\n");
            for (String symptomLine : uniqueSymptomsList) {
                int count = 0;
                for (String symptomOnWork : symptomsList) {
                    if (symptomOnWork.equals(symptomLine)) {
                        count++;
                    }
                }
                String lineToWrite = symptomLine + " : " + count;
                writer.write(lineToWrite + "\n");
            }

            writer.close();
            System.out.println("\n Results have been recorded on file 'result.out'.");

        } catch (IOException e) {
            System.err.println("Error during the file reading process : " + e.getMessage());
        }
    }
}
