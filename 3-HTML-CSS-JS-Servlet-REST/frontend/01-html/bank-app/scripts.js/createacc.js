let account= document.getElementById("accno");
let bal= document.getElementById("ps");
let form = document.getElementById("frm");
let create = document.getElementById("sub");
    


create.addEventListener("click",function(){
   
    addAccount();



});

async function addAccount() {
   


    let account = {
        accountNumber: form.accno.value,
        balance :form.ps.value,
    };
    

    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json"},
        body: JSON.stringify(account)
    };
    try {
        let response = await fetch("http://localhost:8080/bank-app-rest/accounts", options);

    } catch (err) {
    }
}





let account= document.getElementById("accno");
let bal= document.getElementById("ps");
let form = document.getElementById("frm");
let create = document.getElementById("sub");
    


create.addEventListener("click",function(){
   
    addAccount();



});

async function addAccount() {
   


    let account = {
        accountNumber: form.accno.value,
        balance :form.ps.value,
    };
    

    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json"},
        body: JSON.stringify(account)
    };
    try {
        let response = await fetch("http://localhost:8080/bank-app-rest/accounts", options);

    } catch (err) {
    }
}