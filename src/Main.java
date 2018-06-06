import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mamifero> eu = new ArrayList<Mamifero>();
        Scanner bot = new Scanner(System.in);
        eu.add(new Individuo());
        eu.add(new Individuo());
        for (int i = 0; i < 2; i++) {
            System.out.println("nome da pessoa");
            ((Individuo)eu.get(i)).setNome(bot.nextLine());
            System.out.println("classe economica");
            ((Individuo)eu.get(i)).setClasse(bot.nextLine());
            System.out.println("idade");
            ((Individuo)eu.get(i)).setIdade(bot.nextInt());
            System.out.println("cor");
            ((Individuo)eu.get(i)).setCor(bot.nextLine());
            System.out.println("sexo");
            ((Individuo)eu.get(i)).setSexo(bot.nextLine());
            System.out.println("porte do animal");
            eu.get(i).setPorte(bot.nextLine());
            System.out.println("tem pelos? y/n");
            if(bot.nextLine() == "y"){
                eu.get(i).setPossuiPelos(true);
            }
            else{
                eu.get(i).setPossuiPelos(false); 
            }
            
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("nome da pessoa");
            System.out.println(((Individuo)eu.get(i)).getNome());
            System.out.println("classe economica");
            System.out.println(((Individuo)eu.get(i)).getClasse());
            System.out.println("idade");
            System.out.println(((Individuo)eu.get(i)).getIdade());
            System.out.println("cor");
            System.out.println(((Individuo)eu.get(i)).getCor());
            System.out.println("sexo");
            System.out.println(((Individuo)eu.get(i)).getSexo());
            System.out.println("porte do animal");
            System.out.println(eu.get(i).getPorte());
            System.out.println("tem pelos? y/n");
            if(eu.get(i).getPossuiPelos() == true){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
