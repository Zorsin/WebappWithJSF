import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * 18.01.2018
 *
 * @author SWirries
 */
@ManagedBean
@SessionScoped
public class PersonBean {

  private String searchParam = "";
  private boolean visibile = false;

  public boolean isVisibile() {
    return visibile;
  }

  public void setVisibile(boolean visibile) {
    this.visibile = visibile;
  }

  public String getSearchParam() {
    return searchParam;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }

  public List<Person> getPersons(){
    ArrayList<Person> filterdList = new ArrayList<>();
    for(Person p : Person.getPersons()){
      if(p.getFirstname().toLowerCase().contains(searchParam.toLowerCase()) || p.getLastname().toLowerCase().contains(searchParam.toLowerCase())){
        filterdList.add(p);
      }
    }

    return filterdList;
  }

  public void getPersonsVisible(ActionEvent event){
    setVisibile(true);
//    ArrayList<Person> filterdList = new ArrayList<>();
//    for(Person p : Person.getPersons()){
//      if(p.getFirstname().toLowerCase().contains(searchParam.toLowerCase()) || p.getLastname().toLowerCase().contains(searchParam.toLowerCase())){
//        filterdList.add(p);
//      }
//    }

//    return filterdList;
  }
}
