package design.patterns;

import design.patterns.ui.Player;
import design.patterns.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}