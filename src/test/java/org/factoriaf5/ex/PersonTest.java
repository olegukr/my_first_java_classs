package org.factoriaf5.ex;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Test new instance for Person class")
    void testNewInstancePersonClass() {
        Person person2 = new Person("name1", "lastName1", 0, "11-11-2020", "Spain", 'M' );
        assertThat(person2, instanceOf(Person.class));
    }

    @Test
    @DisplayName("Test outputAllAttributes method")
    void testOutputAllAttributes() {
        Person person1 = new Person("name1", "lastName1", 0, "11-11-2020", "Spain", 'M' );

        assertThat(person1.getFirstName(), is("name1"));
        assertThat(person1.getLastName(), is("lastName1"));
        assertThat(person1.getId(), is(0));
        assertThat(person1.getYearOfBirth(), is("11-11-2020"));
        assertThat(person1.getCountryOfBirth(), is("Spain"));
        assertThat(person1.getGender(), is('M'));
    }
}
