package model.exception;


public class DomainException extends RuntimeException {

    private static final long serialVersionUI = 1L;

    public DomainException(String msg) {
        super(msg);
    }

}
