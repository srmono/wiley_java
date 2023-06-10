"use strict";
let id = 9;
//id = "venkat";
let comapny = "Wiley Edge";
let isPblished = true;
let x = "Helloe";
let studentIds = [1, 2, 3, 4, 5, 6, 7, 8, 9];
studentIds.push(10);
// Tuple
let person = [1, "venkat", true];
//Tuple Array
let employees;
employees = [
    [1, 'Venkat'],
    [2, 'Shreyash'],
    [3, 'Rishav'],
    [4, 'Jahnavi']
];
//Union
let empId;
empId = "venkat";
//ENUM 
var Directions;
(function (Directions) {
    Directions[Directions["Up"] = 0] = "Up";
    Directions[Directions["Down"] = 1] = "Down";
    Directions[Directions["Left"] = 2] = "Left";
    Directions[Directions["Right"] = 3] = "Right";
})(Directions || (Directions = {}));
let currentDirection = Directions.Up;
const studentOne = {
    id: 1,
    name: "sachin"
};
let sid = 1;
let eid = sid;
console.log(eid);
//---------------------------------------------------------------
//Function
function calcTotal(x, y) {
    return x + y;
}
function sendMessage(message) {
    console.log("My message");
}
const student1 = {
    id: 1,
    name: "Venkat"
};
const add = (x, y) => x + y;
const sub = (x, y) => x - y;
class Person {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    register() {
        return `${this.name} is now registered with wiley`;
    }
}
const venkat = new Person(1, "venkat");
const muskan = new Person(1, "muskan");
class Employee extends Person {
    constructor(id, name, position) {
        super(id, name);
        this.position = position;
    }
}
const emp1 = new Employee(3, "Jahnavi", "Developer");
// Generics 
function getData(items) {
    return new Array().concat(items);
}
let numberData = getData([1, 2, 3, 4, 5]);
let skills = getData(["Java", "Spring", "Angular", "cloud"]);
