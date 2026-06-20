package Opgave03;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {

        // Vi kan ikke skrive: new PersonAdministrator(); da den er privat.
        // I stedet bruger vi getInstance():
        PersonAdministrator admin = PersonAdministrator.getInstance();

        // Opret nogle personer
        Person p1 = new Person("Sofie", 16);
        Person p2 = new Person("Lucas", 17);
        Person p3 = new Person("Emma", 15);

        // Tilføj personer via administratoren
        admin.add(p1);
        admin.add(p2);
        admin.add(p3);

        System.out.println("Personer i systemet efter tilføjelse:");
        System.out.println(admin.getPersoner());

        // Fjern en person igen
        admin.remove(p2);
        System.out.println("\nPersoner i systemet efter at have fjernet Lucas:");
        System.out.println(admin.getPersoner());

        // Bevis på Singleton: Hvis vi henter instansen igen i en ny variabel,
        // peger den stadig på nøjagtig det samme objekt og data.
        PersonAdministrator admin2 = PersonAdministrator.getInstance();
        System.out.println("\nHenter vi data fra 'admin2', er listen den samme:");
        System.out.println(admin2.getPersoner());
    }
}
