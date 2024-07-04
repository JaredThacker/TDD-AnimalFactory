package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName(){
        Cat cat = new Cat();
        cat.setName("Fluff");
        String expected = "Fluff";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeak(){
        Cat cat = new Cat();
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate(){
        Cat cat = new Cat();
        Date expected = new Date();
        cat.setBirthDate(expected);
        Assert.assertEquals(expected, cat.getBirthDate());

    }

    @Test
    public void eat(){
        Cat cat = new Cat();
        cat.eat(new Food("catFood"));
        Integer expected = 1;
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void getId(){
        Cat cat = new Cat();
        int expected = cat.getId();
        Assert.assertEquals(expected, 0);
    }

    @Test
    public void Animal(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void Mammal(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Mammal);
    }
}
