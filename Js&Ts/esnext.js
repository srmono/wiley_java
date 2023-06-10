// let name = "venkat"; //block scope
// if(true){
//     let name = "wiley"
// }
// const message = "wiley";
// const skills = [];

//Arrow function
var fn = (fname, lname) =>  `Hey ${name} Welcome to Wiley Edge`

//
let tools = ["html", "css", "js", "cloud"];
// var a  = tools[0];
// var b  = tools[1];

let [a,b, ...c] = tools;

let person = {
    name: "Steve",
    age: "21",
    hobbies: ["tinder", "learning"]
}

for(k in person){
    console.log(person[k])
}

let {name, age } = person;

// rest and spread operator

function calcTotal(...prodPrices){
    console.log(prodPrices)
    var total = 0;

    for (let x of prodPrices) {

        total += x
    }
    return total
}

var numbers = [45,667,38,89,34]

Math.max(...numbers)

//

var fname = "venkat";
var old = 32;

let person1 = {fname, old}


