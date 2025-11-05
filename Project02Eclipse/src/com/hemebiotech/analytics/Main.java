package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> symptomsListe;
    static List<String> uniqueSymptomsListe;

    public static void main(String[] args) {
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
        WriteSymptomDataToFile writter = new WriteSymptomDataToFile();
        AnalyticsCounter analyse_1 = new AnalyticsCounter (reader, writter);
        symptomsListe = analyse_1.getSymptoms();
        uniqueSymptomsListe = analyse_1.symptomsUniqueListe(symptomsListe);
        analyse_1.countSymptoms(symptomsListe, uniqueSymptomsListe);
        analyse_1.writeSymptoms(symptomsListe, uniqueSymptomsListe);

    }
}
