package misc;


/**
 *  Taking an input and writing the ouput is possible so wrting to file is possible
 *
 *  We can do it with File class in I/O Package and PrintWriter Class
 *
 *  While dealing with I/o Exceptions are common and there are always saviours by the language creates
 *  with a specific way of handling exceptions with
 *  1. Try,Catch,Finally blocks
 *  2. Just simply throw and throws which creates a exception object and split out to the console which results in
 *     failure in execution of program.
 *
 *  Exceptions Catching :
 *  1. While working with try catch blocks you have have to catch the Narrow exceptions (More specific exception
 *     such as for Ex: ArrayInputBoundException,FileNOtFOundException) rather than broader exceptions. */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  1. Here I am creating a text file in a particular location
 *  2. Writing something programmatically into text file
 *  3. Again printing it the contents of file to the console
 *
 *  Note : Here I am not forcing my main method to throw the exception object to the console instead I am fiding with my
 *         try and Catch and blocks */
public class ReadingAFile {

    public static void main(String[] args ) {

    /** Creating a file and writing some text to it.*/

        /** Initialize the File Object
         *  Here if we provide a specific path text file will be created in that location else it will created in the
         *  project path.*/

        File file = new File("sample.txt");
/*        try {
        *//*Parmater is a file since we need to write to a text file whcih is refernced to the file object*//*
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.println("Nagarjuna");
            printWriter.print(42);
        *//* Closing the stream is necessary*//*
            printWriter.close();
        } catch (IOException ex){
            System.out.printf("Exception Found %s \n :", ex);
        }*/

        /* Reading from the file */

        try {
            Scanner textFileInput = new Scanner(file);

            String name = textFileInput.next();
            int age = textFileInput.nextInt();

            System.out.printf("Name and Age are %s %d \n",name,age);
        } catch (FileNotFoundException ex) {
            System.out.printf("Exception Found %s \n", ex);
        }
    }
}

