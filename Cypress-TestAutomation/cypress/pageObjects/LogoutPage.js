// <reference types="cypress" />

class LogoutPage
{
    toolbarItemUser_btn()  { return cy.get("#toolbar-item-user")  }
    logout_btn()  { return cy.get("#toolbar-item-user-tray > nav > ul > li.logout > a")  }

    logout(){
        this.toolbarItemUser_btn().click()
        this.logout_btn().click()
        //this.toolbarItemUser_btn().should('not.exist');
        this.toolbarItemUser_btn().should('exist');
    }


}

export default LogoutPage