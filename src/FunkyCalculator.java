import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FunkyCalculator {

    // Összeadja a paraméterként kapott két számot.
    public double add(double first, double second) {
        return first + second;
    }

    // Kivonja az első számból a másodikat.
    public double subtract(double first, double second) {
        // TODO
        return 0;
    }

    // Visszaadja a két szám közti különbséget, ami sosem lesz negatív(!).
    public double getDifference(int first, int second) {
        // TODO fix bugs
        return first - second;
    }

    // Visszaadja a két szám szorzatának abszolútértékét.
    public double multiplyAbsoluteValue(double first, double second) {
        // TODO
        return 0;
    }

    // Elosztja az első paramétert a másodikkal, lefelé kerekít egy tizedesjegyig.
    public double divideWithOneDecimalPointRoundingDown(int dividend, int divisor) {
        DecimalFormat decimalFormat = new DecimalFormat(".#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return Double.parseDouble(decimalFormat.format((double) dividend / divisor));
    }

    // Elosztja az első paramétert a másodikkal, felfelé kerekít két tizedesjegyig.
    public double divideWithTwoDecimalPointsRoundingUp(int dividend, int divisor) {
        // TODO
        return 0;
    }

    // Eldönti a paraméterről, hogy páros szám-e.
    public boolean isEven(int number) {
        return false;
    }

    // Eldönti a paraméterről, hogy páratlan szám-e.
    public boolean isOdd(int number) {
        return false;
    }

    // Visszaadja a mátrix legelső sorát.
    public int[] getFirstRow(int[][] matrix) {
        return matrix[0];
    }

    // Visszaadja a mátrix utolsó sorát.
    public int[] getLastRow(int[][] matrix) {
        // TODO
        return null;
    }

    // Visszaadja a tömb első és utolsó sorát összeadva kapott tömböt.
    // (Az első sor i-edik elemét összeadja az utolsó sor i-edik elemével és ez lesz
    // a keletkező tömb i-edik eleme.
    // Tipp: használhatod a már megírt metódusaid!
    public int[] getSumOfFirstAndLastRow(int[][] matrix) {
        // TODO
        return null;
    }

    // Visszaadja a mátrix bal oszlopát.
    public int[] getLeftColumn(int[][] matrix) {
        // TODO
        return null;
    }

    // Visszaadja a mátrix jobb oszlopát.
    public int[] getRightColumn(int[][] matrix) {
        // TODO
        return null;
    }

    // Visszaadja a tömb bal és jobb oszlopát összeadva (egyesével az elemeket) kapott tömböt.
    public int[] getSumOfLeftAndRightColumn(int[][] matrix) {
        // TODO
        return null;
    }


}
