import { RobotEyes, RobotHands, Dependencies } from '../robots/Robot';

context('Amazon assignment', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Amazon assignment', ()=>{

        it("navigate to amazon page", () => {
            dependencies.visitAmazon();
            });

            it("Tests with login",()=>{

                robotHands.searchingMobiles()
                robotHands.selectingPrimeCheckbox()
                robotHands.getFirstIteamDeliveryDate()
                robotHands.moveToLoginPage()
                robotHands.logIn()
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

