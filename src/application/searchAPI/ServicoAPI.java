package application.searchAPI;


import application.dominio.Endereco;
import application.utils.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ServicoAPI {
    static String URL = "https://www.balldontlie.io/api/v1/teams";
    public static List<Endereco> buscarAPI() throws Exception {
        try {
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() != 200)
                throw new RuntimeException("HTTP error code : " + connection.getResponseCode());
            BufferedReader response = new BufferedReader(new InputStreamReader((connection.getInputStream())));

            return Util.converteJsonEmString(response);
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}