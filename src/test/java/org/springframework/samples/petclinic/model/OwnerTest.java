package org.springframework.samples.petclinic.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class OwnerTest {

    @Test
    void testAddPetAndGetPet() {
        // 1. Preparem les dades
        Owner owner = new Owner();
        Pet pet = new Pet();
        pet.setName("Toby");

        // 2. Executem l'acció (afegir mascota)
        owner.addPet(pet);

        // 3. Verifiquem els resultats
        // Ha de trobar la mascota pel seu nom
        assertEquals(pet, owner.getPet("Toby"));

        // Ha de tornar null si busquem una mascota que no té
        assertNull(owner.getPet("Rex"));
    }
}
