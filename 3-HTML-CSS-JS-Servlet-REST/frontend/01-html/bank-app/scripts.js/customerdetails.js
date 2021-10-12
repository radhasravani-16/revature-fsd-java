let customers = [
    {
        firstName : "R",
        lastName : "john",
        Email :" 123@gmail.com",
        PhoneNumber : 9876543210



    },
    {
        firstName :"S",
        lastName :"Sam",
        Email :" 321@gmail.com",
        PhoneNumber : 8976543210


    },
    {
        firstName : "E",
        lastName :"Jeo",
        Email :"789@gmail.com",
        PhoneNumber : 7986543210

    },
    {
        firstName : "K",
        lastName :"Raju",
        Email :" 987@gmail.com",
        PhoneNumber : 6987543210

    },
    {
        firstName :"D",
        lastName : "Ram",
        Email :" xyz@gmail.com",
        PhoneNumber : 6498753210


    }
    



];

var cust = "";
for (let customer of customers) {
    cust += `<div class="col-sm-4 "> 
    <div class="card text-white bg-dark mb-3">
      <div class="card-body">
        <h3> Name:  ${customer.firstName} ${customer.lastName}</h3>
        <h5>Email:  ${customer.Email}</h5>
        <div class="badge badge-success">Phone Number: ${customer.PhoneNumber}</div><br><br>
        <div class="card-footer">
         
          <a href="ecustomerAccounts.html" class="btn btn-primary">AccountList</a>
       
        </div>
      </div>
    </div>
  </div>`;
}
document.getElementById("detail").innerHTML = cust;