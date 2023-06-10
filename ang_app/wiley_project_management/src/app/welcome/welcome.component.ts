import { Component } from "@angular/core";
import { STUDENTS } from "./mock-students";
import { Student } from "./students";

@Component({
    selector: "app-welcome",
//    template: `<h1> {{message}}</h1>`
    templateUrl: './welcome.component.html',
    styleUrls: ["./welcome.component.css"]
})

export class WelcomeComponent {
    message = "Welcome to WILEY EDGE"

    // students: Student = {
    //     id: 1,
    //     name: "venkat"
    // }

    students= STUDENTS;

    selectedStudent?: Student;

    onSelect(student:Student): void{
        this.selectedStudent = student;
    }
}