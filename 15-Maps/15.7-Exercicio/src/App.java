import entities.Candidato;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        String path = "/home/alfaneto/Documents/Java-Completo/15-Maps/15.7-Exercicio/votos.csv";
        Map<String, Candidato> candidatos = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();

            while (line != null) {
                String[] dados = line.split(",");
                String nome = dados[0];
                int votosUrna = Integer.parseInt(dados[1]);

                if (!candidatos.containsKey(nome)) {
                    candidatos.put(nome, new Candidato(nome));
                }

                candidatos.get(nome).adicionarVotos(votosUrna);

                line = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, Candidato> entry : candidatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getQtdVotos());
        }
    }
}
