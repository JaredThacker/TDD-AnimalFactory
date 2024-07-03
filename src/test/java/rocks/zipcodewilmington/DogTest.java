package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDog(){
        Dog dog = new Dog();
        dog.setName("Roger");
        String expected = "Roger";
        dog.setName(expected);
        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void speak(){
        Dog dog = new Dog();
        String expected = "bark!";
        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void setBirthDate(){
        Dog dog = new Dog();
        Date expected = new Date();
        dog.setBirthDate(expected);
        Assert.assertEquals(expected, dog.getBirthDate());
    }

    @Test
    public void eat(){
        Dog dog = new Dog();
        dog.eat(new Food("dogFood"));
        Integer expected = 1;
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }

    @Test
    public void getId(){
        Dog dog = new Dog();
        int expected = dog.getId();
        Assert.assertEquals(expected, 0);
    }

    @Test
    public void AnimalInheritance(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void MammalInheritance(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Mammal);
    }

}
