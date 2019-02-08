 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int count = 0;
        while(count < personArray.length)
        {
            result += personArray[count];
            count++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        for(int count = 0 ; count < personArray.length; count++)
        {
            result += personArray[count];
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for(Person person : personArray)
        {
            result += person;
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
