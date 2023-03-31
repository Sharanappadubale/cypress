import { BaseHands, BaseEyes, BaseDependencies } from './BaseRobot'
import data from './../fixtures/myData.json'


export class Dependencies extends BaseDependencies {
   
    visitAmazon(){
        this.accessUrl('https://www.amazon.in/')
    }
   
}

export class RobotEyes extends BaseEyes{

    veryfyingTheCart(){

      this.seesTextWithClass("a-dropdown-prompt",data.veryfyingTheCart)

    }
    assertingDeliveryStatus()
    {
       
       this.seesDomContainText("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-row a-size-base a-color-secondary s-align-children-center'] span:nth-child(2)",data.deliveryStatus)
    }
    
    assertingTheAddress(){

        this.seesTextWithClassAndIndex("id-addr-ux-search-text.a-text-bold",0,data.assertingTheAddress)

        }

    assertingPayment(){

       this.seesTextWithClass("a-size-base.pmts-instrument-display-name",data.assertingPayment)

      }

}

export class RobotHands extends BaseHands{

    clickOnTodaysDeals(){

        this.clickOnDomElement(".nav-a[href='/deals?ref_=nav_cs_gb']");
    }

    clickOnThirdElement(){

        this.clickOnChildDomElementWithIndex("[data-testid='grid-deals-container']>div",2)
        
    }
    clickOnFirstElement(){

        this.clickOnChildDomElementWithIndex("[class='a-unordered-list a-nostyle a-horizontal a-spacing-none']>li",0)
    }
    addingItemToCart(){
        this.wait(5000)
        this.clickOnId("add-to-cart-button")
    }

    clickOnGoToCartBtn()
    {
        this.wait(5000)
       cy.contains('Cart').click({force:true})
        //this.clickOnDomElement("#attach-sidesheet-view-cart-button > span > input")
       
    }
    
    searchingMobiles(){

     this.typeTextonId("twotabsearchtextbox","Mobiles")
     this.clickOnId("nav-search-submit-button")

    }

    scrollDownToGetLastElement()
    {
        this.ScrollintoView("[class='s-main-slot s-result-list s-search-results sg-row']>div",25)
        
    }

    getLastElementDetails()
    {
        this.clickOnDomElement("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_22'] div[class='a-section aok-relative s-image-fixed-height']")
        this.wait(5000)
        cy.get("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_22'] span[class='a-size-medium a-color-base a-text-normal']").then(function(text1){
        cy.log(text1.text())
       })
       
    }


    navigateBack() 
    {
      this.clickback()
     }

    clickOnMenu(){

      this.clickOnDomElement(".hm-icon.nav-sprite")

        }

    clickOnMobiles(){
     // this.wait(5000)
      this.clickOnDomElement("a[data-menu-id='8']")
      this.clickOnDomElement(".nav-sprite.hmenu-close-icon")

        }

    clickOnMainMenu(){

      this.clickOnDomElement("#nav-logo-sprites")

        }
      
    clickOnMobilesTab()
    {
        this.clickOnDomElement(".nav-a[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")
    }    


    selectPrimeCheckbox(){

      this.wait(3000)
      this.clickOnDomElement("#s-refinements > div:nth-child(3) > ul > li > span > a > div > label > i")
      
      }

    getFirstIteamDeliveryDate()
        {
      this.wait(3000)
      cy.get("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-row a-size-base a-color-secondary s-align-children-center'] span:nth-child(2)").then(function(text2){
      cy.log(text2.text())
        })
      }

    clickOnSignInBtn(){

        this.clickOnId("nav-link-accountList-nav-line-1")
    }
    signInPage(){
        console.log("ap_email")
        this.typeTextonId("ap_email",data.emailId)
        this.clickOnId("continue")
        this.typeTextonId("ap_password",data.password)
        this.clickOnId("signInSubmit")
    }
    
    navigatingToOrders(){
        this.clickOnId("nav-orders")
    }
    
    selectingPastOneYearOrders(){
        this.clickOnId("a-autoid-1-announce")
        this.clickOnId("time-filter_2")
    }
    selectingTheYourAccount(){
        this.clickOnId("nav-link-accountList")
    }
    selectingTheYourAddress()
    {
        
        this.clickOnDomElement("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
    }
    addingNewAddress(){
     
        this.clickOnId("ya-myab-plus-address-icon")
        this.typeTextonId("address-ui-widgets-enterAddressFullName",data.name)
        this.typeTextonId("address-ui-widgets-enterAddressPhoneNumber",data.mobileNo)
        this.typeTextonId("address-ui-widgets-enterAddressPostalCode",data.pinCode)
        this.typeTextonId("address-ui-widgets-enterAddressLine1",data.houseNo)
        this.typeTextonId("address-ui-widgets-enterAddressLine2",data.street)
        this.typeTextonId("address-ui-widgets-landmark",data.landmark)
        this.typeTextonId("address-ui-widgets-enterAddressCity",data.city)
        this.clickOnId("address-ui-widgets-enterAddressStateOrRegion")
        this.clickOnId("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_20")
        this.clickOnId("address-ui-widgets-form-submit-button")
    }
    
    selectingThePaymentOption(){
        this.clickOnDomElement("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
        }
        
}