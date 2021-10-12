let signup = document.getElementById("but");
let firstName = document.getElementById("fn");
let lastName = document.getElementById("ln");
let email = document.getElementById("email");
let password = document.getElementById("ps");
let form = document.forms[0];
let valid = true;


signup.addEventListener("click", function () {
  addCustomer();
});

async function addCustomer() {
  let employee = {
    firstName: firstName.value,
    lastName: lastName.value,
    email: email.value,
    password: password.value,
  };
  
  var options = {
    method: 'POST',
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(employee)
  };
  if (valid)


    try {
      let response = await fetch("http://localhost:8080/bank-app-rest/customers", options);
      //let data = await response.json();
      console.log("after getting data");
      console.log("after clearing form");
    } catch (err) {
    }
}
// signup.addEventListener("click", function () {

//   if (firstName.value == "") {
//     let firstNameError = document.getElementById("firstNameError");
//     firstNameError.innerText = "First name is required";
//     valid = false;
//   }

//   if (lastName.value == "") {
//     let last = document.getElementById("lastNameEror");
//     last.innerText = "Last name is required";
//     valid = false;
//   }
//   if (email.value == "") {
//     let mail = document.getElementById("emailValidation");
//     mail.innerText = "email is required";
//     valid = false;
//   }
//   if (password.value == "") {
//     let pass = document.getElementById("passwordValidation");
//     pass.innerText = "Password is required";
//     valid = false;
//   }

// });

// firstName.addEventListener("keyup", function () {

//   if (firstName.value != "" && firstName.value.length > 20) {
//     let firstNameError = document.getElementById("firstNameError");
//     firstNameError.innerText = "First Name cannot exceed 20 characters";
//     valid = false;
//     console.log(valid);
//   }

//   if (firstName.value != "" && firstName.value.length <= 20) {
//     let firstNameError = document.getElementById("firstNameError");
//     firstNameError.innerText = "";
//     valid = true;
//     console.log(valid);
//   }

//   if (firstName.value != "") {
//     let pattern = /^[A-Za-z]+$/;
//     // console.log(firstName.value.match(pattern));
//     if (!firstName.value.match(pattern)) {
//       let firstNameError = document.getElementById("firstNameError");
//       firstNameError.innerText = "Numbers not allowed";
//       valid = false;
//       console.log(valid);
//     }
//   }
// });

// lastName.addEventListener("keyup", function () {

//   if (lastName.value != "" && lastName.value.length > 20) {
//     let lastNameError = document.getElementById("lastNameEror");
//     lastNameError.innerText = "Last Name cannot exceed 20 characters";
//     valid = false;
//   }

//   if (lastName.value != "" && lastName.value.length <= 20) {
//     let lastNameError = document.getElementById("lastNameEror");
//     lastNameError.innerText = "";
//     valid = true;
//   }

//   if (lastName.value != "") {
//     let pattern = /^[A-Za-z]+$/;
//     // console.log(firstName.value.match(pattern));
//     if (!lastName.value.match(pattern)) {
//       let lastNameError = document.getElementById("lastNameEror");
//       lastNameError.innerText = "Numbers not allowed";
//       valid = false;
//     }
//   }
// });

// email.addEventListener("keyup", function () {
//   let emailError = document.getElementById("emailValidation");

//   if (email.value != "" && email.value.length > 50) {


//     emailError.innerText = "email not allowed";
//     valid = false;

//   }
//   if (email.value != "" && email.value.length <= 50) {
//     emailError.innerText = ""
//     valid = true;
//   }

//   if (email.value != "") {
//     let mail = /^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;
//     if (!email.value.match(mail)) {
//       emailError.innerText = "invalid Pattern"
//       valid = false;

//     }
//   }
// });

// password.addEventListener("keyup", function () {



//   if (password.value != "" && password.value.length > 15) {
//     let pass = document.getElementById("passwordValidation");
//     pass.innerText = "password can not exceed"
//     valid = false;

//   }
//   if (password.value != "" && password.value.length <= 15 && password.value.length >= 5) {
//     let pass = document.getElementById("passwordValidation");
//     pass.innerText = "";
//     valid = true;
//   }
//   if (password.value != "") {
//     let pw = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;
//     if (!password.value.match(pw)) {
//       let pass = document.getElementById("passwordValidation");
//       pass.innerText = "password can not exceed [7-15]character and use special character and numbers ";
//       valid = false;
//       console.log(valid);
//     }
//   }


// });