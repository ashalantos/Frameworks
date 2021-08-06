
// <reference types="cypress" />

import LoginPage from '../../pageObjects/LoginPage'
import LogoutPage from '../../pageObjects/LogoutPage'
import AddContentPage from '../../pageObjects/AddContentPage'

describe('Add Content Test Suite', function() {
    
    const loginPage = new LoginPage()
    const logoutPage = new LogoutPage()
    const addContentPage = new AddContentPage()

    beforeEach(function(){
        loginPage.login("gayathri.pradeep","password123!")
    })

    it('Add Article Content 1', function() {
        addContentPage.addArticle("Press","Test Article Cypress","Cypress is description")
        addContentPage.deleteArticle()
     })

    it('Add Article Content 2', function() {
        addContentPage.addArticle("Ideas Made to Matter","Cypress Test Article ","Cypress is description")
        addContentPage.deleteArticle()
     })

    
    afterEach(function(){
        logoutPage.logout()
    })


})