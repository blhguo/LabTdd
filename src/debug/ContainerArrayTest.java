package debug;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ContainerArrayTest {
    private ContainerArray<String> myContainer = null;

    @Before
    public void setUp () {
        myContainer = new ContainerArray<>();
    }

    @Test
    public void testSizeChangeWithAdd () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Camel");
        assertEquals("Add size", 3, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertEquals("Add should be same reference", alligator, myContainer.get(0));
    }

    @Test
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
    }

    @Test
    public void testObjectIsRemoved () {
        String alligator = "Alligator";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        assertEquals("Remove should be same reference", alligator, myContainer.get(0));
    }
    
    @Test
    public void testSizeExpansion () {
    	for(int i = 0; i <11; i ++) myContainer.add("asdf" + i);
    	assertEquals("yolo swag", "asdf10", myContainer.get(10));
    }
    
    @Test
    public void doesRemoveWoirk() {
    	String el = new String("el to remove");
    	myContainer.add(el);
    	myContainer.remove(el);
    	
    	assertEquals("Getting a removed element from arr", false, myContainer.contains(el));
    }
    
    @Test
    public void checkSize() {
        myContainer.add("Alligator");
        myContainer.add("Bear");
    	assertEquals("test123123", myContainer.size(), 2);
    }
}
