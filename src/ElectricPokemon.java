import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final static String TYPE = "electric";

    List<String> attacks = Arrays.asList("Thunderpunch", "Electroball", "Thunder", "Volttackle");

    List<String> getAttacks() {
        return attacks;
    }

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunderpunch");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "grass" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Electroball");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "grass" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "grass" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Volttackle");
        int temp = 0;
        switch (enemy.getType()) {
            case "water" -> {
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
                System.out.println("This attack was super-effective!");
            }
            case "fire" -> {
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println("This was normal hit!");
            }
            case "electric" -> {
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println("This wasn't an effective attack");
            }
            case "grass" -> {
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
                System.out.println("This was an effective attack!");
            }
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
}