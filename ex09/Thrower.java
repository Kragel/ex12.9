package t_12_errorHandingWithExceptions.ex09;

import t_12_errorHandingWithExceptions.ex09.exceptions.*;

public class Thrower {

    public void throwException(int number)
    {
        switch (number)
        {
        case 0:
            throw new FirstEx("This is FirstEx");
        case 1:
            throw new SecondEx("This is SecondEx");
        case 2:
            throw new ThirdEx("This is ThirdEx");
        }
    }

}
