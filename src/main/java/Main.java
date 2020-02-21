
public class Main {

    public static void main(String[] argv) {
        Calculator calc = new Calculator();

        if (argv.length < 1) {
            System.out.println("No function specified.");
            System.exit(1);
        }

        String command = argv[0];

        if (command.equals("add")) {
            if (argv.length < 3) {
                System.out.println("Two numeric arguments required.");
                System.exit(1);
            }

            int x = Integer.parseInt(argv[1]);
            int y = Integer.parseInt(argv[2]);

            int res = calc.add(x, y);

            System.out.println(res);

        }
        else if (command.equals("subtract")) {
            if (argv.length < 3) {
                System.out.println("Two numeric arguments required.");
                System.exit(1);
            }

            int x = Integer.parseInt(argv[1]);
            int y = Integer.parseInt(argv[2]);

            int res = calc.subtract(x, y);

            System.out.println(res);
        }
        else if (command.equals("multiply")) {
            if (argv.length < 3) {
                System.out.println("Two numeric arguments required.");
                System.exit(1);
            }

            int x = Integer.parseInt(argv[1]);
            int y = Integer.parseInt(argv[2]);

            int res = calc.multiply(x, y);

            System.out.println(res);
        }
        else if (command.equals("divide")) {
            if (argv.length < 3) {
                System.out.println("Two numeric arguments required.");
                System.exit(1);
            }

            int x = Integer.parseInt(argv[1]);
            int y = Integer.parseInt(argv[2]);

            int res = calc.divide(x, y);

            System.out.println(res);
        }
        else if (command.equals("fibonacci")) {
            if (argv.length < 2) {
                System.out.println("One numeric argument required.");
                System.exit(1);
            }

            int x = Integer.parseInt(argv[1]);

            int res = calc.fibonacciNumberFinder(x);

            System.out.println(res);
        }
        else if (command.equals("toBinary")) {
            if (argv.length < 2) {
                System.out.println("One numeric argument required.");
                System.exit(1);
            }

            int x = Integer.parseInt(argv[1]);

            String res = calc.intToBinaryNumber(x);

            System.out.println(res);
        }
        else {
            System.out.println("Function does not exist.");
        }
    }
}
