package aulas.trabalhandoComArquivos;

import model.entities.ProdutoExercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioArquivosRefatoradoChatGpt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Path inputFile = readInputFilePath(sc);

            List<ProdutoExercicio> produtos =
                    readProducts(inputFile);

            showPreview(produtos);

            writeSummary(inputFile, produtos);

        } catch (IOException e) {
            System.out.println(
                    "Erro ao processar o arquivo: "
                            + e.getMessage()
            );
        } finally {
            sc.close();
        }
    }

    private static Path readInputFilePath(Scanner sc) {
        System.out.print(
                "Digite o caminho do arquivo CSV com dados de itens vendidos: "
        );

        return Path.of(sc.nextLine());
    }

    private static List<ProdutoExercicio> readProducts(Path filePath)
            throws IOException {

        List<ProdutoExercicio> produtos = new ArrayList<>();

        try (BufferedReader br =
                     Files.newBufferedReader(filePath)) {

            String line;

            while ((line = br.readLine()) != null) {
                produtos.add(parseProduct(line));
            }
        }

        return produtos;
    }

    private static ProdutoExercicio parseProduct(String line) {

        String[] fields = line.split(",");

        return new ProdutoExercicio(
                fields[0],
                Double.parseDouble(fields[1]),
                Integer.parseInt(fields[2])
        );
    }

    private static void showPreview(
            List<ProdutoExercicio> produtos) {

        System.out.println();
        System.out.println("Preview do output file:");

        for (ProdutoExercicio produto : produtos) {
            System.out.println(
                    formatProductSummary(produto)
            );
        }
    }

    private static void writeSummary(
            Path inputFile,
            List<ProdutoExercicio> produtos)
            throws IOException {

        Path outputFolder =
                inputFile.getParent().resolve("out");

        Files.createDirectories(outputFolder);

        Path outputFile =
                outputFolder.resolve("summary.csv");

        try (BufferedWriter bw =
                     Files.newBufferedWriter(outputFile)) {

            for (ProdutoExercicio produto : produtos) {
                bw.write(formatProductSummary(produto));
                bw.newLine();
            }
        }

        System.out.println();
        System.out.println(
                "Arquivo criado com sucesso: "
                        + outputFile
        );
    }

    private static String formatProductSummary(
            ProdutoExercicio produto) {

        return String.format(
                Locale.US,
                "%s,%.2f",
                produto.getName(),
                produto.subTotal()
        );
    }
}
