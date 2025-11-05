package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSymptomDataToFile implements ISymptomWriter {

    @Override
    public void writeSymptoms(List<String> symptomsListe, List<String> uniqueSymptomsListe) {
        try {
            // Création du fichier de sortie
            FileWriter writer = new FileWriter("result.out");

            writer.write("File name: result.out " + "\n" +
                    "Symptoms count and sort by alphabetical order :" + "\n" + "\n");
            for (String symptomLine : uniqueSymptomsListe) {
                int count = 0;
                for (String symptomOnWork : symptomsListe) {
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
