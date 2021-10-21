import { Gender } from "./gender.js";

let buyingPrice : number = 10;
let sellingPrice : number = 15;

let profit: number = sellingPrice - buyingPrice;

console.log("Profit: " + profit);

let male: Gender = new Gender("M", "Male");
male.display();

let cities = ["string", 10, true];

let scores: number[] = [10, 20, 30];
let x: [string, number] = ["string", 10];