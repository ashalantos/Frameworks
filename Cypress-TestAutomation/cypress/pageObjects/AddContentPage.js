// <reference types="cypress" />

class AddContentPage
{
    siteSection_dropdown()  { return cy.get("#edit-field-site-section")  }
    title_tb()  { return cy.get("#edit-title-0-value")  }
    description_tb()  { return cy.get("#edit-field-short-description-0-value")  }
    save_btn()  { return cy.get("#edit-submit")  }
    saveAs_dropdown()  { return cy.get("#edit-moderation-state-0-state")  }
    articeltitle_label()  { return cy.get("#edit-title-wrapper > div > label")  }
    status_msg() {return cy.get("body > div.dialog-off-canvas-main-canvas > div > main > div.region.region-content > div:nth-child(4) > div.messages.messages--status > em > a")}
    addContent_btn()  { return cy.get("#block-mit-admin-primaryadminactions > ul > li > a")  }
    createArticle_btn()  { return cy.get("#block-mit-admin-mainpagecontent > ul > li:nth-child(1) > a > span")  }

    addArticle(siteSection,articleTitle,description){
        this.addContent_btn().click({force:true})
        this.createArticle_btn().click({force: true})
        this.siteSection_dropdown().select(siteSection, {force: true})
        this.title_tb().type(articleTitle,{force: true})
        this.description_tb().type(description,{force: true})
        this.save_btn().click({force: true})
        this.status_msg().contains(articleTitle,{force: true})
    }

    deleteArticle(){
        cy.get("#views-form-moderated-content-main > table > tbody > tr:nth-child(1) > td.views-field.views-field-operations > div > div > ul > li.edit.dropbutton-action > a").click({force: true})
        cy.get("#edit-delete").click({force: true})
        cy.get("#edit-submit").click({force: true})
        cy.get("body > div.dialog-off-canvas-main-canvas > div > main > div.region.region-content > div:nth-child(4) > div.messages.messages--status").contains("deleted")
    }

}

export default AddContentPage