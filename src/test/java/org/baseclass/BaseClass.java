package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public  static Robot r;
	public static Select s;
	public static Alert a1;
	
	//launchBrowser-1
	
    public static void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\Seleniumday1\\newdriver\\chromedriver.exe");
    driver=new ChromeDriver();
    }
    
    //loadUrl-2
    
    public static void loadUrl(String url) {
		driver.get(url);

	}
    
    //CurrentUrl-3
    
    public  static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url of the page opened:" +currentUrl);
	}
    
    //getTitle-4
    
    public static void pageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle:" + pageTitle);

	}
    
    //windowMaximize-5
    
    public static void windowMax() {
		driver.manage().window().maximize();

	}
    //sendKeys-Fill-6
    
    public static void fill(WebElement e,String s) {
    	e.sendKeys(s);
	
	}
    
    //ButtonClick-7
    public static void btnClk(WebElement e) {
    	e.click();
	}
    
    //GetAttribute-8
    
    public static void getTheEnteredValue(WebElement e) {
	     String attributeValue = e.getAttribute("value");
	     System.out.println("the value of the attribute:" +attributeValue);

	}
    
    //GetText-9
    
    public static void getTheText(WebElement e) {
    	String textValue = e.getText();
    	System.out.println("the text value is:" +textValue);
		        
	}
    
    //DoubleClick-Actions-9
    
    public static void doubleClk(WebElement e) {
         new Actions(driver).doubleClick(e).perform();
	
	}
    
    //ContextClick-Actions-10
    
    public static void contextclk(WebElement e) {
    	new Actions(driver).contextClick(e).perform();
	
	}
    
    //Copy-Robot class-11
    
    public static void copy() throws AWTException {
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_C);
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_C);
    	
	}
    
    //CloseBrowser-12
    
    public static void closeBrowser() {
    	driver.close();
	
    }
    
    //QuitBrowser-13
    
    public static void quitBrowser() {
		driver.quit();
    }
    
    //RefreshPage-14
    
    public static void refreshPage() {
		driver.navigate().refresh();
	}
    
    //Navigate back-15
    
    public static void previousPage() {
		driver.navigate().back();
	}
    
    //Navigate to-16 
    
    public static void launchUrl(String s) {
		driver.navigate().to(s);
	}
    
    //Navigate forward-17
    
    public static void forwardNavigate() {
		driver.navigate().forward();
	}
    
    //webElement Methods-isDisplayed-18
    
    public static void isDisplayedMethod(WebElement e) {
		 boolean displayed = e.isDisplayed();
		System.out.println(displayed);
    }
    
     //webElement Methods-isEnabled-19
    
    public static void isEnabledMethod(WebElement e) {
		boolean enabled = e.isEnabled();
		System.out.println(enabled);
	}
    
    //webElement Methods-isSelected-20
    
    public static void isSelectedMethod(WebElement e) {
		boolean selected = e.isSelected();
		System.out.println(selected);
    }
    
    //MoveToElement-Actions-21
    
    public static void moveToElementMethod(WebElement e) {
    	new Actions(driver).moveToElement(e).perform();
	}
    
    //dragAndDropMethod-Actions-22
    
    public static void dragAndDropMethod(WebElement s,WebElement d) {
    	new Actions(driver).dragAndDrop(s, d).perform();
	}
    
    //Frame-webElement-23
    
    public static void framesSwitch1(WebElement e) {
		driver.switchTo().frame(e);
	}
    
    //Frame-string name-24
    
    public static void framesSwitch2(String s) {
		driver.switchTo().frame(s);
	}
    
    //Frame-String Id-25
    public static void framesSwitch3(int index) {
		driver.switchTo().frame(index);
		
	}
    
     //Frame-parentFrame-26
    public static void parentFramesSwitch() {
		driver.switchTo().parentFrame();
	}
    
    //Frame-DefaultContent-27
    
    public static void defaultContentFramesSwitch() {
		driver.switchTo().defaultContent();
	}
    
    //Alert-Accept-28
    
    public static void acceptAlert() {
    	a1=driver.switchTo().alert();
        String textAlert = a1.getText();
        System.out.println(textAlert);
		a1.accept();
	}
    
    //Alert-dismiss-29
    
    public static void dismissAlert() {
    	a1=driver.switchTo().alert();
    	String textAlert = a1.getText();
        System.out.println(textAlert);
		a1.dismiss();
	}
    
