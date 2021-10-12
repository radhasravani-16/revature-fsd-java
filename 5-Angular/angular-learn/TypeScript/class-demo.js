import { Gender, someFunction, age } from "./gender.js";

var male = new Gender(1, "Male");
male.display();

var female = new Gender(2, "Female");
female.display();

console.log(someFunction());
console.log(age);