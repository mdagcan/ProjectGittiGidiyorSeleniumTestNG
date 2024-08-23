import org.openqa.selenium.By;

public class WebElementsConstants {
    public static By loginButton = By.xpath("//div[@class='gekhq4-4 hwMdSM']");
    public static By loginB = By.cssSelector("[data-cy='header-login-button']");
    public static By userName = By.id("L-UserNameField");
    public static By password = By.id("L-PasswordField");
    public static By loginB2 = By.id("gg-login-enter");
    public static By nickName = By.cssSelector("div[class='gekhq4-4 hwMdSM']>:nth-child(2)");
    public static By searchArea = By.xpath("//input[@type='text']");
    public static By searchButton = By.cssSelector(".qjixn8-0.sc-1bydi5r-0.hKfdXF");
    public static By secondPageButton = By.cssSelector("ul[class='clearfix'] [href='/arama/?k=Bilgisayar&sf=2']");
    public static By productPrice1= By.cssSelector("p[class='fiyat price-txt robotobold price']");
    public static By productDetailButton = By.cssSelector("[class='catalog-view clearfix products-container']>:nth-child(1)");
    public static By addToBasketButton = By.cssSelector("[id='purchaseSoldInfoActionButtons'] [id='add-to-basket']");
    public static By price2 = By.cssSelector("div[class='total-price']");
    public static By addButton = By.cssSelector("option[value='2']");
    public static By totalAmount = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-child(1)");
    public static By deleteButton = By.cssSelector("a[title='Sil']");
    public static By basketControl = By.cssSelector("div[class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']>:nth-child(1)");

    public static By usLoginNameField = By.xpath("//input[@id='user_email']");
    public static By usLoginPassField = By.xpath("//input[@id='user_password']");
    public static By usLoginApproveField = By.xpath("//body/div[5]/main[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/label[1]/div[1]");
    public static By usLoginButton = By.xpath("//input[@name='commit']");
    public static By usContButton = By.xpath("//a[normalize-space()='Devam Et']");
    public static By usAgainTime = By.xpath("//h5[normalize-space()='Randevuyu Yeniden Zamanla']");
    public static By usAgainTime2 = By.xpath("//a[contains(text(),'Randevuyu Yeniden Zamanla')]");
    public static By usDateSelectField = By.xpath("//input[@id='appointments_consulate_appointment_date']");


    public static By usTable = By.xpath("//body[1]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");
    public static By usTableALL = By.xpath("//div[@id='ui-datepicker-div']");

    public static By usNextButton = By.xpath("//span[contains(text(),'Next')]");
    public static By usSeptember = By.cssSelector("div[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left'] span[class='ui-datepicker-month']");





}
