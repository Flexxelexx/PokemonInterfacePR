import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final static String TYPE = "water";

    List<String> attacks = Arrays.asList("Surf", "Hydropump", "Hydrocanon", "Raindance");

    List<String> getAttacks() {
        return attacks;
    }

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "fire" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydropump");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "fire" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydrocanon");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "fire"  -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Raindance");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "fire" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
            case "grass" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
}