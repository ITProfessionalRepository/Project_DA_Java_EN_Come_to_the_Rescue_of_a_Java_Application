package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomWriter {
    /**
     * This method write a result treatment file.
     *
     * @param symptomsList
     * @param uniqueSymptomsList
     */
    public void writeSymptoms(List<String> symptomsList, List<String>uniqueSymptomsList) ;
}
