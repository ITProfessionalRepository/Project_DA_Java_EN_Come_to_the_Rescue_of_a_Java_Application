package com.hemebiotech.analytics;

import java.util.List;

/**
 * This interface provide methods for reading symptoms on "symptoms.txt" file and obtain
 * a symptoms list and count.
 */
public interface ISymptomReader {

    /**
     * This method read a data source in input, like a text file, and will be doing a data preparation,
     *  like remove unnecessary empty space, before and after string.
     *  This method provide a symptoms list used by other methods.
     *
     * @return List<String>
     */
	public List<String> getSymptoms ();

    /**
     * This method give a symptoms list where a symptom have only one occurrence.
     *
     * @param symptomsList
     * @return List<String>
     */
    public List<String> symptomsUniqueList (List<String> symptomsList);

    /**
     * This method count all symptoms occurrence in a data source like a text file, and provide
     * a list of all symptoms with their count.
     *
     * @param symptomsList
     * @param uniqueSymptomsList
     */
    public void countSymptoms (List<String>symptomsList, List<String>uniqueSymptomsList);
}
