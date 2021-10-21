(async function () {
  try {
    let response = await fetch("http://localhost:8080/bank-app-rest/accounts");
    let accounts = await response.json();
    var acc = "";
    for (let account of accounts) {
      acc += ` <div class="col-sm-6">
    <div class="card card text-dark bg-light mb-3">
      <div class="card-body">
        <h5>Account Number : ${account.accountNumber}</h5>
        <h5>balance:${account.balance}</h5>
        <div class="card-footer">
          <a href="WithDraw.html?id=${account.accountNumber}"class="btn btn-info">WithDraw</a>
          <a href="Deposit.html?id=${account.accountNumber}" class="btn btn-info">Deposit</a>
          <a href="TransactionList.html?id=${account.id}" class="btn btn-info">TransactionList</a>
        </div>
      </div>
    </div>
  </div>`;
    }
    document.getElementById("account").innerHTML = acc;
  } catch (err) {

  }
})();
