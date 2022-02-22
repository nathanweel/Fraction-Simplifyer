public class Simplifyer {
    public static void main(String[] args) {

        //I got the main code to simplify from the URL below
        // https://stackoverflow.com/questions/6618994/simplifying-fractions-in-java

        System.out.println("                                                \n" + " \\    / _  |  _  _  ._ _   _                     \n" + "  \\/\\/ (/_ | (_ (_) | | | (/_                    \n" + " |_)      ._   _. _|_ |_   _. ._        _   _  | \n" + " |_) \\/   | | (_|  |_ | | (_| | | \\/\\/ (/_ (/_ | \n" + "     /                                           ");

        System.out.println("What is your numerator?" + "\n(this number cannot exceed or be equal to the next number you enter or it breaks the program)");
        int n1 = Integer.parseInt(System.console().readLine());

        System.out.println("What is your denominator?");
        int n2 = Integer.parseInt(System.console().readLine());

        if (n1 >= n2) {
            System.out.println("Improper fractions cannot be simplified with this program");
            System.exit(0);
        }

        int simp1 = n1;
        int simp2 = n2;

        while (n1 != n2) {
            if (n1 > n2) n1 = n1 - n2;
            else n2 = n2 - n1;
        }

        int n3 = simp1 / n1;
        int n4 = simp2 / n1;

        System.out.println("Your simplified fraction is:" + n3 + "/" + n4);
    }
}
