package jp.kobeu.cs.daikibo.cms_poc.exception;

public class ComicException extends RuntimeException{
    public static final int COMIC_ALREADY_EXISTS = 101;
    public static final int NO_SUCH_COMIC = 102;
    int code;

    public ComicException(int code, String message){
        super(message);
        this.code = code;
    }
}
