public static void main(String[] args) {
        AscII.printNumbers();
        AscII.printLowerCase();
        AscII.printUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = input.nextLine();
        System.out.println("Hello " + firstName);

        System.out.print("Shall we play a game?");
        System.out.print("  Y/N: ");

        String Response = input.nextLine();
        switch (Response) {
        case "y", "Y", "yes" -> System.out.println("Lets continue");
default -> {
        System.out.println("See you later");
        input.close();
        }
        }