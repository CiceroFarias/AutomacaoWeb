import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.apache.http.util.Asserts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
public class Step {
    private WebDriver navegador;
    @Dado("que eu esteja na pagina do globo esporte")
public void queEuEstejaNaPaginaDoGloboEsporte() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/55119/Downloads/chromedriver_win32/chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("https://ge.globo.com/");

}

    @Quando("clicar no icone do corinthians")
    public void clicarNoIconeDoCorinthians() {


            navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            navegador.findElement(By.id("mosaico__wrapper")).click();
navegador.close();

    }

    @Entao("devo visualizar as informações do corinthians")
    public void devoVisualizarAsInformaçõesDoCorinthians() {


    }





}
