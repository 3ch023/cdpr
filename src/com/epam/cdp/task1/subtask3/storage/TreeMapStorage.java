package com.epam.cdp.task1.subtask3.storage;

import com.epam.cdp.task1.subtask3.storage.MapStorage;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Mariia_Lukianets on 07.02.14.
 */
public class TreeMapStorage extends MapStorage {
    public TreeMapStorage() {
        this.storage = new TreeMap<String, Integer>();
    }

}
