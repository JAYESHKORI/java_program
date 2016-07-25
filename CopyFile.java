/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JAYESH
 */
public class CopyFile {
    public static void main(String args[]) throws IOException
   {
      //FileInputStream in = null;
      //FileOutputStream out = null;
      
      FileReader in = null;
      FileWriter out = null;

      try {
         //in = new FileInputStream("D:\\JAVA\\TEST\\FILE\\input.txt");
         //out = new FileOutputStream("output.txt");
         
         in = new FileReader("D:\\JAVA\\TEST\\FILE\\input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
