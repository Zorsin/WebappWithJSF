import javax.el.MethodExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;

/**
 * 21.01.2018
 *
 * @author SWirries
 */
@ManagedBean
@ViewScoped
public class SidenavigationBean {
  public HtmlPanelGroup buttonPlaceHolder;
  private Map<String, String> pageTextMap = new HashMap<>();

  public HtmlPanelGroup getButtonPlaceHolder() {
    return buttonPlaceHolder;
  }

  public void setButtonPlaceHolder(HtmlPanelGroup buttonPlaceHolder) {
    this.buttonPlaceHolder = buttonPlaceHolder;

    pageTextMap.put("page1","Visit Page1");
    pageTextMap.put("page2","Go To Page2");
    pageTextMap.put("page3","view Page3");
    pageTextMap.put("welcome","Logout");

    for(Map.Entry entry : pageTextMap.entrySet()){
      HtmlCommandLink navButton = new HtmlCommandLink();
      navButton.setStyleClass("w3-bar-item w3-button");
      navButton.setValue(entry.getValue());
      navButton.setActionExpression(createMethodExpression(entry.getKey().toString(),String.class));
      buttonPlaceHolder.getChildren().add(navButton);
    }
  }

  private static MethodExpression createMethodExpression(String expression, Class<?> returnType) {
    FacesContext context = FacesContext.getCurrentInstance();
    return context.getApplication().getExpressionFactory().createMethodExpression(
        context.getELContext(), expression, returnType, new Class[0]);
  }


}
