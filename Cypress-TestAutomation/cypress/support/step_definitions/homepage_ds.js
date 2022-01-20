import { And, Given, Then, When } from "cypress-cucumber-preprocessor/steps";
import LoginPage from '../../pageObjects/LoginPage'

const loginPage = new LoginPage()

Given('I navigate to MIT website from homepage', ()=>{
    // cy.visit(Cypress.env('url'))
    cy.visit('/')
})