package org.insiderTask.test;

import org.apache.log4j.Logger;
import org.insiderTask.base.BaseTest;
import org.insiderTask.page.InsiderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsiderPageTest extends BaseTest {
    InsiderPage insiderPage;
    final static Logger logger = Logger.getLogger(InsiderPageTest.class);

    @Before
    public void before() {
        logger.info("Test is start");
        insiderPage = new InsiderPage(getWebdriver());
    }

    @Test
    public void test() {
        insiderPage.urlCompare().takeScreenShot().acceptCookies().clickMore().clickCareers().subUrlCompare().scrollDownPage().takeScreenShotCareersLocations().isDisplayedLocations().scrollUpPage().scrollDownPage2().takeScreenShotCareersTerm().isDisplayedTerms().clickSeeAllTerms().clickQA().clickSeeAllJobs().clickFilterLocation().selectCity().clickFilterDepartment().selectDepartment().positionContains()
                .departmentContains().locationContains().button1Check().button2Check().button3Check().clickApplyButton().switchPage().checkUrl();
    }
    @After
    public void after() {
        logger.info("Test is end");
        tearDown();
    }
}
