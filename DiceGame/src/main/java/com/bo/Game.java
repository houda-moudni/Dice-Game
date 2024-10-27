package com.bo;

import java.util.HashMap;
import java.util.Random;

public class Game {

    private boolean gameOver = false;
    private User user;

    public Game(User user) {
        this.user = user;
    }

    public void resetGame() {
        gameOver = false;
        user.setScore(0);
        user.setLanceMap(new HashMap<String, Integer>() {{
            put("lance1", -1);
            put("lance2", -1);
            put("lance3", -1);
        }});
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNumberGames(User user){
        int i = 0;
        for(Integer it : user.getLanceMap().values()){
            if(it != -1){
                i++;
            }
        }
        return  i ;
    }
    public void putDice(User user, int userInputDice, int pDice){
        HashMap<String, Integer> dice =user.getLanceMap();
        dice.put("lance"+userInputDice,pDice);
        user.setLanceMap(dice);
    }

    public boolean isDiceThrown(User user, int i){

        return !(user.getLanceMap().get("lance"+i) == -1);
    }

    public boolean play(User user, int userInputDice) {
        int sum = 0;
        if (!gameOver && getNumberGames(user) < 3) {
            if (isDiceThrown(user, userInputDice)) {
                setGameOver(true);
                user.setScore(0);
            } else {
                int pDice = new Random().nextInt(6) + 1;
                System.out.println(pDice);
                if (userInputDice == 1 && pDice > 4 || userInputDice == 2 && pDice > 5) {
                    setGameOver(true);
                    user.setScore(0);
                } else {
                    putDice(user, userInputDice, pDice);
                }
            }
        }

        if (getNumberGames(user) == 3) {
            if (user.getLanceMap().get("lance1") < user.getLanceMap().get("lance2") &&
                    user.getLanceMap().get("lance2") < user.getLanceMap().get("lance3")) {
                for (Integer it : user.getLanceMap().values()) {
                    sum += it;
                }
                setGameOver(true);
                user.setScore(sum);
            } else {
                setGameOver(true);
                user.setScore(0);
            }
        }

        return isGameOver();
    }


}

