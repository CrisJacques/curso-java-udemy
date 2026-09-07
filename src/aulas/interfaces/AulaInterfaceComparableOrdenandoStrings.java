package aulas.interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AulaInterfaceComparableOrdenandoStrings {

    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        String filePath = "C:\\temp\\names.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line = br.readLine(); // O readLine lê uma linha do arquivo e retorna null se a linha lida for a última do arquivo

            while (line != null) {
                names.add(line);
                line = br.readLine();
            }

            Collections.sort(names);

            for (String name : names){
                System.out.println(name);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
