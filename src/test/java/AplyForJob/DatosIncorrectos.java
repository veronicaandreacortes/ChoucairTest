package AplyForJob;


import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.support.ui.*;

public class DatosIncorrectos {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/job/analista-de-pruebas-bogota/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void form () {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   
		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.className("application_button")).click();
		
		driver.findElement(By.id("nombre-completo")).sendKeys("123456789");
		
		driver.findElement(By.id("correo-electronico")).sendKeys("123456789");
		
		driver.findElement(By.id("celular-o-telefono-de-contacto")).sendKeys("no me acuerdo");
		
		driver.findElement(By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente")).sendKeys("123456789&/&$&/$");
		
		driver.findElement(By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica")).sendKeys("123456789#&&(/%(");
		
		driver.findElement(By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica")).sendKeys("123456789$$%#/%&FDSGgsá");
	
		driver.findElement(By.id("cual-es-tu-aspiracion-salarial")).sendKeys("programo por comida $$%#/%&FDSGgsá");
		
		driver.findElement(By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias")).sendKeys("123456789 no se $$%#/%&FDSGgsá");
		
		driver.findElement(By.id("mensaje-adicional")).sendKeys("123456789 $$%#/%&FDSGgsá");
		
		driver.findElement(By.id("wp_job_manager_send_application")).click();
		
		driver.findElement(By.id("cv")).click();
		
		driver.findElement(By.className("button wp_job_manager_send_application_button")).click();
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	
	public void tearDown() {
		driver.quit();
	}
	
}
