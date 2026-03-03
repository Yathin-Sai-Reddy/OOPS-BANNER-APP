public class UC3_StringJoin {

    public static void main(String[] args) {

        printLine(" ***   ", " ***   ", " ***** ", "****** ");
        printLine("*   *  ", "*   *  ", "*    * ", "*      ");
        printLine("*   *  ", "*   *  ", "*    * ", "*      ");
        printLine("*   *  ", "*   *  ", "*****  ", "******");
        printLine("*   *  ", "*   *  ", "*          ", " * ");
        printLine("*   *  ", "*   *  ", "*          ", " * ");
        printLine(" ***   ", " ***   ", "       ", "******");
    }

    public static void printLine(String a, String b, String c, String d) {

        String line = String.join("   ", a, b, c, d);
        System.out.println(line);
    }
}