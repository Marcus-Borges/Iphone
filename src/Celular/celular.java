package Celular;


import Aparelho.Iphone.aparelhoMultifuncional;
import Aparelho.aparelhoTelefonico.aparelhoTelefonico;
import Aparelho.navegadorInternet.navegadorInternet;
import Aparelho.reprodutorMusical.reprodutorMusical;


public class celular {
    public static void main(String[] args) {
        aparelhoMultifuncional em = new aparelhoMultifuncional();
        aparelhoTelefonico aparelhoTelefonico = em;
        navegadorInternet navegadorInternet = em;
        reprodutorMusical appleMusic = em;

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.iniciarCorreioVoz();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina("www.dio.me");
        appleMusic.tocar();
        appleMusic.pausar();
        appleMusic.selecionarMusica("Nirvana Nevermind");
        
    }
}
