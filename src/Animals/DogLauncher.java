package Animals;

/**
 * @author  Nagarjuna.
 */
public class DogLauncher {

    public static void main(String[] args) {

        /*Instantiation of the Dog object with Dog Constructor giving the wieght intially */
        Dog chiku = new Dog(30);
        chiku.makeNoise();

        /* Declaration of the variable */
        Dog smallDog;

        /* Instantiation of the Dog */
        new Dog(5);

        /* Instantiation and Assignment of the Dog */

        smallDog = new Dog (5);

        /*Instantiation, Declaration, Assignment */

        Dog hugeDog = new Dog(200);

        /*Static method access for comparing the dogs  and expression evaluation*/

        Dog.maxDog(smallDog,hugeDog).makeNoise();
    }
}

