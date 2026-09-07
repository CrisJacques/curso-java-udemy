package aulas.trabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class aulaFile {

    public static void main(String[] args){

        File file = new File("C:\\temp\\in.txt"); // A gente usa \\ porque a \ sozinha é prefixo de caracteres especiais, tais como \n, \t, etc.
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
