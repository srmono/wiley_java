import { Component, OnInit, Input, Output, EventEmitter  } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  childMessage = "Hello parent"
  
  @Input() message = "";

  @Output() sendEvent = new EventEmitter<string>();

  constructor() { }


  sendMessage(){
    this.sendEvent.emit(this.childMessage)
  }

  // ngOnInit(): void {
  // }

}
