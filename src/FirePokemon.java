import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final static String TYPE = "fire";

    List<String> attacks = Arrays.asList("Firelash", "Flamethrower", "Pyroball", "Inferno");

    List<String> getAttacks() {
        return attacks;
    }

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Firelash");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "electric" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Flamethrower");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "electric" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Pyroball");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "electric" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "electric" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
}