import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.logging.Logger;


/*
* This is the Main framework which runs a problem and its solution.
* It does chanhe with problem or type of input to problem or its solution.
* Only thing it takes as argument is a instance of Problem
* @author smanes
* */
public class MainFramework {
    /* Console logs should be part of loggers
    *  */

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
