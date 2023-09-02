package org.gamingconsole;

public class Main {
    public static void main(String[] args) {
        GameConsole gameConsole = new Badminton();
        gameConsole.computeScore();

        GameConsole gameConsole1 = new Chess();
        gameConsole1.computeScore();
    }
}

