package com.veeam.careers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Countries {
    @FindBy(xpath = "//*[contains(@class, 'account__name_hasAccentLetter')]")
    private WebElement userMenu;
}
