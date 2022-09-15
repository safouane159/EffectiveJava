
package StaticFctoryMethod;

public class PersonneV02 {

    private final String sexe;
    private String name;

    private static String SITE = "QVI";


    public PersonneV02(String name, String sexe) {
        this.sexe = sexe;
        this.name = name;

    }

    public static PersonneV02 getInstanceOfHomme(String name ) {
        return new PersonneV02(name,"Homme");


    }
    public static PersonneV02 getInstanceOfFemme(String name) {
        return new PersonneV02(name,"Femme");

    }
    @Override
    public String toString() {
        return "Personne{" +
                "sexe='" + sexe + '\'' +
                ", name='" + name + '\'' +
                ", age='" + SITE + '\'' +
                '}';
    }




}