//    public static void dateMethod1() {
//		System.out.println("StartTime");
//		Date d=new Date();
//		System.out.println(d);
//	}
//    public static void dateMethod2() {
//		System.out.println("EndTime");
//		Date d1=new Date();
//		System.out.println(d1);
//	}
    
    //switchTo.Windows-30
    
    public static void switchToWindowsMethod(String s) {
		driver.switchTo().window(s);

	}
    public static void switchToWindowsUrlMethod( String url) {
		driver.switchTo().window(url);

	}
    public static void switchToWindowsIdMethod(String id) {
		driver.switchTo().window(id);

	}
    //Windows-getWindowHandle-31
    public static void windowHandlingMethod() {
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
	} 
    
    //Windows-getWindowHandles-32
    public static void allWindowHandlingMethod() {
		Set<String> allWindowHandlesId = driver.getWindowHandles();
		//System.out.println(allWindowHandlesId);
		for (String string : allWindowHandlesId) {
			System.out.println(string);
			
		}
	} 
    
    //Windows-switch to default content-33
    
    public static void switchToDefaultContentWindow() {
		driver.switchTo().defaultContent();
	}
    
  //Windows-switch to parent window-34
    
    public static void switchToParentWindow(String s) {
		driver.switchTo().window(s);
	}
    
    //DropDown-isMultiple-35
    
    public static void isMultipleMethod() {
		boolean MultipleValueOrNot = s.isMultiple();
		System.out.println(MultipleValueOrNot);
    }
    
    //DropDown-SelectByVisibleText-36
    
    public static void SelectByVisibleTextMethod(WebElement e,String s1) {
  
	     new Select(e).selectByVisibleText(s1);
    }
    
    //DropDown-SelectByIndex-37
    
    public static void SelectByIndexMethod(WebElement e,int i) {
  
    	 new Select(e).selectByIndex(i);
    }
    
    //DropDown-SelectByValue-38
    
    public static void SelectByValueMethod(WebElement e,String s1) {
    	  
	     new Select(e).selectByValue(s1);
   }
    //DropDown-DeSelectedAll-39
    
    public static void deSelectAllMethod(WebElement e) {
  	  
    	 new Select(e).deselectAll();
    }
    
    
    //DropDown-AllSelectedOPtions-40
    
    public static void allSelectedOptions(WebElement e) {
    	  
	     List<WebElement> allSelectedOptions =new Select(e).getAllSelectedOptions();
	     for(WebElement allSelected:allSelectedOptions)
	     {
	    	 System.out.println("All selected options deisplayed below:"  );
	    	 System.out.println(allSelected);
	     }
    }
	     
	 //DropDown-first selected options-41
	     
	  public static void firstSelectedOptions(WebElement e) {
	    	 WebElement firstSelectedOption = new Select(e).getFirstSelectedOption();
	    	// String selectedoptions = firstSelectedOption .getText();
	    	// System.out.println(selectedoptions);
	    	 System.out.println(firstSelectedOption .getText());
	     
    }
	     
	 //DropDown-DeselectedByValue-42
	  
	  public static void deselectByvalueMethod(WebElement e,String s1) {
	  new Select(e).deselectByValue(s1);
	}
	     
      //DropDown-DeselectedByIndex-43
	  
	  public static void deselectByIndexMethod(WebElement e,int i) {
		  new Select(e).deselectByIndex(i);
	  }
	  
      //DropDown-DeselectedByVisibleText-44
	  
	  public static void deselectByVisibleTextMethod(WebElement e,String s1) {
		  new Select(e).deselectByVisibleText(s1);
	}
	  
	  //windows-to check the parent window is equals to child window-45
	  
	  public static void windowspwcw() {
		String windowHandle = driver.getWindowHandle();
		System.out.println("parent window is: "+windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("child window is "+windowHandles);
		for(String eachWindowId:windowHandles)
		{
			if(!windowHandle.equals(eachWindowId))
			{
				driver.switchTo().window(eachWindowId);
				
			}
		}

	}
	  
	   //ClearContent-46
	    
	    public static void clearContent(WebElement e) {
	    	e.clear();
		
	    }
	    
	  //Select-Robot class-47
	    
	    public static void select() throws AWTException {
	    	r=new Robot();
	    	r.keyPress(KeyEvent.VK_CONTROL);
	    	r.keyPress(KeyEvent.VK_A);
	    	r.keyRelease(KeyEvent.VK_CONTROL);
	    	r.keyRelease(KeyEvent.VK_A);
	    	
		}
	    
	  //Paste-Robot class-48
	    
	    public static void paste() throws AWTException {
	    	r=new Robot();
	    	r.keyPress(KeyEvent.VK_CONTROL);
	    	r.keyPress(KeyEvent.VK_V);
	    	r.keyRelease(KeyEvent.VK_CONTROL);
	    	r.keyRelease(KeyEvent.VK_V);
	    	
		}
	    
      //capsLetter-Robot class-49
	    
	    public static void smallLetter() throws AWTException {
	    	r=new Robot();
	    	r.keyPress(KeyEvent.VK_SHIFT);
	    	r.keyPress(KeyEvent.VK_A);
	    	r.keyRelease(KeyEvent.VK_SHIFT);
	    	r.keyRelease(KeyEvent.VK_A);
	    	
		}
	   
	  // getPageSource- WebDriver-50
	    
        public static void pageSource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	   }
        
     //findElement-51
