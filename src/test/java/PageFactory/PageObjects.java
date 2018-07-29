package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
		
		WebDriver driver;
		
	      
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'0')]")
	    WebElement btnZero;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'1')]")
	    WebElement btnOne;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'2')]")
	    WebElement btnTwo;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'3')]")
	    WebElement btnThree;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'4')]")
	    WebElement btnFour;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'5')]")
	    WebElement btnFive;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'6')]")
	    WebElement btnSix;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'7')]")
	    WebElement btnSeven;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'8')]")
	    WebElement btnEight;
	    
	    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'9')]")
	    WebElement btnNine;
	   
	    
	    @FindBy(xpath="//span[contains(text(),'÷')]")
		
		WebElement btnDivide;//Divide
		    
		@FindBy(xpath="//span[contains(text(),'×')]")
		WebElement btnMultiply;//Multiply
		    
		    @FindBy(xpath="//span[contains(text(),'−')]")
		    WebElement btnMinus; //Minus
		    
		    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'+')]")
		    WebElement btnPlus; //Plus
		    
		    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'=')]")
		    WebElement btnEquals; //Equals
		    
		    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'.')]")
		    WebElement btnPoint; //Point
		    
		    @FindBy(xpath="//span[contains(text(),'%')]")
		    WebElement btnPercentage; //Percentage
		    
		    @FindBy(xpath="//span[@class='cwbts'][contains(text(),')')]")
		    WebElement btnRightParenthesis;
		    
		    @FindBy(xpath="//span[@class='cwbts'][contains(text(),'(')]")
		    WebElement btnLeftParenthesis;
	  
	    @FindBy(xpath="//div[@id='cwbt42']")
	    WebElement btnXpwrY;
	    
	    @FindBy(xpath="//span[contains(text(),'√')]")
	    WebElement btnSqrR; //square root
	    
	    @FindBy(xpath="//div[@id='cwbt22']")
	    WebElement btnlgrthm;  //logarithm
	    
	    @FindBy(xpath="//span[contains(text(),'ln')]")
	    WebElement btnNatLgrthm; //natural logarithm
	    
	    @FindBy(xpath="//span[contains(text(),'x!')]")
	    WebElement btnFactor; // factorial
	    
	    @FindBy(xpath="//span[contains(text(),'EXP')]")
	    WebElement btnExp; // exponential
	  
	    @FindBy(xpath="//div[@id='cwbt31']")
	    WebElement btnTan; // tangent
	    
	    @FindBy(xpath="//div[@id='cwbt21']")
	    WebElement btnCos; // cosine
	    
	    @FindBy(xpath="//div[@id='cwrdc']")
	    WebElement btnSwitch; // switch between rads and degrees
	    
	    @FindBy(xpath="//div[@id='cwbt40']")
	    WebElement btnAnsw; //answer
	    
	    @FindBy(xpath="//div[@id='cwbt30']")
	    WebElement btnEul; //euler's number
	    
	    @FindBy(xpath="//span[contains(text(),'π')]")
	    WebElement btnPi; //pi
	    
	    @FindBy(xpath="//span[contains(text(),'Inv')]")
	    WebElement btnInv; //inverse
	  
	    @FindBy(xpath="//span[@id='cwclrbtnAC']")//span[@id='cwclrbtnCE']
	    WebElement btnClrRes; //clear result
	    
	    @FindBy(xpath="//span[@id='cwclrbtnCE']")
	    WebElement btnClr; //clear result
	    
	    @FindBy(id="cwos")
	    WebElement scrRslt; //screen output
	    
	    @FindBy(id="cwles")
	    WebElement scrExpr; //screen expression
	    
	    
	    public PageObjects(WebDriver driver){
	        this.driver = driver;
            PageFactory.initElements(driver, this); //initialization of  all WebElements
	    }
	    
	    	    
	  
	    public String getOutput(){
	        return    scrRslt.getText();
	       }
	    public String getExpression(){
	        return    scrExpr.getText();
	       }
	  
	    public void clickBtn(String button){

	    	try {
	    		switch (button) {
                case "btnDivide":
                	btnDivide.click();
                			break;	
                case "btnMultiply":
                	btnMultiply.click();
                			break;	
                case "btnMinus":
                	btnMinus.click();
                			break;	
                case "btnPlus":
                	btnPlus.click();
                			break;
                case "btnEquals":
                	btnEquals.click();
                			break;	
                case "btnPoint":
                	btnPoint.click();
                			break;
                case "btnPercentage":
                	btnPercentage.click();
                			break;	
                case "btnRightParenthesis":
                	btnRightParenthesis.click();
                			break;	
                case "btnLeftParenthesis":
                	btnLeftParenthesis.click();
                			break;
                case "btnZero":
                	btnZero.click();
                			break;	
                case "btnOne":
                	btnOne.click();
                			break;
                case "btnTwo":
                	btnTwo.click();
                			break;
                case "btnThree":
                	btnThree.click();
                			break;
                case "btnFour":
                	btnFour.click();
                			break;
                case "btnFive":
                	btnFive.click();
                			break;
                case "btnSix":
                	btnSix.click();
                			break;
                case "btnSeven":
                	btnSeven.click();
                			break;
                case "btnEight":
                	btnEight.click();
                			break;
                case "btnNine":
                	btnNine.click();
                			break;
                case "btnXpwrY":
                	btnXpwrY.click();
                			break;
                case "btnSqrR":
                	btnSqrR.click();
                			break;
                case "btnlgrthm":
                	btnlgrthm.click();
                			break;
                case "btnNatLgrthm":
                	btnNatLgrthm.click();
                			break;
                case "btnFactor":
                	btnFactor.click();
                			break;
                case "btnExp":
                	btnExp.click();
                			break;
                case "btnTan":
                	btnTan.click();
                			break;
                case "btnCos":
                	btnCos.click();
                			break;
                case "btnSwitch":
                	btnSwitch.click();
                			break;
                case "btnAnsw":
                	btnAnsw.click();
                			break;
                case "btnEul":
                	btnEul.click();
                			break;
                case "btnPi":
                	btnPi.click();
                			break;
                case "btnInv":
                	btnInv.click();
                			break;
                case "btnClr":
                	btnClr.click();
                			break;
                case "btnClrRes":
                	btnClrRes.click();
                			break;
	    		}
                } catch (IllegalArgumentException ex) {
                	System.out.println("Button is not existed");
                }
	            
	        }
	      
	    
		public void exprsn(String button) {
			 this.clickBtn(button);
		         
		}



	


		
}
	    