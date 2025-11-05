package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {


    public List<String> getSymptoms() {
        List<String> symptomsListe = new ArrayList<>();

        try (BufferedReader reader_1 = new BufferedReader(new FileReader("symptoms.txt"))) {
            String line;

            while ((line = reader_1.readLine()) != null) {
                symptomsListe.add(line.trim().toLowerCase());
            }

        } catch (IOException e) {
            System.err.println("error during file reading : " + e.getMessage());
        }
        return symptomsListe;
    }

    public List<String> symptomsUniqueListe(List<String> symptomsListe) {

        // Liste des symptômes uniques
        List<String> uniqueSymptomsListe = new ArrayList<>();
        for (String symptom : symptomsListe) {
            if (!uniqueSymptomsListe.contains(symptom)) {
                uniqueSymptomsListe.add(symptom);
            }
        }

        // Tri alphabétique
        Collections.sort(uniqueSymptomsListe);

        return uniqueSymptomsListe;
    }

    public void countSymptoms(List<String> symptomsListe, List<String> uniqueSymptomsListe) {
        // Comptage des occurrences
        System.out.println("Symptoms list and their frequency : " + "\n" );
        for (String symptom : uniqueSymptomsListe) {
            int count = 0;
            for (String s : symptomsListe) {
                if (s.equals(symptom)) {
                    count++;
                }
            }
            System.out.println(symptom + " : " + count);
        }
    }
}


