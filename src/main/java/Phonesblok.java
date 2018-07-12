import java.util.*;
/**
 * Shafikov Almir
 */
class Phonesblok {

    private Map<String, HashSet<String>> masiv;

    Phonesblok() {
        this.masiv = new HashMap<>();
    }

    void add(String lastNumber, String phoneblok) {
        HashSet<String> numbers;
        if (masiv.containsKey(lastNumber)) {
            numbers = masiv.get(lastNumber);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneblok);
        masiv.put(lastNumber, numbers);
    }
    Set<String> get(String lastNumber) {
        return masiv.get(lastNumber);
    }
}