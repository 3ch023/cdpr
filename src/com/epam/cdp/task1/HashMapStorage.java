package com.epam.cdp.task1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mariia_Lukianets on 05.02.14.
 */
public class HashMapStorage extends MapStorage{
    public HashMapStorage() {
        this.storage = new HashMap<String, Integer>();
    }

}
