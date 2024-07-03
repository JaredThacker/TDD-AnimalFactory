package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog(){
        Dog dog = AnimalFactory.createDog("Roger", new Date());
        DogHouse.add(dog);
        Integer expected = 0;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat(){
        Cat cat = AnimalFactory.createCat("Fluffy", new Date());
        CatHouse.add(cat);
        Integer expected = 0;
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
}


