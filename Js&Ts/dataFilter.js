const projects = [
    { name: "Project One",  category: "Ecom", start: 1981, end: 2004},
    { name: "Project Two", category: "Finance", start: 1991, end: 2014},
    { name: "Project Three", category: "Retail", start: 1999, end: 2012},
    { name: "Project Four", category: "Technology", start: 1989, end: 2010},
    { name: "Project Five", category: "Retail", start: 1999, end: 2019},
    { name: "Project Six", category: "Auto", start: 1980, end: 2006},
    { name: "Project Seven", category: "Ecom", start: 1986, end: 2009},
    { name: "Project Eight", category: "Finance", start: 2011, end: 2019},
    { name: "Project Nine", category: "Retail", start: 1971, end: 1989}
]

const grades = [23, 45, 78, 92, 34, 56, 98, 45, 68, 49];

//projects.forEach( proj => console.log(proj));

//let eligibleCandidates = grades.filter( grade => grade >= 60 );

const ecomProj = projects.filter(project => project.category === "Ecom")

//2000 to 2010

//const projDecade = projects.filter(proj => proj.start > 1980 && proj.start < 1990);

//const proj10 = projects.filter(proj => proj.end - proj.start >= 10)

let projName = projects.map( proj => proj.name)

let upgrade = grades.map(grade => grade + 5);

const srotedProjects = projects.sort( (p1, p2) => (p1.start > p2.start ? 1 : -1) )

const sortedGrades = grades.sort( (g1, g2) => g1 -g2)

const totalGrade = grades.reduce( (total, grade) =>  total + grade, 0 )

const totalSpent = projects.reduce(
    (total, project) => total + (project.end - project.start), 0
)
const promotions = grades
    .map(grade => grade + 5)
    .filter(grade => grade > 60)
    .sort((a,b) => b - a)