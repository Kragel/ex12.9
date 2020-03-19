package t_12_errorHandingWithExceptions.ex09.exceptions;

public class SecondEx extends RuntimeException {

    private static final long serialVersionUID = -5887385463220646584L;

    public SecondEx()
    {
        super();
    }

    public SecondEx(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
    }

    public SecondEx(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }

    public SecondEx(String arg0)
    {
        super(arg0);
    }

    public SecondEx(Throwable arg0)
    {
        super(arg0);
    }
}
