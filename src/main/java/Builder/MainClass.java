package Builder;



public class MainClass {
    public static void main(String[] args) {


        Personne p1 = new Personne.builder("safouane").sexe("homme").age(23).build();



        Personne p2 = new Personne.builder("hafsa").sexe("femme").age(26).build();

        System.out.println(p1.toString());
        System.out.println(p2.toString());








    }



}