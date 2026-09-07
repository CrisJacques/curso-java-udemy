package aulas.trabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aulaFileWriterBufferedWriter {

    public static void main(String[] args){

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" }; // Esta é uma forma de inicializar um vetor já com valores

        String path = "C:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){// Dessa forma, o arquivo é recriado toda vez que rodamos o programa
            // Para que ele não seja recriado a cada execução, basta adicionar o argumento true na chamada do FileWriter, ou seja:
            // try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line); // O write() não tem quebra de linha, temos que adicionar manualmente através do newLine()
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
