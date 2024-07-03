package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void add(){
        Dog dog = new Dog();
        DogHouse.add(dog);
        Integer expected = 1;
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeId(){
        Dog dog = new Dog();
        DogHouse.add(dog);
        DogHouse.remove(DogHouse.getDogById(dog.getId()));
        Integer expected = 0;
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDog(){
        Dog dog = new Dog();
        DogHouse.add(dog);
        Integer expected = 0;
        DogHouse.remove(dog);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    //doghouse get dog id
    @Test
    public void getDogId(){
        Dog dog = new Dog();
        DogHouse.add(dog);
        Integer expected = 0;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberDogs(){
        Dog dog = new Dog();
        DogHouse.add(dog);
        Integer expected = 1;
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
}
