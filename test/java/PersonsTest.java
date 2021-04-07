import org.junit.Assert;
import org.junit.Test;

import javax.naming.Name;

public class PersonsTest {



    @Test
    public void nameTest() {
        //Obj
        Persons persons = new Persons("Mekhi");

        //Given
        String expected = "Stewie";
        //When
        persons.setName("Stewie");
        String actual = persons.getName();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void ageTest() {
        Persons persons = new Persons(21);

        int expected = 10;

        persons.setAge(10);
        int actual = persons.getAge();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void weightTest(){
       Persons persons = new Persons(165.5);

       Object expected = 130.2;

       persons.setWeight(130.2);
       Object actual = persons.getWeight();

       Assert.assertEquals(expected,actual);




    }
}
