package Builder;

public class Personne {

    private final String sexe;
    private String name;

    private static int age;


    public static class builder {
        private String sexe;
        private final String name;
        private static int age = 0;


        public builder(String name) {

            this.name = name;

        }

        public builder sexe(String sexe) {
            this.sexe = sexe;
            return this;
        }

        public builder age(int age) {
            this.age = age;
            return this;
        }

        public Personne build() {

            return new Personne(this);
        }


    }


    private Personne(builder builder) {
        this.name = builder.name;
        this.sexe = builder.sexe;
        this.age = builder.age;


    }

    @Override
    public String toString() {
        return "Personne{" +
                "sexe='" + sexe + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setAge(int age) {
       Personne.age = age;
    }
}
