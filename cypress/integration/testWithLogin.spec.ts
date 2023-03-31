import { RobotEyes, RobotHands, Dependencies } from '../robots/Robot';

context('Amazon assignment', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Amazon Assignment', ()=>{

        it("navigate to amazon page", () => {
            dependencies.visitAmazon();
            });

            it("Test with login",()=>{

                robotHands.clickOnMobilesTab()
                robotHands.selectPrimeCheckbox()
                robotHands.getFirstIteamDeliveryDate()
                //robotEyes.assertingDeliveryStatus()
                robotHands.clickOnSignInBtn()
                robotHands.signInPage()
                robotHands.navigatingToOrders()
                robotHands.selectingPastOneYearOrders()
                robotHands.selectingTheYourAccount()
                robotHands.selectingTheYourAddress()
                robotHands.addingNewAddress()
                robotEyes.assertingTheAddress()
                robotHands.selectingTheYourAccount()
                robotHands.selectingThePaymentOption()
                robotEyes.assertingPayment()
               
            })
            
           
    })

    })

