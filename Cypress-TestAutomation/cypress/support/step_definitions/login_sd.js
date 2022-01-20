/// <reference types="cypress" />

import { And, Given, Then, When } from "cypress-cucumber-preprocessor/steps";
import LoginPage from '../../pageObjects/LoginPage'

const loginPage = new LoginPage()

Given('I navigate to MIT website', ()=>{
    // cy.visit(Cypress.env('url'))
    cy.visit('/')
})

When('I type in {string} and {string}', (username,password)=>{
    loginPage.email_tb().type(username)
    loginPage.password_tb().type(password)
})

When('I type in credentials', ()=>{
    loginPage.email_tb().type(username)
    loginPage.password_tb().type(password)
})

When('I type in below', (datatable)=>{
    datatable.hashes().forEach(element => {
        loginPage.email_tb().type(element.username)
        loginPage.password_tb().type(element.password)
    })
})

And('I click on login button', ()=>{
    loginPage.submit_btn().click()
})

Then('Homepage is displayed', ()=>{
    loginPage.toolbarItemUser().should('be.visible');
})