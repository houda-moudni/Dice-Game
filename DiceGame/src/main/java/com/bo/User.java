package com.bo;

import java.util.HashMap;
import java.util.Map;

public class User {


    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String password;
    private int score;
    private int highScore;
    private HashMap<String, Integer> lanceMap = new HashMap<>(Map.ofEntries(
            Map.entry("lance1", -1),
            Map.entry("lance2", -1),
            Map.entry("lance3", -1)
    ));




    public User(String nom, String prenom, String email, String username, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User(String nom, String prenom, String email, String username, String password, int score, int highScore) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.username = username;
        this.password = password;
        this.score = score;
        this.highScore = highScore;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public HashMap<String, Integer> getLanceMap() {
        return lanceMap;
    }

    public void setLanceMap(HashMap<String, Integer> lanceMap) {
        this.lanceMap = lanceMap;
    }

}
