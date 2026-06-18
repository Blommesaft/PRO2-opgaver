package Opgave01.controller;

import Opgave01.ordination.Laegemiddel;
import Opgave01.ordination.Patient;
import Opgave01.storage.Storage;
import Opgave01.storage.StorageInterface;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Test
    void test_AntalOrdinationerPrVægtPrLægemiddel() {

        // Arrange
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("1", "Hans", 80));

        StorageInterface mockedStorage = mock(StorageInterface.class);
        when(mockedStorage.getAllPatienter()).thenReturn(patients);
        Controller controller = new Controller(mockedStorage);
        Laegemiddel laegemiddel = new Laegemiddel("Studydrug", 0, 10, 20, "Studydrug");

        // Act
        controller.antalOrdinationerPrVægtPrLægemiddel(0.0, 100.0, laegemiddel);

        // Assert
    }
}
