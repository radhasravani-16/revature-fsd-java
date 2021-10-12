"use strict";
exports.__esModule = true;
var gender_js_1 = require("./gender.js");
var buyingPrice = 10;
var sellingPrice = 15;
var profit = sellingPrice - buyingPrice;
console.log("Profit: " + profit);
var male = new gender_js_1.Gender("M", "Male");
male.display();
