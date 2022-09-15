package StaticFctoryMethod;


public class MainClass {
    public static void main(String[] args) {
        PersonneV02 P = PersonneV02.getInstanceOfHomme("Bob");
        PersonneV02 P2 = PersonneV02.getInstanceOfFemme("Alice");
        PersonneV02 P3 = P ;


        System.out.println(P == P3);
        System.out.println(P == P2);
        System.out.println(P.toString().equals(P3.toString()));
        System.out.println();
        System.out.println(P2.toString());


    }



}