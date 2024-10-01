package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

import set.Pesquisa.AgendaContatos;

public class agendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public agendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pequisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
    agendaContatos agendaContatos = new agendaContatos();

    // Adicionar contatos
    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("João", 5665);
    agendaContatos.adicionarContato("Carlos", 1111111);
    agendaContatos.adicionarContato("Ana", 654987);
    agendaContatos.adicionarContato("Maria", 1111111);
    agendaContatos.adicionarContato("Camila", 44444);

    agendaContatos.exibirContato();

    // Remover um contato
    agendaContatos.removerContato("Maria");
    agendaContatos.exibirContato();

    // Pesquisar número por nome
    String nomePesquisa = "João";
    Integer numeroPesquisa = agendaContatos.pequisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaContatos.pequisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}
