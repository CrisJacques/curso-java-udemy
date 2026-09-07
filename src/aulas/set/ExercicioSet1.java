package aulas.set;

import model.entities.Log;

import java.io.*;
import java.time.Instant;
import java.util.*;

public class ExercicioSet1 {

    public static void main(String[] args){

        Set<Log> logs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String filePath = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();

            while(line != null){
                String[] content = line.split(" ");

                logs.add(new Log(content[0],  Instant.parse(content[1])));

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total users: " + logs.size());

        sc.close();
    }

}
