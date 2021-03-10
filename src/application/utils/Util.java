package application.utils;


import application.dominio.Endereco;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {


    public static List<Endereco> converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String[] listaRaiz;
        String apenasEu;
        String[] listaSeparador;
        List<String> geral = new ArrayList<>();
        List<Endereco> listaObj = new ArrayList<>();
        String response, jsonEmString = "";

        while ((response = buffereReader.readLine()) != null) {
            jsonEmString += response;
            for (int b = 0; b < 10; b++) { //Setando um numero maximo de resultados
                listaRaiz = jsonEmString.substring(10).split("},"); //Tirando caracters especiais, para deixar da forma que eu quero
                listaSeparador = listaRaiz[b].split(","); //Separando por virgula
                geral.add(Arrays.toString(listaSeparador));
            }
            for (int a = 0; a < 10; a++) {

                apenasEu = geral.get(a).replaceAll("[{\"id\":]| \"abbreviation\":| \"city\":| \"conference\":| \"division\":| \"full_name\":| \"name\":", "").replace("[", ""); //Tirando as coisas que não vou usar
                listaObj.add((new Endereco(apenasEu.split(","))));
            }
        }
        System.out.println("====================================");
        System.out.println("1 - Sem Formatação: " + jsonEmString);
        System.out.println("2 - Com Formatação: " + listaObj);
        return listaObj;
    }
}
