package util;

import view.Printer;

public class MyException extends Exception{

    public MyException(){
        super();
    }

    public MyException(String msg){
        super(msg);
    }
}
