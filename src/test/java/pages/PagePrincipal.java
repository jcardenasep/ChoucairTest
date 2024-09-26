package pages;

import org.openqa.selenium.WebElement;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class PagePrincipal extends Basepage{


    private String loginbuttom = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";
    private String buttomRecruitment = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span";
    private String username = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
    private String password = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    private String buttomAdd = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
    private String firstName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input";
    private String middleName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input";
    private String lastName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input";
    private String email = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input";
    private String contactnumber = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input";
    private String buttomFile = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input";
    private String path = "C:\\Users\\camil\\Downloads\\2118649244313.pdf";
    private String keywords = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input";
    private String mensaje = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea";
    private String accept = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i";
    private String send = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]";
    private String shortlist = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]";
    private String note = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/textarea";
    private String save = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
    private String interview = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]";
    private String interviewtittle = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
    private String interviewer = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input";
    private String date = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input";
    private String hour = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/input";
    private String notes = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/textarea";
    private String savebuttom = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
    private String pm = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div[2]/div[4]/div[2]/input";
    private String passed = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]";
    private String offerjob = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]";
    private String hire = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]";
    private String status = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[7]/div/button[1]";
    
    public PagePrincipal() {
        super(driver);
       
    }

    public void navigateToChoucair(){

        navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        

    }

    public void FormData(String Datos, String Datos2 ){

    
            Write(username, Datos);
            Write(password, Datos2);
          
        }

  public void Clickbuttom(){

    
            clickElement(loginbuttom);

    }

    public void ClickbuttomRecruitment(){

        clickElement(buttomRecruitment);

}

    public void ClickbuttomAdd(){

        clickElement(buttomAdd);

    }

    
    public void RecruitmentForm(String Datos1, String Datos2, String Datos3){

        Write(firstName, Datos1);
        Write(middleName, Datos2);
        Write(lastName, Datos3);


    }

public void selectFromDropdownDiv(String dropdownLocator, int numOfDownArrows) {
    try {
        // Hacer clic en el dropdown para desplegar las opciones
        WebElement dropdown = Find(dropdownLocator);
        dropdown.click();
        
        // Usar la clase Robot para simular las teclas
        Robot robot = new Robot();
        
        // Moverse a la opción usando la flecha hacia abajo 'numOfDownArrows' veces
        for (int i = 0; i < numOfDownArrows; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(200); // Esperar un poco entre cada flecha
        }
        
        // Seleccionar la opción con Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void RecruitmentForm2(String Datos1, String Datos2){

    Write(email, Datos1);
    Write(contactnumber, Datos2);

}

public void uploadFile() {
    try {
        WebElement fileInput = Find(buttomFile); // Encuentra el input de tipo "file"
        fileInput.sendKeys(path); // Envía la ruta del archivo al input
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void RecruitmentForm3(String Datos1){

    Write(keywords, Datos1);

}

public void RecruitmentForm4(String Datos1){

    Write(mensaje, Datos1);

}

public void Clickacceptandsend() throws InterruptedException {

    clickElement(accept);
    clickElement(send);
    Thread.sleep(5000);
}

public void Shortlist(){

    clickElement(shortlist);

}
public void note(String Datos1){

    Write(note, Datos1);
   
}
public void Clicksave()throws InterruptedException {

    clickElement(save);
    Thread.sleep(5000);
}

public void Clickinterview()throws InterruptedException {

    clickElement(interview);
    Thread.sleep(5000);

}

public void interviewtittle(String Datos1){

    Write(interviewtittle, Datos1);
   
}

public void interviewer(String Datos1)throws InterruptedException {

    Write(interviewer, Datos1);
    Thread.sleep(3000);
   
}

public void selectInterviewer(String dropdownLocator, int numOfDownArrows) {
    try {
        // Hacer clic en el dropdown para desplegar las opciones
        WebElement dropdown = Find(dropdownLocator);
        dropdown.click();
        
        // Usar la clase Robot para simular las teclas
        Robot robot = new Robot();
        
        // Moverse a la opción usando la flecha hacia abajo 'numOfDownArrows' veces
        for (int i = 0; i < numOfDownArrows; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            Thread.sleep(200); // Esperar un poco entre cada flecha
        }
        
        // Seleccionar la opción con Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
    } catch (Exception e) {
        e.printStackTrace();
    }

}

public void date(String Datos1){

    Write(date, Datos1);
    
}


public void hour(){

    clickElement(hour);
    clickElement(pm);
   
}



public void save(){

    clickElement(savebuttom);
   
}
public void passed()throws InterruptedException {

    clickElement(passed);
    Thread.sleep(3000);
   
}
public void notes(String Datos1){

    Write(notes, Datos1);

}
public void save1()throws InterruptedException {

    clickElement(savebuttom);
    Thread.sleep(1000);
}
public void offerjob()throws InterruptedException {

    clickElement(offerjob);
    Thread.sleep(1000);
   
}
public void save2()throws InterruptedException {

    clickElement(save);
    Thread.sleep(1000);
}
public void hire()throws InterruptedException {

    clickElement(hire);
    Thread.sleep(1000);
}
public void save3()throws InterruptedException {

    clickElement(save);
    Thread.sleep(1000);
}
public void view()throws InterruptedException {

    clickElement(buttomRecruitment);
    Thread.sleep(1000);
}
public void data()throws InterruptedException {

    clickElement(status);
    Thread.sleep(5000);
}

public void close(){

    closeNavigate();


}
}

