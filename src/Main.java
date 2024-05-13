public class Main {
    public static void main(String[] args) {
        Builder personBuilder1 = new Builder("Albano", "Persechino");
        personBuilder1.age(18);
        personBuilder1.address("Via Monte 87");

        System.out.println("personBuilder1: " + personBuilder1);

        Builder personBuilder2 = new Builder("Alberto", "Rossi");
        personBuilder2.age(20);
        personBuilder2.address("Via Carro 45");

        System.out.println("personBuilder2: " + personBuilder2);
    }
}
