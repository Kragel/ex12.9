package t_12_errorHandingWithExceptions.ex09.exceptions;

public class FirstEx extends RuntimeException {

    private static final long serialVersionUID = 6543713852637314675L;

    public FirstEx()
    {
        super();
    }

    public FirstEx(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
    }

    public FirstEx(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }

    public FirstEx(String arg0)
    {
        super(arg0);
    }

    public FirstEx(Throwable arg0)
    {
        super(arg0);
    }

}
