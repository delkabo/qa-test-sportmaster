package com.delkabo.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SportMasterObject {
    private SelenideElement footer = $$(".sm-footer-left-block-section__element .sm-text")
            .findBy(text("Вакансии")),
            burger = $$(".menu-item .burger-menu-location-text")
                    .findBy(text("Вакансии")),
            searchLine = $(".search-input-field.w-input"),
            vacContainer = $(".vacancies-container"),
            vacTitle = $(".vacancy-info-title");

    public SportMasterObject openPage() {
        open("https://www.sportmaster.ru/");
        return this;
    }

    public SportMasterObject clickTab() {
        executeJavaScript("document.body.style.webkitTransform = 'scale(0.9)'");
        footer.scrollTo().click();
        return this;
    }

    public SportMasterObject clickPage() {
        burger.click();
        return this;
    }

    public SportMasterObject searchVac(String query) {
        searchLine.setValue(query).pressEnter();
        return this;
    }

    public SportMasterObject clickSearch(String searchN) {
        vacContainer.$(withText(searchN)).scrollTo().click();
        return this;
    }

    public SportMasterObject haveTitle(String shouldN){
        vacTitle.scrollTo();
        vacTitle.shouldHave(text(shouldN));
        return this;
    }



}
