package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    
    
    @Test
    public void validateIsDead() {
    	Person personOne = new Person("Johan",  1, 19, Gender.MALE, true);
    	Person personTwo = new Person("Orlando",  2, 20, Gender.MALE, false);
    	RegisterResult resultOne = registry.registerVoter(personOne);
    	RegisterResult resultTwo = registry.registerVoter(personTwo);
    	Assert.assertEquals(RegisterResult.DEAD, resultTwo);
    	Assert.assertNotEquals(RegisterResult.DEAD, resultOne);
    	
    }
    @Test
    public void isInvalidAge() {
    	Person personOne = new Person("Johan",  1, -40, Gender.MALE, true);
    	Person personTwo = new Person("Orlando",  2, -1, Gender.MALE, true);
    	Person personThree = new Person("Simon",  3, 0, Gender.MALE, true);
    	RegisterResult resultOne = registry.registerVoter(personOne);
    	RegisterResult resultTwo = registry.registerVoter(personTwo);
    	RegisterResult resultThree = registry.registerVoter(personThree);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, resultTwo);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, resultOne);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, resultThree);
    	
    }
    
    public void isUnderAge() {
    	Person personOne = new Person("Johan",  1, 17, Gender.MALE, true);
    	Person personTwo = new Person("Orlando",  2, 18, Gender.MALE, true);
    	Person personThree = new Person("Simon",  3, 5, Gender.MALE, true);
    	Person personFour = new Person("Paisa",  3, 1, Gender.MALE, true);
    	RegisterResult resultOne = registry.registerVoter(personOne);
    	RegisterResult resultTwo = registry.registerVoter(personTwo);
    	RegisterResult resultThree = registry.registerVoter(personThree);
    	RegisterResult resultFour = registry.registerVoter(personFour);
    	Assert.assertEquals(RegisterResult.UNDERAGE, resultTwo);
    	Assert.assertEquals(RegisterResult.UNDERAGE, resultOne);
    	Assert.assertEquals(RegisterResult.UNDERAGE, resultThree);
    	Assert.assertEquals(RegisterResult.UNDERAGE, resultFour);
    	
    }
    @Test
    public void unidentifiedGender() {
    	Person personOne = new Person("Johan",  1, 19, Gender.MALE, true);
    	Person personTwo = new Person("Orlando",  2, 19, Gender.FEMALE, true);
    	Person personThree = new Person("Simon",  3, 19, Gender.UNIDENTIFIED, true);
    	RegisterResult resultOne = registry.registerVoter(personOne);
    	RegisterResult resultTwo = registry.registerVoter(personTwo);
    	RegisterResult resultThree = registry.registerVoter(personThree);
    	Assert.assertEquals(RegisterResult.UNIDENTIFIEDGENDER, resultThree);
    	Assert.assertNotEquals(RegisterResult.UNIDENTIFIEDGENDER, resultOne);
    	Assert.assertNotEquals(RegisterResult.UNIDENTIFIEDGENDER, resultTwo);
    	
    }
    @Test
    public void isValid() {
    	Person personOne = new Person("Johan",  1, 19, Gender.MALE, true);
    	Person personTwo = new Person("Orlando",  2, 40, Gender.MALE, true);
    	RegisterResult resultOne = registry.registerVoter(personOne);
    	RegisterResult resultTwo = registry.registerVoter(personTwo);
    	Assert.assertEquals(RegisterResult.VALID, resultTwo);
    	Assert.assertEquals(RegisterResult.VALID, resultOne);
    	
    }
    
}