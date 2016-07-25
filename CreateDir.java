/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author JAYESH
 */
import java.io.File;

public class CreateDir {
   public static void main(String args[]) {
      String dirname = "D:/JAVA/TEST/FILE/tmp/user/java/bin/test.txt";     //creates only directory not file
      File d = new File(dirname);
      // Create directory now.
      d.mkdirs();
  }
}
