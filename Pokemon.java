import java.util.Scanner;

public class Pokemon {

    public class pokemon {
        
        Scanner tec = new Scanner(System.in);
        String name = tec.nextLine();
        int level = tec.nextInt();

        public void info() {
            System.out.println("The level of " + name +  "is "+ level );
        
        }

      
    }
}