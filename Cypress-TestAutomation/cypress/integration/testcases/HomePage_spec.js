import LoginPage from '../../pageObjects/LoginPage'

describe('HomePage Suite', function() {
    
    const loginPage = new LoginPage()

    it('Valid Login', function() {
        loginPage.login("ashal.anto","password123!")
        loginPage.toolbarItemUser().contains('ashal.anto');
    })

})