
// <reference types="cypress" />

import LoginPage from '../../pageObjects/LoginPage'
import LogoutPage from '../../pageObjects/LogoutPage'


describe('Logout Suite', function() {
    
    const loginPage = new LoginPage()
    const logoutPage = new LogoutPage()
   

    it('Successful Logout Test', function() {
        loginPage.login("gayathri.pradeep","password123!")
        logoutPage.logout()
    })
})
