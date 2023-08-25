import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = new String[10];
        ArrayList<Integer> entradas = new ArrayList<Integer>(4);
        entradas.add(1);
        entradas.add(2);
        entradas.add(3);
        entradas.add(4);

        do{

            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit");
            System.out.print("Option: ");
            int option = scanner.nextInt();

            if(entradas.contains(option)){
                if(option == 1){
                    for(int i = 0; i< guests.length; i++){
                        System.out.println(guests[i]);
                    }
                }
                else if(option == 2){
                    for(int i = 0; i< guests.length; i++){
                        if(guests[i]==null){
                            System.out.print("Name: ");
                            guests[i] = scanner.next();
                            break;
                        }
                    }
                }
                else if(option == 3){
                    System.out.print("Name: ");
                    String name = scanner.next();
                    for(int i = 0; i< guests.length; i++){
                        if(guests[i] != null && guests[i].equals(name)){
                            guests[i] = null;
                            break;
                        }
                    }
                }
                else if(option == 4){
                    break;
                }
            }else{
                System.out.println("You must select 1 to 4 ");
                break;
            }
        }
        while(true);

        System.out.println("Exiting... ");
    }
}
