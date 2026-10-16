package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebElement element;
	private static ThreadLocal<WebDriver> tdriver= new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver){
		tdriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		return tdriver.get();
	}
	
	public static void unload() {
		if (tdriver.get()!= null) {
			getDriver().quit();
			tdriver.remove();
		}
	}
	
	public static void toLaunchChrome() {
		WebDriver driver= new ChromeDriver();
		setDriver(driver);
	}
	
	public static void toLaunchEdge() {
		WebDriver driver= new EdgeDriver();
		setDriver(driver);
	}
	
	public static void toLaunchFf() {
		WebDriver driver= new FirefoxDriver();
		setDriver(driver);
	}
	
	public static void toLaunchIE() {
		WebDriver driver= new InternetExplorerDriver();
		setDriver(driver);
	}
	
	public static void getUrl(String url) {
		getDriver().get(url);
	}
	
	public static void toMax() {
		getDriver().manage().window().maximize();
	}
	
	public static void tomin() {
		getDriver().manage().window().minimize();
	}
	
	public static void getTitle() {
		String title = getDriver().getTitle();
		System.out.println(title);
	}
	
	public static void getCurrentUrl() {
		String currentUrl = getDriver().getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void toClose() {
		getDriver().close();
	}
	
	public static void toQuit() {
		getDriver().quit();
	}
	
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void getText(WebElement element) {
		element.getText();
	}
	
	public static String getAttribute(WebElement element, String name) {
		return element.getAttribute(name);
	}
	
	public static void moveToElement(WebElement element) {
		Actions a= new Actions(getDriver());
		a.moveToElement(element);
	}
	
	public static void dragAndDrop(WebElement element1, WebElement element2) {
		Actions a= new Actions(getDriver());
		a.dragAndDrop(element1, element2);
	}
	
	public static void doubleClick(WebElement element) {
		Actions a= new Actions(getDriver());
		a.doubleClick(element);
	}
	
	public static void contextClick(WebElement element) {
		Actions a= new Actions(getDriver());
		a.contextClick(element);
	}
	
	public static void build() {
		Actions a= new Actions(getDriver());
		a.build();
	}
	
	public static void perform() {
		Actions a= new Actions(getDriver());
		a.perform();
	}
	
	public static void keyUp(CharSequence key) {
		Actions a= new Actions(getDriver());
		a.keyUp(key);
	}
	
	public static void keyDown(CharSequence key) {
		Actions a= new Actions(getDriver());
		a.keyDown(key);
	}
	
	public static void FrameId(int index) {
		getDriver().switchTo().frame(index);
	}
	
	public static void frameRef(WebElement element) {
		getDriver().switchTo().frame(element);
	}
	
	public static void frameName(String name) {
		getDriver().switchTo().frame(name);
	}
	
	public static void parentFrame() {
		getDriver().switchTo().parentFrame();
	}
	
	public static void defaultContent() {
		getDriver().switchTo().defaultContent();
	}
	
	public static void keyPress(int key) throws AWTException {
		Robot r= new Robot();
		r.keyPress(key);
	}
	
	public static void keyRelease(int key) throws AWTException {
		Robot r= new Robot();
		r.keyRelease(key);
	}
	
	public static void alert() {
		getDriver().switchTo().alert();
	}
	
	public static void acceptAlert() {
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}
	
	public static void dismissAlert() {
		Alert alert = getDriver().switchTo().alert();
		alert.dismiss();
	}
	
	public static void sendKeysAlert(String name) {
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys(name);
	}
	
	public static void getAlertText() {
		Alert alert = getDriver().switchTo().alert();
		alert.getText();
	}
	
	public static void insertvalue(WebElement element, String value) {
		JavascriptExecutor js= (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('value',value)", element);
	}
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click", element);
	}
	
	public static void retriveText(WebElement element, String value) {
		JavascriptExecutor js= (JavascriptExecutor) getDriver();
		js.executeScript("return arguments[0].getAttribute('value')", element);
	}
	
	public static void toScrollDown(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) getDriver();
		js.executeScript("arguments.scrollIntoView(false)", element);
	}
	
	public static void scrollIntoUp(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void takeScreenshot(String path, String filename) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) getDriver();
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File f= new File(path + filename+".png");
		FileUtils.copyFile(temp, f);
	}
	
	public static void windowurl(String url) {
		getDriver().switchTo().window(url);
	}
	
	public static void windowTitle(String title) {
		getDriver().switchTo().window(title);
	}
	
	public static void WindowID(String id) {
		getDriver().switchTo().window(id);
	}
	
	public static void getWinHandle() {
		String windowHandle = getDriver().getWindowHandle();
	}
	
	public static void getWinHandles() {
		Set<String> windowHandles = getDriver().getWindowHandles();
	}
	
	public static void selectByValue(WebElement element, String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement element, int index) {
		Select s= new Select(element);
		s.selectByIndex(index);
	}
	
	public static void selectByVisibleText(WebElement element, String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void isMultiple(WebElement element) {
		Select s= new Select(element);
		s.isMultiple();
	}
	
	public static void getOptions(WebElement element) {
		Select s= new Select(element);
		s.getOptions();
	}
	
	public static void getAllOption(WebElement element) {
		Select s= new Select(element);
		s.getAllSelectedOptions();
	}
	
	public static void getFirstOption(WebElement element) {
		Select s= new Select(element);
		s.getFirstSelectedOption();
	}
	
	public static void deselectByIndex(WebElement element, int index) {
		Select s= new Select(element);
		s.deselectByIndex(index);
	}
	
	public static void deselectByValue(WebElement element, String value) {
		Select s= new Select(element);
		s.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(WebElement element, String text) {
		Select s= new Select(element);
		s.deselectByVisibleText(text);
	}
	
	public static void deselectAll(WebElement element) {
		Select s= new Select(element);
		s.deselectAll();
	}
	
	public static void implicitWait(int sec) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static void webDriverWait(int sec) {
		Wait<WebDriver> wait= new WebDriverWait(getDriver(), Duration.ofSeconds(sec));
	}
	
	public static void FluentWait(long sec, long ms) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(getDriver())
				.withTimeout(Duration.ofSeconds(sec))
				.pollingEvery(Duration.ofMillis(ms))
				.ignoring(Exception.class);
	}
	
	public static void to(String url) {
		getDriver().navigate().to(url);
	}
	
	public static void refresh() {
		getDriver().navigate().refresh();
	}
	
	public static void back() {
		getDriver().navigate().back();
	}
	
	public static void forward() {
		getDriver().navigate().forward();
	}
	
	public static String toReadData(String path , String name, String Sname, int Rnum, int Cnum) throws IOException {
		
		File f= new File(path + "\\" + name + ".xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook book= new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet(Sname);
		Row row = sheet.getRow(Rnum);
		Cell cell = row.getCell(Cnum);
		String data="";
		
		if (cell.getCellType()== 1) {
			data = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sim= new SimpleDateFormat();
			data = sim.format(date);
		}
		else {
			double db = cell.getNumericCellValue();
			long l= (long) db;
			String.valueOf(l);
		}
		return data;
	}
	
	public static void toWriteData(String path,String name, String Sname, String value, int Rnum, int Cnum) throws IOException {
		
		File f= new File(path + name + ".xlsx");
		Workbook book= new XSSFWorkbook();
		Sheet sheet = book.createSheet(Sname);
		Row row = sheet.createRow(Rnum);
		Cell cell = row.createCell(Cnum);
		cell.setCellValue(value);
		FileOutputStream fout= new FileOutputStream(f);
		book.write(fout);
	}
	
	public static void enabled(WebElement element) {
		boolean enabled = element.isEnabled();
	}
	
	public static void displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
	}
	
	public static void selected(WebElement element) {
		boolean selected = element.isSelected();
	}

}
