package javacore.Sformatcao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeUS = Locale.US;
        Locale localeJapan = Locale.JAPAN;

        NumberFormat [] numberFormats = new NumberFormat[3];

        numberFormats [0] = NumberFormat.getNumberInstance(localeDefault);
        numberFormats [1] = NumberFormat.getNumberInstance(localeUS);
        numberFormats [2] = NumberFormat.getNumberInstance(localeJapan);

        double value = 100_000.33345;

        for (NumberFormat nf: numberFormats){
            System.out.println(nf.format(value));
        }
    }
}
