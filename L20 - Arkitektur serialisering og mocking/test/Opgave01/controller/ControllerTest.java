package Opgave01.controller;

import Opgave01.ordination.Laegemiddel;
import Opgave01.ordination.Ordination;
import Opgave01.ordination.Patient;
import Opgave01.storage.Storage;
import Opgave01.storage.StorageInterface;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Test
    void test_AntalOrdinationerPrVægtPrLægemiddel() {

        // Arrange
        Laegemiddel laegemiddel = new Laegemiddel("Studydrug", 0, 10, 20, "Studydrug");


        // Mock ordinationen og sæt den til at returnere vores lægemiddel
        Ordination mockOrdination = mock(Ordination.class);
        when(mockOrdination.getLaegemiddel()).thenReturn(laegemiddel);

        // Opret en patient og mock list-metoden, så den returnerer ordinationen
        Patient patient = new Patient("1", "Hans", 80);
        Patient mockPatient = mock(Patient.class);
        when(mockPatient.getVaegt()).thenReturn(80.0);
        when(mockPatient.getOrdinationer()).thenReturn(List.of(mockOrdination));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(mockPatient);

        StorageInterface mockedStorage = mock(StorageInterface.class);
        when(mockedStorage.getAllPatienter()).thenReturn(patients);

        Controller controller = new Controller(mockedStorage);

        // Act
        int aktueltAntal = controller.antalOrdinationerPrVægtPrLægemiddel(0.0, 100.0, laegemiddel);

        // Assert
        assertEquals(1, aktueltAntal, "Forventede 1 ordination i vægtintervallet for det givne lægemiddel");
    }
}
