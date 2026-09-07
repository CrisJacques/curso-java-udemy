package aulas.composicao;

import model.entities.Comment;
import model.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AulaComposicao2 {

    public static void main(String[] args){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime momentPost1 = LocalDateTime.parse("21/06/2018 13:05:44", dtFormatter);
        String titlePost1 = "Traveling to New Zealand";
        String contentPost1 = "I'm going to visit this wonderful country!";
        int likesPost1 = 12;

        LocalDateTime momentPost2 = LocalDateTime.parse("28/07/2018 23:14:19", dtFormatter);
        String titlePost2 = "Good night guys";
        String contentPost2 = "See you tomorrow";
        int likesPost2 = 5;

        Post post1 = new Post(momentPost1, titlePost1, contentPost1, likesPost1);
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));

        Post post2 = new Post(momentPost2, titlePost2, contentPost2, likesPost2);
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println("============== Informações sobre o Post 1: =======================");
        System.out.println(post1);

        System.out.println();

        System.out.println("============== Informações sobre o Post 2: =======================");
        System.out.println(post2);

    }

}
