import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private String name;

    FirePokemon charizard = new FirePokemon("Charizard", 35, 120, "Meat", "Charrrr");
    WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 120, "Meat", "Blaaaast");
    WaterPokemon gyarados = new WaterPokemon("Gyarados", 45, 120, "Fish", "Gyaradoooooss");
    GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 120, "Grass", "Venusaaaaauuur");
    GrassPokemon ditto = new GrassPokemon("Ditto", 55, 120, "Grass", "Ditttooooo");
    ElectricPokemon raichu = new ElectricPokemon("Raichu", 60, 120, "Thunderbolts", "Raichuuuuuu");


    List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, gyarados, venusaur, ditto, raichu);

    public PokemonTrainer(String name) {
        this.name = name;
    }


    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}