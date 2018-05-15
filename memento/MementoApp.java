package patternsP.memento;

import patternsP.memento.model.Game;
import patternsP.memento.persist.File;

public class MementoApp {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("level 1", 39);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("level 2", 4);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);
    }
}





