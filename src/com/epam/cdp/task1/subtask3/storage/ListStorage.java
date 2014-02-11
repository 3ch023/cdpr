package com.epam.cdp.task1.subtask3.storage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mariia_Lukianets on 11.02.14.
 */
public abstract class ListStorage implements Storage{

    protected List<String> internalStorage;

    @Override
    public void add(String word) {
        internalStorage.add(word);
    }

    @Override
    public int entryCount(String word) {
        int entryCount = 0;
        for(String entry : internalStorage) {
            if(entry.equals(word)) {
                entryCount++;
            }
        }
        return entryCount;
    }

    @Override
    public int uniqueWordsCount() {
        Set<String> uniqueWords = new HashSet<String>();
        for(String entry : internalStorage) {
            uniqueWords.add(entry);
        }
        return uniqueWords.size();
    }
}
