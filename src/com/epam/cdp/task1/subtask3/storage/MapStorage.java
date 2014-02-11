package com.epam.cdp.task1.subtask3.storage;

import java.util.Map;

/**
 * Created by Mariia_Lukianets on 07.02.14.
 */
public abstract class MapStorage implements Storage {
    Map<String, Integer> storage;

    @Override
    public void add(String word) {
        Integer entryCount = storage.get(word) == null ? 0 : storage.get(word);
        storage.put(word, ++entryCount);
    }

    @Override
    public int entryCount(String word) {
        return storage.get(word) == null ? 0 : storage.get(word);
    }

    @Override
    public int uniqueWordsCount() {
        int count = 0;
        for(Map.Entry<String, Integer> entry : storage.entrySet()) {
            if(entry.getValue() == 1) {
                count ++;
            }
        }
        return count;
    }
}
package com.epam.cdp.task1.subtask3.storage;

        import java.util.Map;

/**
 * Created by Mariia_Lukianets on 07.02.14.
 */
public abstract class MapStorage implements Storage {
    Map<String, Integer> storage;

    @Override
    public void add(String word) {
        Integer entryCount = storage.get(word) == null ? 0 : storage.get(word);
        storage.put(word, ++entryCount);
    }

    @Override
    public int entryCount(String word) {
        return storage.get(word) == null ? 0 : storage.get(word);
    }

    @Override
    public int uniqueWordsCount() {
        int count = 0;
        for(Map.Entry<String, Integer> entry : storage.entrySet()) {
            if(entry.getValue() == 1) {
                count ++;
            }
        }
        return count;
    }
}