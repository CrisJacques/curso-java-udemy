package aulas.map;

import java.util.Map;
import java.util.TreeMap;

public class AulaMap {

    public static void main(String [] args){

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");

        cookies.put("phone", "99711133"); // como o Map não aceita repetições de chaves, então ele vai sobrescrever o valor da chave "phone" com o valor informado aqui

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); // quando a chave não existe, o Map retorna null
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " +  cookies.get(key));
        }

    }


}
