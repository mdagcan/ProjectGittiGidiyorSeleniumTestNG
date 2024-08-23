import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class TestSteps extends BaseMethods {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void mainPageC() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://ais.usvisa-info.com/tr-tr/niv/users/sign_in";

        if (mainPageUrl.equals(mainPageUrlC)) {
            System.out.println("Anasayfaya giriş yaptınız.");
        } else {
            System.out.println("Anasayfaya giriş yapamadınız.");
        }

    }


    public void goToLogin() throws InterruptedException {
        clickToElement(WebElementsConstants.loginButton);
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.loginB);

    }


    public void login() throws InterruptedException {
        findElement(WebElementsConstants.usLoginNameField).sendKeys("selo5956@gmail.com");
        findElement(WebElementsConstants.usLoginPassField).sendKeys("RWi%r%#79Y8/=C%");
        System.out.println("Kullanici adi ve sifre girildi");
        clickToElement(WebElementsConstants.usLoginApproveField);
        System.out.println("Onay kutucugu tiklandi");
        clickToElement(WebElementsConstants.usLoginButton);
        System.out.println("Login butona basildi");
        clickToElement(WebElementsConstants.usContButton);
        System.out.println("devam et butonuna basildi");
        clickToElement(WebElementsConstants.usAgainTime);
        System.out.println("ilk randevuyu yeniden zamanla alanina basildi");
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.usAgainTime2);
        System.out.println("Ikinci randevuyu yeniden zamanla butonuna basildi");
        Thread.sleep(5000);
        clickToElement(WebElementsConstants.usDateSelectField);
        System.out.println("Ankara alani altindaki tarih alanina tiklandi");

        while (!findElement(WebElementsConstants.usSeptember).getText().contains("October")) {
            System.out.println("while loop icine girildi");
            for (int i = 1; i <= 5; i++) {
                System.out.println("ilk for dongusu icine girildi");
                for (int j = 1; j <= 7; j++) {
                    System.out.println("ikinci for dongusu icine giildi");
                    String xpath_string = "//body[1]/div[5]/div[1]/table[1]/tbody[1]/tr[" + String.valueOf(i) + "]/td["+ String.valueOf(j) + "]";
                    findElement(By.xpath(xpath_string)).click();
                    Thread.sleep(100);
                    if(!findElement(WebElementsConstants.usTableALL).isDisplayed()){
                        break;
                    }
                    System.out.println(j);
                }
                System.out.println(i);
            }
            findElement(WebElementsConstants.usNextButton).click();
            System.out.println("bir sonraki aya gecildi");
            Thread.sleep(1000);
        }










    }


    public void search(){
        findElement(WebElementsConstants.searchArea).sendKeys("Bilgisayar");
        clickToElement(WebElementsConstants.searchButton);

    }


    public void secondPage() {
        jse.executeScript("window.scrollBy(0,9000)");
        clickToElement(WebElementsConstants.secondPageButton);

        String secondPageUrl = "https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2";
        String secondPageC = getUrl();

        if(secondPageC.equals(secondPageUrl)){
            System.out.println("2. sayfadasınız.");
        }else{
            System.out.println("2. sayfada değilsiniz");
        }

    }


    public void addToBasket() throws InterruptedException {
        String price = findElement(WebElementsConstants.productPrice1).getText();
        clickToElement(WebElementsConstants.productDetailButton);

        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.addToBasketButton);

        Thread.sleep(2000);
        goToUrl("https://www.gittigidiyor.com/sepetim");
        String priceC = findElement(WebElementsConstants.price2).getText();

        if (price.equals(priceC)) {
            System.out.println("Ürün fiyatları eşit."+ price);
        } else {
            System.out.println("Ürün fiyatlarınız eşit değildir.");
        }

    }


    public void addToProduct() throws InterruptedException {
        clickToElement(WebElementsConstants.addButton);
        Thread.sleep(2000);
        String amount = findElement(WebElementsConstants.totalAmount).getText();
        String amountC= "Ürün Toplamı (2 Adet)";


        if(amount.equals(amountC)){
            System.out.println("Sepetinizdeki " + amount);
        }else{
            System.out.println("Sepetinizdeki ürün adedi farklıdır");
        }

    }


    public void deleteProduct() throws InterruptedException {
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.deleteButton);
        Thread.sleep(2000);
    }


    public void controlBasket() throws InterruptedException {
        String basket = "Sepetinizde ürün bulunmamaktadır.";
        String basketC = findElement(WebElementsConstants.basketControl).getText();
        Thread.sleep(2000);

        if (basket.equals(basketC)) {
            System.out.println("Sepetinizde ürün bulunmamaktadır.");
        } else {
            System.out.println("Sepetiniz boş değildir.");
        }

    }


    public void exit(){
       driver.quit();

    }


}
