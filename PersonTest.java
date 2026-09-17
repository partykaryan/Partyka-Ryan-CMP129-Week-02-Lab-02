public class PersonTest {
    public static void main(String[] args) {
        
        Person person = new Person(null, 0, null);
        Person personTwo = new Person(null, 0, null);

    person.setName("Maria Johnson");
    person.setAge(20);
    person.setEmail("maria@example.com ");
    person.displayInfo();
   

    personTwo.setName("David Smith");
    personTwo.setAge(35);
    personTwo.setEmail("david@example.com");
    personTwo.displayInfo();
    
   

}//end of main method
}// end of public class