//        
//        public static void findElementIdMethod(String s1) {
//		     driver.findElement(By.id(s1));
//		}
        
     //getWindowHandle-52
        
        public static void getWindowHandleMethod() {
			String parentWindowId = driver.getWindowHandle();
			System.out.println(parentWindowId);
		}
        
     //getWindowHandles-53
        
        public static void getWindowHandlesMethod() {
			Set<String> childWindowId = driver.getWindowHandles();
			int Count =0;
			for (String  eachWindowId :childWindowId ) {
				if(Count==5)
				{
					driver.switchTo().window(eachWindowId);
				}
				Count ++;
			}
		}
        
       //Action-KeyDown(press)-KeyUp(release)-54
        
        public static void keyDownKeyUpMethod(WebElement e,String s1) {
        	
        new Actions(driver).keyDown(e, Keys.SHIFT).sendKeys(e, s1).keyDown(e,Keys.SHIFT).perform();
		
		}
        
        //Select-getOptions-55
        
        public static void getOptionsMethod(WebElement e) {
			List<WebElement> Options = new Select(e).getOptions();
			for (WebElement allValues : Options) {
				System.out.println(allValues);
			}
//			for (int i = 0; i < Options.size(); i++) {
//				System.out.println(Options.get(i).getText());
//				
//			}

		}
        
       //Static Wait-Thread.sleep(4000)-56
        
        public static void staticWaitMethod(int i) throws InterruptedException {
			Thread.sleep(i);

		}
        
        //implicit Wait-57
        public static void implicitWaitMethod(int i) {
			driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		}
        
        //java script executor(setAttribute)-58
        
        public static void jsSetAttributeMethod(WebElement e,String s1) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arugments[0].setAttribute('values','"+s1+"')", e);
		
        }
        
       //java script executor(getAttribute)-58
        
        public static void jsGetAttributeMethod(WebElement e) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
		    String executeScript = (String) js.executeScript(" return arugments[0].getAttribute('values')",e);
			System.out.println(executeScript);
        }
        
       //java script executor(click())-59
        
        public static void jsClick(WebElement e) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
		    js.executeScript("arugments[0].click()",e);
			
        }
        
      //java script executor(highlightWebElement)-60
        
        public static void highlghWebElem(String color,String pixel,String bColor,WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style',background:"+color+"border:solid "+pixel+" "+bColor+"", element);
		}
     // java script executor(CssProperty)-61
        
        public static void cssProperty(WebElement e,String s1) {
        	e.getCssValue(s1);
        	
		
		}
        }





