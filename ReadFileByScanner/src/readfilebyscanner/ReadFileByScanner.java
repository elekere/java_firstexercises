/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfilebyscanner;

/**
 *
 * @author GODSGRACE
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileByScanner {
     
    public static void main(String[] args) {

File file = new File("Olodo.txt");
    
Scanner sc = new Scanner(System.in);
while (sc.hasNextLine()) {
    
    String line = sc.nextLine();
    System.out.println(line);
}
    }
    
 }