import java.util.Scanner;

public class DriverInstrument {
    public static void main(String[] args) {
        
        String pilihan = "  ";
        Guitar gitar = new Guitar();
        Piano piano = new Piano();
        Scanner a = new Scanner (System.in);

        System.out.println("Guitar or Piano?");
        pilihan = a.nextLine();

        if (pilihan.equalsIgnoreCase("Guitar")) {
            Scanner gt = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Inputkan Nama Gitar: ");
            String name = gt.nextLine();
            System.out.println(" ");
            System.out.println("Inputkan Harga Gitar: ");
            double price = gt.nextDouble();
            System.out.println(" ");
            System.out.println("Inputkan Num String: ");
            int numStrings = gt.nextInt();
            System.out.println(" ");
            System.out.println("Gitarnya Elektrik (true/false): ");
            boolean isElectric = gt.nextBoolean();
            System.out.println(" ");

        Guitar gitarz = new Guitar(name, price, numStrings, isElectric );
        gitarz.print();

        } else if (pilihan.equalsIgnoreCase("Piano")) {
            Scanner oi = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Inputkan Nama Piano: ");
            String name = oi.nextLine();
            System.out.println(" ");
            System.out.println("Inputkan Harga Piano: ");
            double price = oi.nextDouble();
            System.out.println(" ");
            oi.nextLine();
            System.out.println("Inputkan Tipe Piano: ");
            String type = oi.nextLine();
            System.out.println(" ");

        Piano pianow = new Piano(name, price, type );
        pianow.print();

        }
        a.close();
    }
}
