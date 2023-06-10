// class User{
//     constructor(name){
//         this.name =name
//     }

//     sayHi(){
//         console.log(this.name)
//     }
// }

// let userOne = new User("Venkat");

// userOne.sayHi()

// function User(name){
//     this.name = name;
// }

// User.prototype.sayHi = function(){ console.log(this.name)}

// let user = new User("wiley");

// user.sayHi()

// let User = class{
//     sayHi(){
//         alert("hello")
//     }
// }

// new User().sayHi();

//dynamically make classes

function createClass(info){
    return class {
        sayHI(){
            console.log(info)
        }
    }
}

let User = createClass("Wiley Edge");

new User().sayHI();
