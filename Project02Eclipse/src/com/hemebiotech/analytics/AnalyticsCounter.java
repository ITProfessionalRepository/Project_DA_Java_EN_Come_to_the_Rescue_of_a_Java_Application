package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AnalyticsCounter  {

    ISymptomReader iSymptomReader;
    ISymptomWriter iSymptomWriter;


    public AnalyticsCounter (ISymptomReader iSymptomReader, ISymptomWriter iSymptomWriter){
        this.iSymptomReader = iSymptomReader;
        this.iSymptomWriter = iSymptomWriter;
    }
    //Symptoms file 'symptoms.txt' is read.
    public List<String> getSymptoms () {
        return iSymptomReader.getSymptoms();
    }
    //Get a symptoms list with one occurrence and alphabetic order.
    public List<String> symptomsUniqueList (List<String> symptomsList){
        return iSymptomReader.symptomsUniqueList(symptomsList);
    }
    //Symptoms are count and the result is print in the console.
    public void countSymptoms (List<String> symptomsList, List<String> uniqueSymptomsList) {
        iSymptomReader.countSymptoms(symptomsList,uniqueSymptomsList);
    }
    //Symptoms are count and the result is print in the file result.out.
    public void writeSymptoms(List<String> symptomsList, List<String> uniqueSymptomsList) {
        iSymptomWriter.writeSymptoms(symptomsList,uniqueSymptomsList);
    }
}
