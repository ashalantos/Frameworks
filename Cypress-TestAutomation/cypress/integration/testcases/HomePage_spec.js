import LoginPage from '../../pageObjects/LoginPage'

describe('HomePage Suite', function() {
    
    const loginPage = new LoginPage()

    it('Valid Login', function() {
        loginPage.login("gayathri.pradeep","password123!")
        loginPage.toolbarItemUser().contains('gayathri.pradeep');
    })

})