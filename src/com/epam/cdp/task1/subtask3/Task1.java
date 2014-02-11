package com.epam.cdp.task1.subtask3;

import com.epam.cdp.task1.subtask3.storage.*;
import sun.misc.Regexp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mariia_Lukianets on 05.02.14.
 */
public class Task1 {
    static Pattern pattern = Pattern.compile("([a-zA-Z]+)(.*)");

    public static void main(String[] args) throws IOException {

        String fileName = "wap.txt";


        Storage hashMapStorage = new HashMapStorage();
        System.out.println("HashMap");
        testStorage(hashMapStorage, fileName);

        Storage treeMapStorage = new TreeMapStorage();
        System.out.println("TreeMap");
        testStorage(treeMapStorage, fileName);

        Storage linkedListStorage = new LinkedListStorage();
        System.out.println("LinkedList");
        testStorage(linkedListStorage, fileName);

        Storage arrayListStorage = new ArrayListStorage();
        System.out.println("ArrayList");
        testStorage(arrayListStorage, fileName);

    }

    static public void testStorage(Storage storage, String fileName) throws IOException {
        int entryCount, uniqueWordsCount;
        long start, end;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        String[] words;
        Matcher matcher;

        start = System.currentTimeMillis();
        while (line != null) {
            words = line.split(" ");
            for(String word : words) {
                matcher = pattern.matcher(word);
                if(matcher.matches()) {
                    word = matcher.group(1);
                    storage.add(word.toLowerCase());
                }
            }
            line = br.readLine();
        }
        end = System.currentTimeMillis();
        System.out.println("Initialization time: " + (end - start));


        start = System.currentTimeMillis();
        entryCount = storage.entryCount("love");
        uniqueWordsCount = storage.uniqueWordsCount();
        end = System.currentTimeMillis();

        System.out.println("Methods time: " + (end - start));
        System.out.println("Entry count: " + entryCount + ", unique words: " + uniqueWordsCount);
        System.out.println();
    }
}

