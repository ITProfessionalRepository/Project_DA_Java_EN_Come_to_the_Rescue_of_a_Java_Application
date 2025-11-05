package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomWriter {
    /**
     * This method write a file where symptoms are count and order by alphabetic order.
     *
     * @param symptomsListe
     * @param uniqueSymptomsListe
     */
    public void writeSymptoms(List<String> symptomsListe, List<String>uniqueSymptomsListe) ;
}
