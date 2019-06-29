public class Switch {
    public static void main(String[] args) {
        char choice = '1';

        switch (choice) {
            case '1':
                System.out.println("choice 1");
                break;
            case '2':
                System.out.println("choice 2");
                break;
            case '3':
                System.out.println("choice 3");
                break;
            case '4':
                System.out.println("choice 4");
                break;
            case '5':
                System.out.println("choice 5");
                break;
            default:
                System.out.println("unknown choice");
        }
    }
}