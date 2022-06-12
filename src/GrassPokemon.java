import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final static String TYPE = "grass";

    List<String> attacks = Arrays.asList("Leafstorm", "Solarbeam", "Leechseed", "Leaveblade");

    List<String> getAttacks() {
        return attacks;
    }

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leafstorm");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Solarbeam");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leechseed");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaveblade");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
}