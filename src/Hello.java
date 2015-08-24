public class Hello {
    /*Instance methods (and fields etc) relate to a particular instance
     Methods add() subtract() are instance methods so you have to create a
    * an instance in order to work with those methods*/
    public void add() {
        System.out.println("Hello.add");
    }
    public void subtract() {
        System.out.println("Hello.subtract");
    }
    /*Static methods and fields relate to the type itself, not a particular instance
     * So we don't need to create an instance in order to work those static methods */
    public static void test() {
        System.out.println("Hello.test");
    }


    public static void main(String[] args) {

        Hello hello = new Hello();
        System.out.println("Hello World Java !!");
        System.out.println("Dealing with static and Instance Methods");
        System.out.println("***********************************************");
        System.out.println("To work with methods add() and subtract() we have created an instance of Hello and invoked those methods on that object");
        System.out.println("*****************************");
        hello.add();
        hello.subtract();
        System.out.println("test() is static methos we do not need create an instance of hello in order to run that method");
        test();

    }



}
