package com.epam.cdp.task1.subtask3.storage;

import java.util.LinkedList;

/**
 * Created by Mariia_Lukianets on 11.02.14.
 */
public class LinkedListStorage extends ListStorage{
    public LinkedListStorage() {
        internalStorage = new LinkedList<String>();
    }
}
