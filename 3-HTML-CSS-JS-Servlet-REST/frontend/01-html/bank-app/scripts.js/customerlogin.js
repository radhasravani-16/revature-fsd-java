let email= document.getElementById("email");
let pass = document.getElementById("password");
let form = document.getElementById("frm");
let login = document.getElementById("sub");



async function loginCustomer(){

try {
    let response = await fetch("http://localhost:8080/bank-app-rest/customers/"+email.value+"/"+pass.value);
     if(response.status == "401"){
         alert(" login failed");
         console.log("defvr");
     }
     if(response.status == 200){
        alert(" login successfull");
         //display
     }
     if(response.status == "500"){
        alert(" error");
         //display
     }
     

} catch (err) {

}
}
login.addEventListener("click",function(){
    
     loginCustomer();

});