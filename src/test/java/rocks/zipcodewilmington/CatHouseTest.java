package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void add(){
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer expected = 1;
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeId(){
        Cat cat = new Cat();
        CatHouse.add(cat);
        CatHouse.remove(CatHouse.getCatById(cat.getId()));
        Integer expected = 0;
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCat(){
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer expected = 0;
        CatHouse.remove(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void getId(){
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer actual = cat.getId();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCats(){
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer expected = 1;
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
}
