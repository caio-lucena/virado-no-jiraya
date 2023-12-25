package javacore.Oexception.exception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTeste05 {
    public static void main(String[] args) {

        try {
            podeLancarExcecao();
        } catch (SQLException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void podeLancarExcecao() throws SQLException, FileNotFoundException {
        System.out.println("Testando throws com múltiplas exceções...");
    }
}