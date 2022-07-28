package guru.spring.sfgpetclinic.services;

import guru.spring.sfgpetclinic.models.Owner;
import guru.spring.sfgpetclinic.repositories.OwnerRepository;
import guru.spring.sfgpetclinic.services.jpa.OwnerJpaService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OwnerServiceTest {

    private static final Long id = 1l;
    private static final Owner owner = new Owner(id, "add", "city", "phone", new HashSet<>());

    private static final List<Owner> owners = Collections.singletonList(owner);

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private OwnerRepository ownerRepository;

    @InjectMocks
    private OwnerJpaService ownerService;

    @Test
    @DisplayName("Get all owners")
    public void getAllOwnersTest(){
        when(ownerRepository.findAll()).thenReturn(owners);

        List<Owner> testOwners = new ArrayList<>();
        ownerService.findAll().forEach(testOwners::add);

        assertEquals(owners, testOwners);
    }

    @Test
    @DisplayName("Create or save")
    public void createOrSaveOwnerTest(){
        when(ownerRepository.save(owner)).thenReturn(owner);
        assertEquals(owner, ownerService.save(owner));
    }

    @Test
    @DisplayName("Get owner by ID")
    public void loadOwnerByIdTest(){
        Optional<Owner> optionalOwner = Optional.of(owner);
        when(ownerRepository.findById(id)).thenReturn(optionalOwner);
        assertEquals(owner, ownerService.findById(id));
    }

    @Test
    @DisplayName("Update owner by id")
    public void updateOwnerTest(){
        Optional<Owner> optionalOwner = Optional.of(owner);
        when(ownerRepository.findById(id)).thenReturn(optionalOwner);
        when(ownerRepository.save(owner)).thenReturn(owner);
        assertEquals(owner, ownerService.save(owner));
    }

    @Test
    @DisplayName("Delete owner by ID")
    public void deleteTest(){
        doNothing().when(ownerRepository).deleteById(id);
        ownerService.deleteById(id);
    }

    @Test
    @DisplayName("Delete all owner")
    public void deleteAllTest(){
        doNothing().when(ownerRepository).delete(owner);
        ownerService.delete(owner);
    }

}
