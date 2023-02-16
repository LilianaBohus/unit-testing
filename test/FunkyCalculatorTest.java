import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// TODO Próbáld ki futtatni Run with Coverage opcióban!
// (Class neve mellett oldalt a Play gombra kattintva felajnál egy ilyen lehetőséget)
class FunkyCalculatorTest {

    // Példányosítom a tesztelendő objektumomat (órán statikus függvényekkel dolgoztunk,
    // ott azért nem volt szükség példányosításra).
    FunkyCalculator funkyCalculator = new FunkyCalculator();

    @Test
    void add() {
        assertEquals(10.0, funkyCalculator.add(3.0, 7.0));
    }

    @Test
    void subtract() {
        // TODO
    }

    @Test
    void getDifference_withFirstNumberBigger() {
        assertEquals(4, funkyCalculator.getDifference(8, 4));
    }

    @Test
    void getDifference_withSecondNumberBigger() {
        assertEquals(4, funkyCalculator.getDifference(4, 8));
    }

    @Test
    void divideIntegers_shouldReturnDouble() {
        assertEquals(1.5, funkyCalculator.divideWithOneDecimalPointRoundingDown(6, 4));
    }

    @Test
    void divideIntegers_shouldReturnOneDecimalPoint() {
        assertEquals(1.2, funkyCalculator.divideWithOneDecimalPointRoundingDown(11, 9));
    }

    @Test
    void divideIntegers_shouldRoundDown() {
        assertEquals(1.1, funkyCalculator.divideWithOneDecimalPointRoundingDown(7, 6));
    }

    // TODO
    // Írj teszteseteket a divideWithTwoDecimalPointsRoundingUp-ra!
    // Gondold át, miket érdemes letesztelni, legalább 3 tesztet írj!

    @Test
    void isEven_testEvenNumber(){
        // Figyeljük meg, hogy nem assertEquals-t használunk!
        // (Természetesen azzal is meg lehetne csinálni, csak így szebb és tömörebb.)
        assertTrue(funkyCalculator.isEven(10));
    }

    @Test
    void isEven_testOddNumber(){
        assertFalse(funkyCalculator.isEven(11));
    }

    // TODO
    // Írj teszteket az isOdd metódusra, használd az assertTrue és assertFalse függvényeket!

    @Test
    void getFirstRow_asymmetricMatrix() {
        int[][] testMatrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
        // Tömbök összehasonlítására az assertArrayEquals-t használjuk.
        // TODO Próbáld ki, mi történik, ha sima assertEqualst használsz! Miért?
        assertArrayEquals(new int[]{1, 2, 3, 4}, funkyCalculator.getFirstRow(testMatrix));
    }

    // TODO
    // Írj még egy tesztet a getFirstRow metódusra, ami egy 2*4-es mátrixot vizsgál!
    // Ez azt jelenti, hogy 2 sora és 4 oszlopa van.


}