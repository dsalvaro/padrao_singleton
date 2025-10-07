package org.example;

public class GameSettings {

    // Instância única
    private static GameSettings instance = null;

    // Configurações do jogo
    private int volume;
    private String dificuldade;
    private String tema;

    // Construtor privado
    private GameSettings() {
        this.volume = 50; // padrão 50%
        this.dificuldade = "Médio";
        this.tema = "Clássico";
        System.out.println("Configurações iniciais carregadas!");
    }

    // Método para obter a instância
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    // Getters e Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
