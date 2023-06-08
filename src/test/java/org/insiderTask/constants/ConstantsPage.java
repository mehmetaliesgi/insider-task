package org.insiderTask.constants;

import org.openqa.selenium.By;

public class ConstantsPage {
    public static final By ACCEPT_COOKIES = By.id("wt-cli-accept-all-btn");
    public static final By MORE = By.xpath("//*[@id=\"mega-menu-1\"]/span[text()=\"More\"]");
    public static final By CAREERS = By.cssSelector("a[href=\"https://useinsider.com/careers/\"]");
    public static final By CAREERS_LOCATIONS = By.cssSelector("div[class='elementor-element elementor-element-38b8000 elementor-widget elementor-widget-wp-widget-insider-locations']");
    public static final By CAREERS_TERMS = By.cssSelector("div[class=\"elementor-widget-wrap e-swiper-container\"]");
    public static final By SEE_ALL_TEAMS = By.xpath("//*[@id=\"career-find-our-calling\"]/div/div/a");
    public static final By CLICK_QA = By.cssSelector("div[class=\"job-image text-center\"] > a[href=\"https://useinsider.com/careers/quality-assurance/\"]");
    public static final By SEE_ALL_JOBS = By.cssSelector("a[href=\"https://useinsider.com/careers/open-positions/?department=qualityassurance\"]");
    public static final By FILTER_LOCATION = By.cssSelector("span[id=\"select2-filter-by-location-container\"]");
    public static final By SELECT_CITY = By.cssSelector("ul[id=\"select2-filter-by-location-results\"]");
    public static final By FILTER_DEPARTMENT = By.cssSelector("span[id=\"select2-filter-by-department-container\"]");
    public static final By SELECT_DEPARTMENT = By.cssSelector("ul[id=\"select2-filter-by-department-results\"]");
    public static final By POSITION_CONTAINS = By.cssSelector("p[class=\"position-title font-weight-bold\"]");
    public static final By DEPARTMENT_CONTAINS = By.cssSelector("span[class=\"position-department text-large font-weight-600 text-primary\"]");
    public static final By LOCATION_CONTAINS = By.cssSelector("div[class=\"position-location text-large\"]");
    public static final By BUTTON_CHECK = By.xpath("//*[@class=\"position-list-item col-12 col-lg-4 qualityassurance istanbul-turkey full-timeremote\"] // a[@href=\"https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc\"]");
    public static final By BUTTON1_CHECK = By.xpath("//*[@class=\"position-list-item col-12 col-lg-4 qualityassurance istanbul-turkey full-timeremote\"] // a[@href=\"https://jobs.lever.co/useinsider/6013cc18-8219-4587-a78c-9325c137b436\"]");
    public static final By BUTTON2_CHECK = By.xpath("//*[@class=\"position-list-item col-12 col-lg-4 qualityassurance istanbul-turkey full-timeremote\"] // a[@href=\"https://jobs.lever.co/useinsider/0ba4065b-955a-4661-ad4a-f32479f63757\"]");
    public static final By CLICK_APPLY_BUTTON = By.cssSelector("a[href=\"https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc\"]");
    public static final By BODY = By.cssSelector("body[class='home page-template page-template-layouts page-template-layout-home page-template-layoutslayout-home-php page page-id-2815 wp-embed-responsive home-page has-announce e-lazyload elementor-default elementor-kit-960 elementor-page elementor-page-2815']");
    public static final String EXPECTED_URL = "https://useinsider.com/";
   }
