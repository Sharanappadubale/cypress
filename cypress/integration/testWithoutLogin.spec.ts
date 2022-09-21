import { RobotEyes, RobotHands, Dependencies } from '../robots/Robot';

context('Amazon assignment', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()
    describe('Amazon assignment', ()=>{

        it("navigate to amazon page", () => {
            dependencies.visitAmazon();
            });

            it("Test without login",()=>{
                robotHands.clickOnTodaysDeals()
                robotHands.clickOnThirdElement()
               // robotHands.clickOnFirstElement()
                robotHands.addingItemToCart()
                robotHands.clickOnGoToCartBtn()
                robotEyes.veryfyingTheCart()
                robotHands.searchingMobiles()
                robotHands.scrollDownToGetLastElement()
                robotHands.getLastElementDetails()
                robotHands.navigateBack()
                robotHands.clickOnMenu()
                robotHands.clickOnMobiles()
                robotHands.clickOnMainMenu()
    
            })
        })
    })