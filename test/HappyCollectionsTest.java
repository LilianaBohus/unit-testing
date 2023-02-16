import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HappyCollectionsTest {
    HappyCollections happyCollections = new HappyCollections();

    @Test
    void getFirstElement_ofNullList() {
        // Figyeljük meg, hogyan működik az assertThrows!
        // Itt azt vizsgáljuk, hogy az általunk definiált Throwable (Exception vagy Error) valóban "eldobódik-e"
        assertThrows(NullPointerException.class, () -> happyCollections.getFirstElement(null)) ;
    }

    // TODO opcionális haladó feladat: definiálj egy saját exception osztályt és dobd el azt, ha null a paraméterként
    //  kapott listád! Írj rá tesztet is!

    // TODO írj további teszt(ek)et a getFirstElement() metódusra!
    @Test
    void getEvenNumbers_hasSameSize() {
        List<Integer> actual = happyCollections.getEvenNumbers(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = List.of(2, 4);
        assertEquals(expected.size(), actual.size());
    }

    @Test
    void getEvenNumbers_hasSameElements() {
        List<Integer> actual = happyCollections.getEvenNumbers(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = List.of(2, 4);
        assertEquals(expected, actual);
    }

    @Test
    void getEvenNumbers_hasSameElements_withDuplicates() {
        List<Integer> actual = happyCollections.getEvenNumbers(List.of(1, 2, 3, 4, 5, 2));
        List<Integer> expected = List.of(2, 4, 2);
        assertEquals(expected.size(), actual.size());
    }

}