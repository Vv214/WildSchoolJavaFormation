import { Component } from '@angular/core';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent {
  title: string;
  description: string;
  tickets: Array<any>

  constructor() {
    this.title = 'Nouveau ticket'
    this.description = 'Ecris une description .... '

    this.tickets = [
      { name: 'Ticket1', description: 'Tu dois faire ça ...' },
      { name: 'Ticket2', description: 'autre chose' },
      { name: 'Ticket3', description: 'Ne fait rien !! ' }
    ]
  }

  newTicket() {
    this.tickets.push({ name: this.title, description: this.description })
  }

  deleteTicket() {
    this.tickets.pop()
  }

  modifyMe() {
    this.description = this.description
  }
}
