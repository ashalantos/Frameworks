


// const report = require.resolve('multiple-cucumber-html-reporter');


const report = require('multiple-cucumber-html-reporter');
report.generate({
        jsonDir: "cypress/cucumber/cucumber-json",  // ** Path of .json file **//
        reportPath: "./cypress/cucumber/cucumber-reports/cucumber-htmlreport.html"

});