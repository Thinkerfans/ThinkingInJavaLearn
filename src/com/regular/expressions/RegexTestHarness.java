package com.regular.expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//学习网址：http://www.java3z.com/cwbwebhome/article/article8/Regex/Java.Regex.Tutorial.html#reg8_6
public class RegexTestHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
        while (true) { 
            System.out.printf("%nEnter your regex: "); 
            Pattern pattern = Pattern.compile(scanner.nextLine()); 
            System.out.printf("Enter input string to search: "); 
            Matcher matcher = pattern.matcher(scanner.nextLine()); 
            boolean found = false; 
            while (matcher.find()) { 
                System.out.printf( 
                        "I found the text \"%s\" starting at index %d and ending at index %d.%n", 
                        matcher.group(), matcher.start(), matcher.end() 
                    ); 
                found = true; 
            } 
            if (!found) { 
                System.out.printf("No match found.%n"); 
            } 
        } 
	}
}
