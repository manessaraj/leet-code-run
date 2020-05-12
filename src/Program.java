import java.util.logging.Logger;


/*
* This is abstract definition of problem and type of input this problem takes.
* It follows Factory Method Design Pattern to instanciate the solution for this problem.
* */
public abstract class Program {

    /*
    * This class should define all the helper methods needed to create Stress Testing environment.
    * This also need to write up parser methods to provide leet code type interface.
    * */


    private Logger logger;

    public Program() {}

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public abstract Solution createSolution();
    public abstract void initializeInput();
}
