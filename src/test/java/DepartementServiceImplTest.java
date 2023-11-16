import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;
import tn.esprit.spring.kaddem.services.DepartementServiceImpl;

public class DepartementServiceImplTest {
    @RunWith(MockitoJUnitRunner.class)
    @Test
    public void testRetrieveAllDepartements() {
        // Créez un mock pour le repository
        DepartementRepository departementRepositoryMock = mock(DepartementRepository.class);

        // Créez une instance du service en utilisant le mock du repository
        DepartementServiceImpl departementService = new DepartementServiceImpl(departementRepositoryMock);

        // Configurez le comportement du mock
        when(departementRepositoryMock.findAll()).thenReturn(Arrays.asList(new Departement(), new Departement()));

        // Appelez la méthode à tester
        List<Departement> result = departementService.retrieveAllDepartements();

        // Vérifiez le résultat
        assertEquals(2, result.size());
    }

    // Ajoutez d'autres méthodes de test similaires pour les autres méthodes du service
}
