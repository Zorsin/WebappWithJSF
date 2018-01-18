import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * 18.01.2018
 *
 * @author SWirries
 */
@ManagedBean
@SessionScoped
public class Person {
  private String firstname;
  private String lastname;
  private String emailAddress;

  public Person() {
  }

  public Person(String firstname, String lastname, String emailAddress) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.emailAddress = emailAddress;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public static List<Person> getPersons(){
    List<Person> personList = new ArrayList<>();
    personList.add(new Person("Qui-Gon","Jin","qgj@mail.de"));
    personList.add(new Person("Obi-Wan","Kenobi","owk@mail.de"));
    personList.add(new Person("Anakin","Skywalker","as@mail.de"));
    personList.add(new Person("Mace","Window","mw@mail.de"));
    personList.add(new Person("Yoda","","yoda@mail.de"));
    return personList;
  }

}
