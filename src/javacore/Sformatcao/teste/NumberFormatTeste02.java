package javacore.Sformatcao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;

        NumberFormat [] numberFormats = new NumberFormat[3];

        numberFormats [0] = NumberFormat.getCurrencyInstance(localeDefault);
        numberFormats [1] = NumberFormat.getCurrencyInstance(localeUS);
        numberFormats [2] = NumberFormat.getCurrencyInstance(localeJP);

        double ammount = 337_485.99043;

        for (NumberFormat nf: numberFormats){

            System.out.println(
                    "Casas decimais para "
                    + nf.getCurrency() + " com "
                    + nf.getMaximumFractionDigits()
                    + " casas decimais"
            );

            System.out.println(nf.format(ammount));
        }

        String ammountStr = "$100,397.00"; // é preciso usar algo semelhante ao NumberFormat.getCurrencyInstance()

        try{
            System.out.println(numberFormats[1].parse(ammountStr));
        }
        catch (ParseException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
