import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HappyCollections {

    // Visszaadja a lista első elemét.
    public Integer getFirstElement(List<Integer> list) {
        return list.get(0);
    }

    // Visszaadja a listából az összes páros elemet.
    public List<Integer> getEvenNumbers(List<Integer> list) {
        // TODO
        return null;
        // Akit érdekel: streamekkel megoldva így nézne ki:
        // return list.stream().filter(x -> x % 2 == 0).toList();
    }

    // TODO Implementáld az alábbi metódusokat és írj is rájuk teszteket!

    // Visszaadja a listából az összes páratlan elemet.
    public List<Integer> getOddNumbers(List<Integer> list) {
        return null;
    }

    // Visszaadja a lista minden olyan  elemét, ami a paraméterként kapott sztringgel kezdődik.
    public List<String> getAllStartingWith(List<String> list, String string) {
        return null;
    }

    // Összefűzi a paraméterként kapott két listát.
    public List<Integer> concat(List<Integer> first, List<Integer> second) {
        return null;
    }

    // Visszaadja, hány olyan eleme van a listának, ami többször szerepel.
    public int numberOfDuplicates(List<Integer> list) {
        return 0;
    }

    // Készít egy map-et arról, hogy a listában melyik String hányszor fordult elő.
    public Map<String, Long> countOccurences(List<String> list) {
        return null;
        // Streamekkel így nézne ki:
        // return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
