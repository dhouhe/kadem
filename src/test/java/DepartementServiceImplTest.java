import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner; // Import this class

import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;
import tn.esprit.spring.kaddem.services.DepartementServiceImpl;

@RunWith(MockitoJUnitRunner.class) // Move this annotation to the class level
public class DepartementServiceImplTest {

    @Test
    public void testRetrieveAllDepartements() {
        // Create a mock for the repository
        DepartementRepository departementRepositoryMock = mock(DepartementRepository.class);

        // Create an instance of the service using the mock repository
        DepartementServiceImpl departementService = new DepartementServiceImpl(departementRepositoryMock);

        // Configure the behavior of the mock
        when(departementRepositoryMock.findAll()).thenReturn(Arrays.asList(new Departement(), new Departement()));

        // Call the method to be tested
        List<Departement> result = departementService.retrieveAllDepartements();

        // Verify the result
        assertEquals(2, result.size());
    }

    // Add other similar test methods for other service methods
}
