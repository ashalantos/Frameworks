// ***********************************************************
// This example support/index.js is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

// Import commands.js using ES2015 syntax:
import './commands'

// Alternatively you can use CommonJS syntax:
// require('./commands')

//Import to add screenshots
import addContext from "mochawesome/addContext";

// Cypress.on("test:after:run", (test, runnable) => {
//     if (test.state === "failed") {
//       const screenshot=`cypress/screenshots/${Cypress.spec.name}/${runnable.parent.title} -- ${test.title} (failed).png`;
//   addContext({ test }, screenshot);
//     }
//   });

//   Cypress.on('test:after:run', (test, runnable ) => {
//     if (test.state === 'failed') {
//       let item = runnable
//       const nameParts = [runnable.title]
//       while (item.parent) {
//         nameParts.unshift(item.parent.title)
//         item = item.parent
//       }
//       if(runnable.hookName) {
//         nameParts.push(`${runnable.hookName} hook`)
//         }
//       const fullTestName = nameParts.filter(Boolean).join(' -- ')
//       const screenshotPath = `cypress/screenshots/${Cypress.spec.name}/${fullTestName} (failed).png`.replace("  "," ")

//       addContext({ test }, screenshotPath)
//     }
//     })

Cypress.on("test:after:run", (test, runnable) => {
    if (test.state === "failed") {
      const screenshot=`cypress/screenshots/${Cypress.spec.name}/${runnable.parent.title} -- ${test.title} (failed).png`;
  addContext({ test }, screenshot);
    }
  });