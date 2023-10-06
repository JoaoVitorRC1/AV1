package br.com.questao1;

public class Encontrar {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("João", "joaovrc0510@gmail.com", "54321");
        AchadoPerdido acpd = new AchadoPerdido("Futebol", "Livro Alugado", "Esporte", "Perdido");

        System.out.printf(acpd.buscarTitulo());
        System.out.printf(acpd.vizualizarDetalhes());

    }
}
