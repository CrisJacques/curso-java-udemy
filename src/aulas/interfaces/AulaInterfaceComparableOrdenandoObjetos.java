package aulas.interfaces;

import model.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class AulaInterfaceComparableOrdenandoObjetos {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        String filePath = "C:\\temp\\employees.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            List<Funcionario> employees = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double salary = Double.parseDouble(fields[2]);

                employees.add(new Funcionario(id, name, salary));

                line = br.readLine();
            }

            Collections.sort(employees); // Para que uma classe possa ter seus objetos ordenados usando o Collections.sort(), ela precisa implementar a interface Comparable, como foi feito na classe Funcionario

            for (Funcionario employee : employees){
                System.out.println(employee);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
