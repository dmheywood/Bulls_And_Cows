package pedigreedriver;

import java.util.*; // for Scanner
import java.io.*; // for File

/**
 * This is the driver program for the pedigree printing project
 *
 * @author David
 */
public class PedigreeDriver {

    private static final String count = "count";
    private static final String eval = "evaluate";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fileName = "cattle10.txt";
        String command;
        String commandAux;

        Scanner inputFile = new Scanner(System.in);
        Scanner stdIn = new Scanner(System.in);

        Database herdBook;

        if (fileName.length() < 1) {
            System.out.println("Must have an input file name.");
            return;
        } else {
            try {
                inputFile = new Scanner(new File("cattle10.txt"));
                herdBook = new Database(inputFile);

                while (stdIn.hasNext()) {
                    command = stdIn.next();
                    /*
                     you will need to adjust this comment
                     if you do extra credit

                     if (count.equals(command)){
                     commandAux = stdIn.next();
                     herdBook.countOffspring(commandAux);
                     }
                     else if (eval.equals(command)){
                     commandAux = stdIn.next();
                     herdBook.evaluateOffspring(commandAux);
                     }
                     else
                     */
                    herdBook.printPedigree(command);
                }
            } /*
             During development, we print out the full message of
             the exception by using e.toString() and e.printStackTrace().
             That is not recommended for
             production programs, since it gives hackers too much insight into
             the innards of the software, possibly allowing them to exploit it.
             Instead, production programs write error messages to internal log
             files that hackers wouldn't see.
             */ catch (InputMismatchException e) {
                System.out.println("Probably using nextInt or nextDouble"
                        + " when the file input is not of that type.");

                System.out.println(e);
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Probably some problem with the input"
                        + " data file or the keyboard input.");

                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
