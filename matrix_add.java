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
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class count
{
    String filename=null;
    count(String filename)
    {
        this.filename=filename;
    }
    int col() throws FileNotFoundException,IOException               //count no of column
    {
        //Assume each line has equal tokens
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String firstline = br.readLine();
        StringTokenizer strToken = new StringTokenizer(firstline," ");
        return strToken.countTokens();
    }
    int row() throws IOException
    {
        List<String> lines = Files.readAllLines(Paths.get(filename),Charset.defaultCharset());
        return lines.size();
        
    }
}

class array
{
    String lineIWant="",filename=null;
    double[][] matrix;
    int row,col;
    array(String filename,int row,int col) throws FileNotFoundException, IOException
    {
        this.filename=filename;
        this.row=row;
        this.col=col;
        
        FileInputStream fs= new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        List<String> lines = Files.readAllLines(Paths.get(filename),Charset.defaultCharset());
        for(int i = 0; i < lines.size(); i++)
        {
            lineIWant = lineIWant+br.readLine()+" ";
        }
    }

    double[][] create_matrix() throws IOException
    {
        StringTokenizer strToken = new StringTokenizer(lineIWant," ");
        matrix = new double[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j] = Double.parseDouble((String)strToken.nextElement());
            }
        }
        return matrix;
    }
}

public class matrix_add {
    public static void main(String[] args) throws IOException {
        double[][] mat1,mat2;
        String file1,file2;
        Scanner sc=new Scanner(System.in);
        count c1,c2;
        array a;
        File f1,f2;
        Path p1,p2;
        
        //Matrix 1
        System.out.println("Enter the absolute path for matrix 1");             
        String m1_path =sc.nextLine();                                          //get path in string format                
        p1 = Paths.get(m1_path);                                                //absolute path in object p1
        f1 = new File(m1_path);                                                 //create object of file
        if(f1.exists() && !f1.isDirectory())                                    //check file exit or not
            file1=f1.getName();                                                 //get filename from path
        else
        {
            System.out.println("INVALID INPUT");
            return;                                                
        }
        
        //Matrix 2
        System.out.println("Enter the the absolute path for matrix 2");
        String m2_path =sc.nextLine();
        p2 = Paths.get(m2_path);
        f2 = new File(m2_path);
        if(f2.exists() && !f2.isDirectory())                                                 
            file2=f2.getName(); 
        else
        {
            System.out.println("INVALID INPUT");
            return;                                               
        }
        
        c1=new count(file1);
        a=new array(file1,c1.row(),c1.col());
        mat1 = a.create_matrix();
        
        c2=new count(file2);
        a=new array(file2,c2.row(),c2.col());
        mat2 = a.create_matrix();
        if(c1.row()==c2.row()&&c1.col()==c2.col())
        {
            try {
            PrintWriter fw = new PrintWriter("C:\\Users\\JAYESH KORI\\Desktop\\mat_add.txt");        //printing to output file ans.txt
            for(int i = 0; i < c1.row(); i++)
           {
               for(int j =0; j < c1.col(); j++)
               {
                   fw.format("%10s",String.valueOf(mat1[i][j]+mat2[i][j]+" "));
               }
               fw.println();
           }
            fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        else    
            System.out.println("Addition of "+c1.row()+"*"+c1.col()+" with "+c2.row()+"*"+c1.col()+" not possible");
        
    }
}
