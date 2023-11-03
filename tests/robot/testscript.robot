*** Settings ***
Library               RequestsLibrary

*** Test Cases ***

Quick Get A JSON Body Test
    ${response}=    GET  https://startvmss.azurewebsites.net/
    Should Contain  ${response.text}  Function
