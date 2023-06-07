import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class mm {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // iPhone Simulator, iPad Simulator, iPhone Retina 4-inch, Android Emulator, Galaxy S4 и т.д.
        // На iOS, это должно быть одно  из допустимых устройств. На Android эта возможность в настоящее время игнорируется,
        // но параметр является обязательным
        capabilities.setCapability("deviceName", "pixel_6_pro");
        // Имя ОС на мобильном устройстве
        capabilities.setCapability("platformName", "Android");
        // Версия ОС
        capabilities.setCapability("platformVersion", "9.0");
        // Уникальный индефикатор подключенного устройства
        capabilities.setCapability("udid", "emulator-5554");
        // Java-пакет Android приложения, которое мы хотим запустить. (APK info)
        capabilities.setCapability("appPackage", "com.vkontakte.android");
        // Имя activity которые мы хотим запустить из пакета, указанного выше. (APK info)
        capabilities.setCapability("appActivity", "com.vkontakte.android.MainActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        //WebDriverWait wait = new WebDriverWait(driver,10,10);
        Thread.sleep(5000);
//            $(By.id("com.vkontakte.android:id/email_or_phone")).click();
        $(By.id("com.vkontakte.android:id/email_or_phone")).setValue("89520318951").pressEnter();
        $(By.id("com.vkontakte.android:id/login_button")).click();



        Thread.sleep(5000);


        $(By.id("com.vkontakte.android:id/login_by_password")).click();

        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.vkontakte.android:id/vk_password")));
        Thread.sleep(5000);
        $(By.id("com.vkontakte.android:id/vk_password")).click();
        $(By.id("com.vkontakte.android:id/vk_password")).setValue("Q8MM44@COlNOKme").pressEnter();

        $(By.id("com.vkontakte.android:id/vk_loading_btn_textView")).click();
        Thread.sleep(10000);

//        ("down");
//        ("down");
//        ("down");
//        ("down");

        $x("//android.widget.FrameLayout[@content-desc=\"Messenger\"]/android.widget.FrameLayout[2]/android.widget.ImageView").click();

        Thread.sleep(5000);

//        ("down");
//        ("down");
//        ("down");
//        ("down");

        $x("//android.widget.FrameLayout[@content-desc=\"Hub\"]/android.widget.FrameLayout[2]/android.widget.ImageView").click();

        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.vkontakte.android:id/menu")));
        Thread.sleep(4000);
        $(By.id("com.vkontakte.android:id/menu")).click();

        Thread.sleep(5000);

        $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView").click();

        Thread.sleep(5000);

        $x("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView").click();

        Thread.sleep(5000);
        $x("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView").click();
        $x("//android.widget.ImageButton[@content-desc=\"Back\"]").click();
        Thread.sleep(5000);
        ////

        $(By.id("com.vkontakte.android:id/logout")).click();
        Thread.sleep(2000);
        $(By.id("android:id/button1")).click();
        Thread.sleep(4000);
        $(By.id("com.vkontakte.android:id/settings")).click();
        Thread.sleep(2000);
        $(By.id("com.vkontakte.android:id/delete_icon")).click();
        Thread.sleep(2000);
        $(By.id("android:id/button1")).click();

        //driver.context("NATIVE_APP");
    }
}
