import grails.test.*

class StoreControllerTests extends ControllerUnitTestCase {
       void testRenderHomePage() {
           controller.index()
           assertEquals "Welcome to the gTunes store!",
                controller.response.contentAsString
       }

    }
