import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaVotacion sistema = new SistemaVotacion();
        Scanner scanner = new Scanner(System.in);

        sistema.agregarCandidato("Candidato A");
        sistema.agregarCandidato("Candidato B");

        sistema.registrarVotante("Votante 1");
        sistema.registrarVotante("Votante 2");

        boolean deseaVotar = true;

        do {
            System.out.println("Ingrese el nombre del votante: ");
            String nombreVotante = scanner.nextLine();

            System.out.println("Elige el candidato para tu voto (A o B): ");
            String candidatoElegido = scanner.nextLine();

            sistema.realizarVoto(nombreVotante, "Candidato " + candidatoElegido.toUpperCase());

            sistema.contarVotos();

            boolean respuestaValida = false;
            while (!respuestaValida) {
                System.out.println("\n¿Desea ingresar otro voto? (Sí/No): ");
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("si")) {
                    respuestaValida = true;
                } else if (respuesta.equals("no")) {
                    respuestaValida = true;
                    deseaVotar = false;
                } else {
                    System.out.println("Por favor, ingrese 'Sí' o 'No'.");
                }
            }
        } while (deseaVotar);

        scanner.close();
    }
}
