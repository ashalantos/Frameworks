
// <reference types="cypress" />

import LoginPage from '../../pageObjects/LoginPage'

describe('Login Suite', function() {
    
    const loginPage = new LoginPage()

    it('InValid Login', function() {
        loginPage.login("wrongusername","wrongpassword")
        loginPage.invalidLoginErrorMsg().contains('Unrecognized username or password. Forgot your password?')
     })


    it('Valid Login', function() {
        loginPage.login("gayathri.pradeep","password123!")
        loginPage.toolbarItemUser().contains('gayathri.pradeep');
    })

})