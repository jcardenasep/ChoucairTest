package steps;

import io.cucumber.java.en.*;
import pages.PagePrincipal;

public class Steps {

    PagePrincipal Landing = new PagePrincipal();

    @Given("I navigate to www.opensource-demo.orangehrmlive.com")
    public void iNavigateChoucair(){

        Landing.navigateToChoucair();

    }

   
    @When("The user enters {word} and {word}")
    public void FormDataContact(String keystosend, String keystosend2){

        Landing.FormData(keystosend, keystosend2);

    }

   

       @And("the user clicks the login button")
    public void ClickbuttomContact(){

        Landing.Clickbuttom();

    }


    @Then("you are on the home page click on Recruitment")
    public void ClickbuttomRecruitment(){

        Landing.ClickbuttomRecruitment();

    }

    @When("you are on the recruitment page click on add")
    public void ClickbuttomAdd(){

        Landing.ClickbuttomAdd();

    }
    @And("the user fills out the recruitment form firstname {word} middlename {word} lastname {word}")
    public void RecruitmentForm(String keystosend, String keystosend2, String keystosend3){

        Landing.RecruitmentForm(keystosend, keystosend2, keystosend3);

    }

    @When("the list is displayed an option is chosen")
    public void selectEmploymentStatus() {
        Landing.selectFromDropdownDiv("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div", 2);
    }

    @And("user fills out email {word} and contactnumber {word}")
    public void RecruitmentForm2(String keystosend, String keystosend2) {
        Landing.RecruitmentForm2(keystosend, keystosend2);
    }

    @And("user click in load file")
    public void Clickbuttomfile() {
        Landing.uploadFile();
    }

    @And("user fills out palabra {word}")
    public void RecruitmentForm3(String keystosend) {
        Landing.RecruitmentForm3(keystosend);
    }

    @When("user fills out textarea {word}")
    public void RecruitmentForm4(String keystosend) {
        Landing.RecruitmentForm4(keystosend);
    }

    @And("click in accept buttom")
    public void Clickaccept() throws InterruptedException{

        Landing.Clickacceptandsend();

    }

    @Given("application Initiated Click on shortlist")
    public void Shortlist(){

        Landing.Shortlist();

    }

    @When("you are in Shortlist Candidate add the note {word}")
    public void note(String keystosend) {
        Landing.note(keystosend);
    }

    @And("click in save buttom")
    public void Clicksave()throws InterruptedException {

        Landing.Clicksave();
    }

    @Given("click in schedule interview buttom")
    public void Clickinterview()throws InterruptedException {

    Landing.Clickinterview();
    }

    @And("user is in Schedule Interview add the tittle {word}")
    public void interviewtittle(String keystosend) {
        Landing.interviewtittle(keystosend);
    }

    @When("user is in Interviewer add the tittle {word}")
    public void interviewer(String keystosend)throws InterruptedException  {
        Landing.interviewer(keystosend);
    }

    @Then("the list is displayed and one is chosen")
    public void selectInterviewer() {
        Landing.selectFromDropdownDiv("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input", 2);
    }

    @Given("being in the field enter date {word}")
    public void date(String keystosend) {
        Landing.date(keystosend);
    }

    @And("click in hour buttom")
    public void hour(){

    Landing.hour();
    
    }

    @And("click in save")
    public void save(){

    Landing.save();
    }

    @When("being in Application Stage click on Mark Interview Passed")
    public void passed() throws InterruptedException{

    Landing.passed();
    }

    @And("user inssert {word}")
    public void notes(String keystosend) {
        Landing.notes(keystosend);
    }

    @And("click in save buttom again")
    
    public void saves1() throws InterruptedException{

    Landing.save1();
    
    }
    @And("click in offer job")
    
    public void offerjob() throws InterruptedException{

    Landing.offerjob();
    
    }

    @And("click the save button once again")
    public void save2() throws InterruptedException{

    Landing.save2();
    }
    @And("click the hire button")
    public void hire() throws InterruptedException{

    Landing.hire();
    }
    @And("now click on the save button")
    public void save3() throws InterruptedException{

    Landing.save3();
    }
    @Given("you are in Recruitment")
    public void view() throws InterruptedException{

        Landing.view();
    }
    @And("verify data")
    public void data() throws InterruptedException{

    Landing.data();
    }

    @And("Exit")
    public void Exit(){

    Landing.closeNavigate();
    }
}