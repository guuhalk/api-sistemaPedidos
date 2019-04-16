package br.com.gdaniel.cursomc.Services.Exceptions;

public class DataIntegrityViolationException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityViolationException(String msg) {
		super(msg);
	}
	
	public DataIntegrityViolationException (String msg, Throwable causa) {
		super(msg,causa);
	}
	
}
