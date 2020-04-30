/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendingtracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author willqueree
 */
public class Caeser {

  private File file;

  public Caeser(String path) {

    this.file = new File(path);

  }
    
    public Caeser(){}

  public void encrypt(int shift, String tempType) throws FileNotFoundException {

    File temp = new File("temp." + tempType);

    try {

      BufferedReader inFile = new BufferedReader(new FileReader(file));
      FileWriter fileWriter = new FileWriter(temp);

      int c;
      while ((c = inFile.read()) != -1) {
        fileWriter.write((char)(c + shift));
      }

      inFile.close();
      fileWriter.close();

      file.delete();
      temp.renameTo(file);

    } 
    
    catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void decrypt(int shift, String tempType) throws FileNotFoundException {

    File temp = new File("temp." + tempType);

    try {

      BufferedReader inFile = new BufferedReader(new FileReader(file));
      FileWriter fileWriter = new FileWriter(temp);

      int c;
      while ((c = inFile.read()) != -1) {
        fileWriter.write((char)(c - shift));
      }

      inFile.close();
      fileWriter.close();

      file.delete();
      temp.renameTo(file);

    } 
    
    catch (IOException e) {
      throw new FileNotFoundException();
    }

  }
  
    public boolean isValid(char letter){
        return ((letter >= 47 && letter <= 122));
    }
  
    public String encryptString(int shift, String text) {

        String newString = "";

        for (int i = 0; i < text.length(); i++){
            if (isValid(text.charAt(i))){
                newString += (char)((int)text.charAt(i) - shift);
            }
        }

        return newString;
    }
    
    public String decryptString(int shift, String text) {

        String newString = "";

        for (int i = 0; i < text.length(); i++){
            if (isValid(text.charAt(i))){
                newString += (char)((int)text.charAt(i) + shift);
            }
        }

        return newString;
    }


}