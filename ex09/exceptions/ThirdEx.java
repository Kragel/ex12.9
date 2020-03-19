package t_12_errorHandingWithExceptions.ex09.exceptions;

public class ThirdEx extends RuntimeException {

    private static final long serialVersionUID = 7364848868451762339L;

    public ThirdEx()
    {
        super();
    }

    public ThirdEx(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
    }

    public ThirdEx(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }

    public ThirdEx(String arg0)
    {
        super(arg0);
    }

    public ThirdEx(Throwable arg0)
    {
        super(arg0);
    }

}
