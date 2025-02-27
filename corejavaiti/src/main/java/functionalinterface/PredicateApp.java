package functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        String[] players = {
                "Ragnar",  // Starts with 'R'
                "Riley",
                "Rico",
                "Raiden",
                "Raymond",
                "Brandon",  // Contains 'd'
                "Edward",
                "David",
                "Landon",
                "Derek",
                "Xander",  // Ends with 'er'
                "Jasper",
                "Tyler",
                "Hunter",
                "Asher"
        };
        List<String>playerList= Arrays.asList(players);
        System.out.println(getBeginWith(playerList,s->s.startsWith("R")));
        System.out.println(getBeginWith(playerList,s->s.contains("D")));
        System.out.println(getBeginWith(playerList,s->s.endsWith("er")));

    }

    private static List<String> getBeginWith(List<String> list, Predicate<String> valid) {
        List<String> selected = new ArrayList<>();
        list.forEach(player -> {
            if (valid.test(player)) {
                selected.add(player);
            }
        });
        return selected;
    }
}
