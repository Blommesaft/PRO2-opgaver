package Opgave01.storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Opgave01.ordination.Laegemiddel;
import Opgave01.ordination.Patient;

public class Storage implements StorageInterface {

    private static final String FILE_NAME = "patienter.ser";

    /**
     * Returnerer en liste med alle gemte patienter
     */
//    @Override
//    public List<Patient> getAllPatienter() {
//        throw new UnsupportedOperationException();
//    }

    /**
     * Gemmer et patient-objekt i en serialiseret liste på harddisken.
     */
    public void savePatient(Patient patient) {
        List<Patient> patienter = getAllPatienter(); // Hent eksisterende patienter først
        patienter.add(patient); // Tilføj den nye

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(patienter);
        } catch (IOException e) {
            System.err.println("Kunne ikke gemme patient: " + e.getMessage());
        }
    }

    @Override
    public List<Patient> getAllPatienter() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>(); // Returner tom liste hvis filen ikke findes endnu
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Patient>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Hvis der sker en fejl (f.eks. tom fil), returneres en tom liste
            return new ArrayList<>();
        }
    }
}
