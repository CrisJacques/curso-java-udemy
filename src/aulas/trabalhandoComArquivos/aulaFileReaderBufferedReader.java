package aulas.trabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aulaFileReaderBufferedReader {
    // A forma de leitura de arquivos mostrada aqui não é muito bacana, é verbosa e manual demais, mas a ideia aqui é só mostrar
    //como funciona a abertura manual das streams de leitura de arquivos. Na aula de try-with-resources, iremos ver uma forma bem
    //mais elegante de fazer isso.
    // --> Obs.:o bloco try-with-resources está disponível no Java 7 em diante

    public static void main(String[] args){

        String path = "C:\\temp\\in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try{
            fr = new FileReader(path); // Cria um stream de leitura de arquivos (ou seja, uma sequência de leitura)
            br = new BufferedReader(fr); // Classe que possui otimizações para deixar a leitura de arquivos mais rápida

            String line = br.readLine(); // O readLine lê uma linha do arquivo e retorna null se a linha lida for a última do arquivo

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try{ // É necessário um bloco try aqui porque também pode ocorrer IOException na tentativa de fechar as streams fr e br
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
