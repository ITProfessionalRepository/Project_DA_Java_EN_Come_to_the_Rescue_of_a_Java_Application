package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> symptomsList;
    static List<String> uniqueSymptomsList;

    public static void main(String[] args) {
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
        WriteSymptomDataToFile writter = new WriteSymptomDataToFile();
        AnalyticsCounter analyse_1 = new AnalyticsCounter (reader, writter);
        symptomsList = analyse_1.getSymptoms();
        uniqueSymptomsList = analyse_1.symptomsUniqueList(symptomsList);
        analyse_1.countSymptoms(symptomsList, uniqueSymptomsList);
        analyse_1.writeSymptoms(symptomsList, uniqueSymptomsList);

    }
}
