package aulas.map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioMap {

    public static void main(String[] args){
        Map<String, Integer> candidateResult = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String filePath = sc.nextLine();
        // Arquivo deste exercício: C:\temp\candidatos.csv

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);
                
                if (candidateResult.containsKey(name)){
                    int votesSoFar = candidateResult.get(name);

                    candidateResult.put(name, votesSoFar += votes);
                }
                else {
                    candidateResult.put(name, votes);
                }
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String candidate : candidateResult.keySet()){
            System.out.println(candidate + ": " + candidateResult.get(candidate));
        }

        sc.close();

    }


}
