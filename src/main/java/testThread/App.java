package testThread;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> myList = Arrays.asList("element1", "element2",
                "element3", "elem 4/3",
                "ELEMENT 8", "999");

        myList.forEach(element -> System.out.println(element));

        System.out.println( "Hello World!" );
    }
}
