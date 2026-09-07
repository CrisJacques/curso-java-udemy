package aulas.trabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aulaTryWithResources {
    // O bloco try-with-resources está disponível no Java 7 em diante e é responsável por garantir o fechamento das streams de leitura,
    //ou seja, não precisamos mais nos preocupar em fechá-las manualmente (por exemplo, usando o .close())

    public static void main(String[] args){

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
// Não precisa mais dessas duas linhas abaixo e nem de um finally lá no final tentando fechar as streams br e fr. É só colocar tudo dentro do try, como mostrado acima.
//        BufferedReader br = null;
//        FileReader fr = null;

            String line = br.readLine(); // O readLine lê uma linha do arquivo e retorna null se a linha lida for a última do arquivo

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
