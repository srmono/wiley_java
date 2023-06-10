import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  message = "Hello child"
  
  receivedMessage = "";

  constructor() { }

  ngOnInit(): void {
  }

  receiveMessage(msg:any){
    this.receivedMessage = msg;
  }

}
