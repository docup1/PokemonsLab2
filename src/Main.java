import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon[] team1 = new Pokemon[]{
            new Heatran("Heatran (team1)", 2),
            new Hippowdon("Hippowdon (team1)", 3),
            new Blissey("Blissey (team1)", 1),
        };
        Pokemon[] team2 = new Pokemon[]{
            new Hippopotas("Hippopotas (team2)", 2),
            new Happiny("Happiny (team2)", 4),
            new Chansey("Chansey (team2)", 4),
        };

        for (Pokemon pokemon: team1) {
            battle.addAlly(pokemon);
        }
        for (Pokemon pokemon: team2) {
            battle.addFoe(pokemon);
        }

        battle.go();
    }
}