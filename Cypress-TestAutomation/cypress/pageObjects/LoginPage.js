// <reference types="cypress" />

class LoginPage
{
    email_tb()  { return cy.get("#edit-name")  }
    password_tb()  { return cy.get("#edit-pass")  }
    submit_btn()  { return cy.get("#edit-submit")  }
    invalidLoginErrorMsg()  { return cy.get(".c-status-message__text")  }
    toolbarItemUser()  { return cy.get("#toolbar-item-user")  }
    
    login(username,password){
        cy.visit('https://mitsloan.mit.edu/user/login')
        this.email_tb().type(username)
        this.password_tb().type(password)
        this.submit_btn().click()
    }



}

export default LoginPage