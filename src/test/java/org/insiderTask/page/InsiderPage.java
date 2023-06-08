package org.insiderTask.page;

import org.insiderTask.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.insiderTask.constants.ConstantsPage.*;

public class InsiderPage extends BasePage {
    public InsiderPage(WebDriver driver) {
        super(driver);
    }

    public InsiderPage urlCompare() {
        getUrl(EXPECTED_URL);
        return this;
    }

    public InsiderPage subUrlCompare() {
        subUrl("careers");
        return this;
    }

    public InsiderPage takeScreenShot() {
        screenShot(BODY);
        return this;
    }

    public InsiderPage acceptCookies() {
        click(ACCEPT_COOKIES);
        return this;
    }

    public InsiderPage clickMore() {
        click(MORE);
        return this;
    }

    public InsiderPage clickCareers() {
        click(CAREERS);
        return this;
    }

    public InsiderPage takeScreenShotCareersLocations() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        screenShot(CAREERS_LOCATIONS);
        return this;
    }

    public InsiderPage isDisplayedLocations() {
        isDisplayedItem(CAREERS_LOCATIONS);
        return this;
    }

    public InsiderPage takeScreenShotCareersTerm() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        screenShot(CAREERS_TERMS);
        return this;
    }

    public InsiderPage isDisplayedTerms() {
        isDisplayedItem(CAREERS_TERMS);
        return this;
    }

    public InsiderPage scrollDownPage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollDown(getLocation(CAREERS_LOCATIONS));
        return this;
    }

    public InsiderPage scrollDownPage2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollDown(getLocation(CAREERS_TERMS));
        return this;
    }

    public InsiderPage scrollUpPage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollUp();
        return this;
    }

    public InsiderPage clickSeeAllTerms() {
        _click(SEE_ALL_TEAMS);
        return this;
    }

    public InsiderPage clickQA() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _click(CLICK_QA);
        return this;
    }

    public InsiderPage clickSeeAllJobs() {
        _click(SEE_ALL_JOBS);
        return this;
    }

    public InsiderPage clickFilterLocation() {
        click(FILTER_LOCATION);
        return this;
    }

    public InsiderPage selectCity() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        select(SELECT_CITY,"Istanbul, Turkey");
        return this;
    }

    public InsiderPage clickFilterDepartment() {
        click(FILTER_DEPARTMENT);
        return this;
    }

    public InsiderPage selectDepartment() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        select(SELECT_DEPARTMENT,"Quality Assurance");
        return this;
    }

    public InsiderPage positionContains() {
        positionContainsCheck(POSITION_CONTAINS, "Software");
        return this;
    }

    public InsiderPage departmentContains() {
        departmentContainsCheck(DEPARTMENT_CONTAINS, "Quality Assurance");
        return this;
    }

    public InsiderPage locationContains() {
        locationContainsCheck(LOCATION_CONTAINS, "Istanbul");
        return this;
    }

    public InsiderPage button1Check() {
        applyButtonCheck(BUTTON_CHECK, "Apply Now");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public InsiderPage button2Check() {
        applyButtonCheck(BUTTON1_CHECK, "Apply Now");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public InsiderPage button3Check() {
        applyButtonCheck(BUTTON2_CHECK, "Apply Now");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public InsiderPage clickApplyButton() {
        _click(CLICK_APPLY_BUTTON);
        return this;
    }

    public InsiderPage checkUrl() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getRedirectUrl("lever");
        return this;
    }

    public InsiderPage switchPage() {
        switchWindow();
        return this;
    }
}
