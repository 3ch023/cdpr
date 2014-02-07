package com.epam.cdp.task1;

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
    public static void main(String[] args) throws IOException {

        Pattern pattern = Pattern.compile("([a-zA-Z]+)(.*)");

        BufferedReader br = new BufferedReader(new FileReader("wap.txt"));
        String line = br.readLine();

        Storage hashMapStorage = new HashMapStorage();
        Storage treeMapStorage = new TreeMapStorage();
        String[] words;
        Matcher matcher;

        while (line != null) {
            words = line.split(" ");
            for(String word : words) {
                matcher = pattern.matcher(word);
                if(matcher.matches()) {
                    word = matcher.group(1);

                    hashMapStorage.add(word.toLowerCase());
                    treeMapStorage.add(word.toLowerCase());
                }
            }
            line = br.readLine();
        }

        test(hashMapStorage);
        test(treeMapStorage);

    }

    static public void test(Storage storage) {
        int entryCount;
        int uniqueWordsCount;
        long start;
        long end;

        for(int i = 0; i < 3; i++) {
            start = System.currentTimeMillis();

            entryCount = storage.entryCount("love");
            uniqueWordsCount = storage.uniqueWordsCount();

            end = System.currentTimeMillis();

            System.out.println(i + "Time: " + (end - start));

        }
        System.out.println();
    }
}

