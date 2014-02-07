package com.epam.cdp.task1;

/**
 * Created by Mariia_Lukianets on 05.02.14.
 */
public interface Storage {
    public void add(String word);
    public int entryCount(String word);
    public int uniqueWordsCount();
}
