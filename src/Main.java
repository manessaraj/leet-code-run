import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.logging.Logger;


/*
* @author smanes
* */
public class Main {
    /* Console logs should be part of loggers
    *  */

    //TODO: How can I inject Logger into Program Objects: Design Pattern
    private final static Logger logger = Logger.getLogger("Main");


    /*
    * Idea is every concept should run from here, if I change something.
    * TODO: NextLevel: Variable number Concepts should run from here.
    *  Which concept is to be run should come from config file.
    * */
    public static Program getRunObject() {
        throw new NotImplementedException();
    }



    public static void main(String [] args) {
        Program program = getRunObject();
        if (program != null) {
            program.run();
        }
    }
}
