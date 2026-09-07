package aulas.trabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class aulaInformacoesCaminhoArquivo {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // Retorna só o nome do arquivo, sem o caminho
        System.out.println("getParent: " + path.getParent()); // Retorna só o caminho da pasta onde está o arquivo, sem o nome do arquivo
        System.out.println("getPath: " + path.getPath()); // Retorna o caminho completo do arquivo

        sc.close();

    }


}
