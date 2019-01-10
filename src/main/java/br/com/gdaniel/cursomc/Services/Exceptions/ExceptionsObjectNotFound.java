package br.com.gdaniel.cursomc.Services.Exceptions;

public class ExceptionsObjectNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ExceptionsObjectNotFound(String msg) {
		super(msg);
	}
	
	public ExceptionsObjectNotFound (String msg, Throwable causa) {
		super(msg,causa);
	}

}
