package aulas.trabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class aulaManipulandoPastasComFile {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);// Em File::isDirectory o :: indica uma sintaxe chamada reference method (referência a métodos), ou seja,
        //estamos passando o nome de um método como argumento da função. No caso desse exemplo, serão listados os arquivos que são do tipo diretório (ou seja, que
        //File::isDirectory é true

        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        System.out.println();

        // Criando uma subpasta dentro da pasta informada pelo usuário
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();

    }

}
