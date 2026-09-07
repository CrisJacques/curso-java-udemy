package aulas.classesMetodosAbstratos;

import model.entities.Circulo;
import model.entities.Retangulo;
import model.entities.Shape;
import model.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AulaMetodosAbstratos {

    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numShapes = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i<= numShapes; i++){
            System.out.println("Shape #" + i + " data: ");

            System.out.print("Rectangle or Circle (r/c)? ");
            String recOrCircle = sc.next();
            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            sc.nextLine();

            if ("r".equals(recOrCircle)){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();

                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();

                shapes.add(new Retangulo(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();

                shapes.add(new Circulo(color, radius));
            }

        }

        System.out.println();

        System.out.println("SHAPE AREAS: ");
        for (Shape shape: shapes){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }

}
