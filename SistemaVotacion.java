import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaVotacion {
    private List<String> candidatos;
    private List<String> votantesRegistrados;
    private Map<String, String> votos;

    public SistemaVotacion() {
        candidatos = new ArrayList<>();
        votantesRegistrados = new ArrayList<>();
        votos = new HashMap<>();
    }

    public void registrarVotante(String nombre) {
        votantesRegistrados.add(nombre);
    }

    public void agregarCandidato(String nombre) {
        candidatos.add(nombre);
    }

    public void realizarVoto(String votante, String candidato) {
        if (votantesRegistrados.contains(votante) && candidatos.contains(candidato)) {
            votos.put(votante, candidato);
        }
    }

    public void contarVotos() {
        Map<String, Integer> conteoVotos = new HashMap<>();
        for (String candidato : candidatos) {
            int votosParaCandidato = 0;
            for (String voto : votos.values()) {
                if (voto.equals(candidato)) {
                    votosParaCandidato++;
                }
            }
            conteoVotos.put(candidato, votosParaCandidato);
            System.out.println("Candidato: " + candidato + " - Votos: " + votosParaCandidato);
        }
    }
}
