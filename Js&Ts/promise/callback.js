console.log("Starting")

function userLogin(username, pw, callback){
    setTimeout(() => {
        console.log("user logged in");
        callback( {uname: username} )
    }, 5000)
}
function getPojectsByUser(uname, callback){
    setTimeout(() => {
        console.log("Project are here");
        callback( ["proj1", "proj2", "proj3"])
    }, 5000)
}
function projDetails(proj, callback){
    setTimeout( () => {
        callback("Project details")
    }, 5000)
}

userLogin("venkat", "980808", (user) => {
    console.log(user);
    getPojectsByUser(user,projects => {
        console.log(projects);
        var proj = projects[0];
        projDetails(proj, details => {
            console.log(details)
        })
    })
})

//console.log(userinfo)