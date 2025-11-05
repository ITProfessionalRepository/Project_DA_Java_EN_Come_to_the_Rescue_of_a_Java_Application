package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {

    /**
     * This method read the file 'symptoms.txt' in input and remove unnecessary empty space, befor and after string.
     *  It is a data treatment befor symptoms analyse.
     *
     * @return List<String>
     */
	public List<String> getSymptoms ();

    /**
     * This method give the symptoms list by alphabetic order.
     *  The result is a symptoms list where a symptom have only one occurrence.
     *
     * @param symptomsListe
     * @return List<String>
     */
    public List<String> symptomsUniqueListe (List<String> symptomsListe);

    /**
     * This method count all symptoms present in the file 'symptoms.txt' and give a list.
     *
     * @param symptomsListe
     * @param uniqueSymptomsListe
     */
    public void countSymptoms (List<String>symptomsListe, List<String>uniqueSymptomsListe);
}
