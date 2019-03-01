import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProgramCollection {
    public static void main(String args[]) throws IOException {

        TreeMap<String, Integer> dataMap = new TreeMap();
        int i;

        Scanner scanner = new Scanner (new File ("C:\\Loadtest\\dictionary.txt"));
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            if (dataMap.isEmpty() != true && dataMap.containsKey(word)) {
                dataMap.put(word, dataMap.get(word) + 1);
            }
            else {
                dataMap.put(word, 1);
            }
        }
        Integer count = 1;
        String word = new String();
        for(Map.Entry e : dataMap.entrySet()){
            if ((Integer)e.getValue() > count) {
                count = (Integer)e.getValue();
                word = (String)e.getKey();
            }
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println("Result: \"" + word + "\" - " + count);
        }
    }
