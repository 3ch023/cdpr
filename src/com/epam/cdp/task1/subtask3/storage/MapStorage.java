package com.epam.cdp.task1.subtask3.storage;

import java.util.Map;

/**
 * Created by Mariia_Lukianets on 07.02.14.
 */
public abstract class MapStorage implements Storage {
    Map<String, Integer> internalStorage;

    @Override
    public void add(String word) {
        Integer entryCount = internalStorage.get(word) == null ? 0 : internalStorage.get(word);
        internalStorage.put(word, ++entryCount);
    }

    @Override
    public int entryCount(String word) {
        return internalStorage.get(word) == null ? 0 : internalStorage.get(word);
    }

    @Override
    public int uniqueWordsCount() {
        return internalStorage.size();
    }
}
