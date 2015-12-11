package tine.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tine.model.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//@RunWith(Parameterized.class)
public class PersonDictonaryImplTest {
//    private final String id;
//    private final String expectedId;
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> idOgid() {
//        return Arrays.asList(new Object[][]{
//                {"03086529520", "03086529520"},
//                {"03086529521", "03086529521"},
//                {"03086529522", "03086529522"}
//        });
//    }

//    public TallTest(String id, String expectedId) {
//        this.expectedId = expectedId;
//        this.id = id;
//    }



    @Test
    public void test1(){

        PersonDictionaryImpl dic= new PersonDictionaryImpl();
        List<Person> list=dic.finAll();
        Assert.assertEquals("03086529520", dic.finAll().get(0).getId());
        Assert.assertEquals("03086529521", dic.finAll().get(1).getId());
        Assert.assertEquals("03086529522", dic.finAll().get(2).getId());
    }
}
