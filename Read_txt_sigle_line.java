/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author JAYESH
 */
public class Read_txt_sigle_line {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fs= new FileInputStream("input.txt");
BufferedReader br = new BufferedReader(new InputStreamReader(fs));

List<String> lines = Files.readAllLines(Paths.get("input.txt"),Charset.defaultCharset());
String lineIWant="";
        for(int i = 0; i < lines.size(); i++)
        {
            lineIWant = lineIWant+br.readLine()+" ";
        }
        
        System.out.println(lineIWant);
    }
}
