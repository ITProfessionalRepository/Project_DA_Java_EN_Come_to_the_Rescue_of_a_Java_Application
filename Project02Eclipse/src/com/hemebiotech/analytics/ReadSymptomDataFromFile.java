package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ReadSymptomDataFromFile implements ISymptomReader {

    /** This method read the file "symptoms.txt" in input.
     * This file must be in src folder.
     * This method provide a first symptoms list used by the two other methods.
     *
     * @return List<String> symptomsListe.
     */
    @Override
    public List<String> getSymptoms() {
        List<String> symptomsList = new ArrayList<>();

        try (BufferedReader reader_1 = new BufferedReader(new FileReader("symptoms.txt"))) {
            String line;

            while ((line = reader_1.readLine()) != null) {
                symptomsList.add(line.trim().toLowerCase());
            }

        } catch (IOException e) {
            System.err.println("error during file reading : " + e.getMessage());
        }
        return symptomsList;
    }

    /**
     * This method give a symptoms list where a symptom have only one occurrence.
     * The symptoms are listed by alphabetic order.
     * This list will be used by method countSymptoms as symptoms list reference.
     *
     * @param symptomsList
     * @return List<String> uniqueSymptomsListe.
     */
    @Override
    public List<String> symptomsUniqueList(List<String> symptomsList) {

        List<String> uniqueSymptomsList = new ArrayList<>();
        for (String symptom : symptomsList) {
            if (!uniqueSymptomsList.contains(symptom)) {
                uniqueSymptomsList.add(symptom);
            }
        }

        // List sort by alphabetic order.
        Collections.sort(uniqueSymptomsList);

        return uniqueSymptomsList;
    }

    /**
     * This method compare the list given by method getSymptoms and symptomsUniqueListe.
     * Symptoms occurrence are count in getSymptoms method list.
     * The list given by method symptomsUniqueListe is used as symptoms reference.
     *
     * @param symptomsList
     * @param uniqueSymptomsList
     */
    @Override
    public void countSymptoms(List<String> symptomsList, List<String> uniqueSymptomsList) {

        System.out.println("Symptoms list and their frequency : " + "\n" );
        for (String symptom : uniqueSymptomsList) {
            int count = 0;
            for (String s : symptomsList) {
                if (s.equals(symptom)) {
                    count++;
                }
            }
            System.out.println(symptom + " : " + count);
        }
    }
}


