package application;

import application.dominio.Endereco;
import application.searchAPI.ServicoGetAPI;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Endereco> endereco = ServicoGetAPI.buscarAPI();
        for(Endereco e: endereco){
            System.out.println("=================================================================");
            System.out.printf("Id: %s \nAbbreviation: %s \nCity: %s \nConference: %s\n", e.getId(), e.getAbbreviation(), e.getCity(), e.getConference());
        }
    }

}