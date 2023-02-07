package org.howard.edu.lsp.assignment2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class WordCounter {

    public static void main(String[] args) {
    	
    	//Almutairi

    	
        String filePath = "src/main/java/resources/input.txt";

        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
            	
                String L = scanner.nextLine();
                
                String[] words = L.split(" ");
                
                for (String text : words) {
                	
                	text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]+","");
                    
                    if (wordCount.containsKey(text)) {
                    	
                        wordCount.put(text, wordCount.get(text) + 1);
                        
                    } else 
                    {
                    	
                        wordCount.put(text, 1);
                    }
                }
            }
            scanner.close();
            for (String text : wordCount.keySet()) {
                System.out.println(text + ": " + wordCount.get(text));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Wrong path!!: " + filePath);
        }
    }
}