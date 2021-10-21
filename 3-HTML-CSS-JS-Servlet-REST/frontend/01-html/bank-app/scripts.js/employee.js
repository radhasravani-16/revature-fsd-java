// let customers = [
//     {
//         firstName : "D",
//         lastName : "Sahith",
//         Email :" sahith@gmail.com",
//         PhoneNumber : 73467666678



//     },
//     {
//         firstName :"Drohini",
//         lastName :"Arshat",
//         Email :" drohinih@gmail.com",
//         PhoneNumber : 874783666678


//     },
//     {
//         firstName : "Hitman",
//         lastName :"Harsha",
//         Email :"hitmanh@gmail.com",
//         PhoneNumber : 7346236678

//     },
//     {
//         firstName : "Bablu",
//         lastName :"op",
//         Email :" oph@gmail.com",
//         PhoneNumber : 73757666678

//     },
//     {
//         firstName :"Xyz",
//         lastName : "Sunny",
//         Email :" xyzz@gmail.com",
//         PhoneNumber : 9877666678


//     }
// ];

(async function () {
    try {
      let response = await fetch("http://localhost:8080/bank-app-rest/employees");
      let customers = await response.json();
      let cust = "";
      for (let customer of customers) {
        console.log(customer.customerId);
        cust += ` <div class="col-sm-6">
        <div class="card card text-dark bg-light mb-3">
          <div class="card-body">
            <h5>${customer.firstName}${customer.lastName}</h5>
            <h5>email:${customer.email}</h5>
            <div class="card-footer">
            <a href="ecustomeracc.html?id=${customer.customerId}" class="btn btn-info">AccountList</a>
            </div>
          </div>
        </div>
      </div>`;
      }
      document.getElementById("detail").innerHTML = cust;
    } catch (err) {
  
    }
  })();
  
  
  // <table class="table table-striped table-dark">
  //   <thead>
  //     <tr>
  //       <th scope="col">First Name</th>
  //       <th scope="col">Last Name</th>
  //       <th scope="col">E mail</th>
  //       <th scope="col">Phone Number</th>
  //     </tr>
  //   </thead>
  //   <tbody>
  //     <tr>
  //       <th scope="row">1</th>
  //       <td> ${customer.firstName}</td>
  //       <td>${customer.lastName}</td>
  //       <td> ${customer.email}</td>
  //       <td>${customer.phoneNumber}</td>
  //     </tr>
      
  //     <tr>
  //       <th scope="row">3</th>
  //       <td> <a href="ecustomerAccounts.html" class="btn btn-primary">AccountList</a></td>
  //     </tr>
  //   </tbody>
  // </table>
  
  
  // `<div class="col-sm-4 "> 
  //     <div class="card text-white bg-dark mb-3">
  //       <div class="card-body">
  //         <h3> Name:  ${customer.firstName} ${customer.lastName}</h3>
  //         <h5>Email:  ${customer.email}</h5>
  //         <div class="badge badge-success">Phone Number: ${customer.phoneNumber}</div><br><br>
  //         <div class="card-footer">
           
  //           <a href="ecustomerAccounts.html" class="btn btn-primary">AccountList</a>
         
  //         </div>
  //       </div>
  //     </div>
  //   </div>`;