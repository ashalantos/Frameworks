/// <reference types="cypress" />


class BaseTest
{
    email_tb()  { return cy.get("#edit-name")  }
    password_tb()  { return cy.get("#edit-pass")  }
    submit_btn()  { return cy.get("#edit-submit")  }
    invalidLoginErrorMsg()  { return cy.get(".c-status-message__text")  }
    toolbarItemUser()  { return cy.get("#toolbar-item-user")  }
    
    

}

export default LoginPage