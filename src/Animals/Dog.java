package Animals;

/**
 * @author Nagarjuna
 * */
public class Dog {

    /**
     * Instance variable :
     * We can have as many instance variables we need*/
    public int weightInPounds;

    /**
     * Constructor: Defines how to instantiate the classes
     *
     * Here in this case we need to instantiate the class with the size
     *
     * In Python :
     *      def __init__ (self, startSize)
     *
     *  In Java we do not need to specify the self it is internally handeled.
     * */

    public Dog(int startingWeight) {
        weightInPounds = startingWeight;
    }

    /**
     * Non-Static methods :
     * If the method is going to be invoked by the instance of the class then the method should be Non-Static.
     *
     * Note :
     * If this non-static method is not accessed by the instance of the class then there will be error because a program runs from
     * the static main method .
     * Error : A non-static method can not be invoked by the static method.
     * */

    public void makeNoise () {
        if (weightInPounds <= 10) {
            System.out.println("kow..kow..");
        } else if (weightInPounds <= 30) {
            System.out.println("Bark ..Bark..");
        } else {
            System.out.println("Bow...bOw ..Boww");
        }

    }
}
