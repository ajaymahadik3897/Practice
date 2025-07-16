package TestNG;

import org.testng.annotations.Test;

//Groups.xml is used to run the tests based on the groups defined in the code.

public class Groups {

    @Test (groups = {"sanity"})
    public void FacebookLogin() {
        System.out.println("Test 1 executed.");
    }

    @Test (groups = {"smoke"})
    public void TwiterLogin() {
        System.out.println("Test 2 executed.");
    }

    @Test (groups = {"regression"})
    public void InstagramLogin() {
        System.out.println("Test 3 executed.");
    }
}

     class New {
    @Test (groups = {"smoke", "regression"})
    public void FacebookLogout() {
        System.out.println("New Test 1 executed.");
    }
    @Test (groups = {"sanity"})
    public void TwiterLogout() {
        System.out.println("New Test 2 executed.");
    }
    @Test (groups = {"regression"})
    public void InstagramLogout() {
        System.out.println("New Test 3 executed.");
    }
        }

        class Third {
    @Test (groups = {"smoke", "sanity"})
    public void FacebookSearch() {
        System.out.println("Third Test 1 executed.");

    }
    @Test (groups = {"smoke"})
    public void TwiterSearch() {
        System.out.println("Third Test 2 executed.");
    }
        }
