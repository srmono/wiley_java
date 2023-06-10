console.log("Welcome to Wiley Edge");
// var name = "Venkat";
/** */

// var person = {
//     name: "venkat",
//     skills: ["java", "js", "angular"],
//     address: {
//         city: "bangalore"
//     },
//     getName: function(){
//         return this.name;
//     }
// }

var divEl = document.createElement("div");
document.body.appendChild(divEl);

var textNode = document.createTextNode("Wiley Edge");

divEl.appendChild(textNode);

divEl.setAttribute("id","data");

var message = "Welcome to Wiley Edge";
divEl.innerHTML = "<p>"+message+" </p>";