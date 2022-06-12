import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner speler_A = new Scanner(System.in);
        PokemonGymImpl pokemonGym = new PokemonGymImpl();
        System.out.println("#######################################################################");
        System.out.println("### ~~                                                           ~~ ###");
        System.out.println("### |-> WELCOME TO POKEMON INTERFACE - A NOVI BACKEND ASSIGMENT <-| ###");
        System.out.println("### ~~                                                           ~~ ###");
        System.out.println("#######################################################################");
        System.out.println("\nWelcome stranger!");
        System.out.println("What is your name?");
        String userA = speler_A.nextLine();
        PokemonTrainer player1 = new PokemonTrainer(userA);
        List<Pokemon> names = new ArrayList<>();
        names.add(player1.getBlastoise());
        names.add(player1.getGyarados());
        names.add(player1.getCharizard());
        names.add(player1.getDitto());
        names.add(player1.getRaichu());
        names.add(player1.getVenusaur());
        player1.setPokemons(names);
        System.out.println("\nWelcome again " + player1.getName() + ".\nI am the console that is going to help you with your battles!");
        System.out.println("We are going to give you 6 Pokemons.");
        System.out.println("These are the Pokemons you can use:");
        System.out.println("\n~~~~~~~~~~~~~");
        pokemonGym.printPokemon(names);
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("\nWould you like to enter the gym looking for a fight?");
        System.out.println("Please enter yes or no");
        if (speler_A.nextLine().equals("yes")) {
            pokemonGym.enteredTheGym(player1);
        }

    }


}