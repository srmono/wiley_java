// Attach event
// event delegation 
// event capturing phase 
// event bubbling phase 
// stop propagation 
// stop immediate propagation 
// event target 
// event currentTarget
// prevent default


// function myfunc(){
//     alert("Hey I am an event");
// }

// var btn = document.getElementById("btn");

// btn.onclick = myfunc;

// Event Delegation
// Event handler
function parentCall(ev){
    //console.log("This is parent");
    console.log(ev.currentTarget)
}
function childCall(ev){
    //ev.stopPropagation();
    
    //console.log("This is child");
}

function childCall1(ev){
    console.log("This is child event 1");
}

function childCall2(ev){
    if(true){
        ev.stopImmediatePropagation()
    }
    console.log("This is child event 2");
}

function childCall3(ev){
    console.log("This is child event 3");
}

function anchorEvent(ev){
    ev.preventDefault();
    
    console.log("Event on anchor element");
}

var p1 = document.getElementById("parent1");
var p2 = document.getElementById("parent2");
var c1 = document.getElementById("child1");
var c2 = document.getElementById("child2");
var c = document.getElementById("child");
var anc = document.getElementById("anc");

anc.addEventListener("click", anchorEvent);

//p1.addEventListener("click", parentCall, true); enable capturing phase
p1.addEventListener("click", parentCall);
//c1.addEventListener("click", childCall)

p2.addEventListener("click", parentCall);
c2.addEventListener("click", childCall)

c.addEventListener("click", childCall1)
c.addEventListener("click", childCall2)
c.addEventListener("click", childCall3)


