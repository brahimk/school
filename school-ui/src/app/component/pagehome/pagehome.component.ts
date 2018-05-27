import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-bar-menu',
  templateUrl: './pagehome.component.html',
  styleUrls: ['./pagehome.component.css']
})
export class PagehomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  clickRechercher( val ) {
    console.log( 'Tu souhaites rechercher : ' + val.value);
    val.value = '';
  }
}
