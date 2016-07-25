/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author JAYESH
 */
public class Read_no_of_line_file {
    public static void main(String[] args) throws IOException
    {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
        int noOfLines = lines.size();
        System.out.println(""+noOfLines);
    }
}
