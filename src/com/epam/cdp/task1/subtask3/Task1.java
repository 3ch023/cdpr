package com.epam.cdp.task1.subtask3;

import com.epam.cdp.task1.subtask3.storage.*;
import sun.misc.Regexp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mariia_Lukianets on 05.02.14.
 */
public class Task1 {
    static private Pattern pattern = Pattern.compile("([a-zA-Z]+)(.*)");

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new FileReader("wap.txt"));
//        String line = br.readLine();

        Storage hashMapStorage = new HashMapStorage();
        System.out.println("HashMap:");
        testStorage(hashMapStorage, "wap.txt");

        Storage treeMapStorage = new TreeMapStorage();
        System.out.println("TreeMap:");
        testStorage(treeMapStorage, "wap.txt");

        Storage arrayListStorage = new ArrayListStorage();
        System.out.println("ArrayListMap:");
        testStorage(arrayListStorage, "wap.txt");

        Storage linkedListStorage = new LinkedListStorage();
        System.out.println("LinkedListMap:");
        testStorage(linkedListStorage, "wap.txt");
    }

    static public void testStorage(Storage storage, String fileName) throws IOException {
        long start, end;
        int entryCount, uniqueWordsCount;
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
        //initializing time
        end = System.currentTimeMillis();
        System.out.println("Initializing time: " + (end - start));

        //
        start = System.currentTimeMillis();
        entryCount = storage.entryCount("love");
        uniqueWordsCount = storage.uniqueWordsCount();

        end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));
        System.out.println("entry count: " + entryCount + ", unique words: " + uniqueWordsCount + "\n");

    }
}

