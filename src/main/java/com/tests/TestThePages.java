package com.tests;

import com.pages.P1HomePage;
import com.pages.P2RoboPage;
import org.testng.annotations.Test;

public class TestThePages extends Prerequisites {


    P1HomePage P1HomePageObj;
    P2RoboPage P2RoboPageObj;

    @Test
    public void fileFilling() {
        P1HomePageObj = new P1HomePage(driver);

        P1HomePageObj.fillFirstName();
        P1HomePageObj.fillLastName();
        P1HomePageObj.setSalesTarget();
        P1HomePageObj.fillResults();
        P1HomePageObj.clickSubmitButton();
    }

    @Test
    public void roboPage() {

        P2RoboPageObj = new P2RoboPage(driver);

        P2RoboPageObj.clickRoboTab();
        P2RoboPageObj.clickRoboAgreement();
        P2RoboPageObj.chooseHead();
        P2RoboPageObj.chooseBody();
        P2RoboPageObj.chooseLegs();
        P2RoboPageObj.enterShippingAdress();
        P2RoboPageObj.roboPreview();
        P2RoboPageObj.roboOrder();

    }

}
