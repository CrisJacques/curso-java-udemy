package aulas.trabalhandoComArquivos;

import model.entities.ProdutoExercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioArquivos {
    static List<ProdutoExercicio> produtos = new ArrayList<>();
    static String filePath;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        readProducts();
        writeSummary();
    }

    public static void readProducts(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo CSV com dados de itens vendidos: ");
        filePath = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine(); // O readLine lê uma linha do arquivo e retorna null se a linha lida for a última do arquivo

            while (line != null) {
                String[] lineContent = line.split(",");
                produtos.add(new ProdutoExercicio(lineContent[0], Double.parseDouble(lineContent[1]), Integer.parseInt(lineContent[2])));
                line = br.readLine();
            }

            System.out.println("Preview do output file: ");
            for (ProdutoExercicio produto : produtos){
                System.out.println(produto.getName() + "," + String.format("%.2f", produto.subTotal()));
            }
        }
        catch(IOException e){
            System.out.println("Erro ao abrir arquivo para leitura: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }

    public static void writeSummary(){
        System.out.println();
        String outputFolder = new File(filePath).getParent() + "\\out";

        boolean success = new File(outputFolder).mkdir();

        if (success){
            System.out.println("Pasta " + outputFolder + " criada com sucesso!");
        }
        else{
            System.out.println("Pasta " + outputFolder + " já existe.");
        }

        String outputFile = outputFolder + "\\summary.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))){
            for (ProdutoExercicio produto : produtos){
                String line = (produto.getName() + "," + String.format("%.2f", produto.subTotal()));
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Arquivo " + outputFile + " criado com sucesso!");
        }
        catch (IOException e){
            System.out.println("Erro na criação do arquivo: " + e.getMessage());
        }
    }
}
