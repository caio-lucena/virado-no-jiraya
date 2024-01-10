package javacore.Oexception.dominio;

public class LoginInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message){
        super(message);
    }
}
