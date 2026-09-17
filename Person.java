public class Person {
   //Variable Declartion Area 
   private String name;
   private int age;
   private String email;

public Person(String name, int age, String email){
    this.name = name;
    this.age = age;
    this.email = email;
}

//get method for name
public String getName(){
    return name;
}

//set method for name
public void setName(String name){
    this.name = name;
}

//get method for age
public int getAge(){
    return age;
}

//set method for age
public void setAge(int age){
    this.age = age;
}

//get method for email
public String getEmail(){
    return email;
}

//set method for email
public void setEmail(String email){
    this.email = email;
}


//displayInfo() for displaying information
public void displayInfo(){
  System.out.println("Name: " + name);
  System.out.println("Age: " + age);
  System.out.println("Email: " + email);
}

}//end of public class
