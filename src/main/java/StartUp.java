import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Schaakbord schaakbord = new Schaakbord();

        Boolean spelen = true;
        String van;
        String naar;
        while( spelen){
            System.out.println("");
            System.out.println("Van Positie: ");
            van = scanner.nextLine();
            if(van.equalsIgnoreCase("stop")) spelen = false;
            System.out.println("");
            System.out.println("Naar Positie: ");
            naar = scanner.nextLine();
            if(naar.equalsIgnoreCase("stop")) spelen = false;
            System.out.println("");

            schaakbord.doeZet(van, naar);
            schaakbord.printSchaakbord();


        }


    }
}