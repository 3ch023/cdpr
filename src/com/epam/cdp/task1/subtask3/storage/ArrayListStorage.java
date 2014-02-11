package com.epam.cdp.task1.subtask3.storage;

import java.util.ArrayList;

/**
 * Created by Mariia_Lukianets on 11.02.14.
 */
public class ArrayListStorage extends ListStorage{
    public ArrayListStorage() {
        internalStorage = new ArrayList<String>();
    }
}
