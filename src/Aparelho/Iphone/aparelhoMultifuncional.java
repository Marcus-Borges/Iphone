package Aparelho.Iphone;

import Aparelho.aparelhoTelefonico.aparelhoTelefonico;
import Aparelho.navegadorInternet.navegadorInternet;
import Aparelho.reprodutorMusical.reprodutorMusical;

// iPhone.java
public class aparelhoMultifuncional implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {

    public void tocar() {
        System.out.println("APARELHO TOCANDO");
    }

    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("NIRVANA - NERVERMIND");
    }

    public void exibirPagina(String url) {
        System.out.println("WWW.DIO.ME");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZAR PAGINA");
    }

    public void atender() {
        System.out.println("TELEFONE TOCANDO");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("MENSAGEM NO CORREIO DE VOZ");
    }
        
    public void ligar(String numero) {
        System.out.println("123456789");
    }
    
}
