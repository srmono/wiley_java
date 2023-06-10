//import {sayHello} from "./modeuleOne.js"; //regular export
// import Project from "./modeuleOne.js" //default export

//import * as test  from "./modeuleOne.js"; // import all with alias

import Project, {sayHello as hello } from "./modeuleOne.js";// alias

hello("Sachin")

//sayHello("venkat")