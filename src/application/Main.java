package application;

import application.dominio.Endereco;
import application.searchAPI.ServicoAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Endereco> endereco = ServicoAPI.buscarAPI();
        for(Endereco e: endereco){
            System.out.println("=================================================================");
            System.out.printf("Id: %s \nAbbreviation: %s \nCity: %s \nConference: %s\n", e.getId(), e.getAbbreviation(), e.getCity(), e.getConference());
        }
    }

}