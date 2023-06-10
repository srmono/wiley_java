let id: number = 9;
//id = "venkat";

let comapny: String = "Wiley Edge";
let isPblished: boolean = true;
let x: any = "Helloe";

let studentIds: number[] = [1,2,3,4,5,6,7,8,9]

studentIds.push(10);

// Tuple
let person: [number, String, boolean] = [1, "venkat", true]

//Tuple Array
let employees: [number, String][];

employees = [
    [1, 'Venkat'],
    [2, 'Shreyash'],
    [3, 'Rishav'],
    [4, 'Jahnavi']
]

//Union
let empId: string | number;

empId = "venkat";

//ENUM 

enum Directions {
    Up,
    Down, 
    Left, 
    Right 
}

let currentDirection = Directions.Up;

//custom types 
type Student = {
    id: number, 
    name: String,
    age?: number
}

const studentOne: Student = {
    id: 1,
    name: "sachin"
}

let sid: any = 1;
let eid = sid;

console.log(eid)
//---------------------------------------------------------------
//Function

function calcTotal(x: number, y: number): number{
    return x + y;
}

function sendMessage(message: string | number): void{
    console.log("My message")
}

interface StudentInterface{
    readonly id: number,
    name: string,
    age?: number
}

const student1: StudentInterface = {
    id: 1,
    name: "Venkat"
    
}

interface CalcFunc {
    (x: number, y:number): number
}

const add: CalcFunc = (x: number, y: number): number => x + y
const sub: CalcFunc = (x: number, y: number): number => x - y


interface PersonInterface {
    id: number
    name: string
    register(): string
}

class Person implements PersonInterface {
    id: number
    name: string

    constructor(id: number, name: string){
        this.id = id 
        this.name = name
    }

    register(): string {
        return `${this.name} is now registered with wiley`
    }
}

const venkat = new Person(1, "venkat");
const muskan = new Person(1, "muskan");

class Employee extends Person {
    position: string

    constructor(id: number, name: string, position: string){
        super(id, name)
        this.position = position
    }
}

const emp1 = new Employee(3, "Jahnavi", "Developer");

// Generics 

function getData<T>(items: T[]): T[] {
    return new Array().concat(items);
}


let numberData = getData<number>([1,2,3,4,5]);
let skills = getData<string>(["Java","Spring", "Angular", "cloud"])

