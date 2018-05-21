import { Component, OnInit } from '@angular/core';
import { SchoolService } from '../../service/school-service.service';

@Component({
  selector: 'app-affichage',
  templateUrl: './affichage.component.html',
  styleUrls: ['./affichage.component.css']
})
export class AffichageComponent implements OnInit {

  constructor(private schooServ: SchoolService) { }

  ngOnInit() {
    debugger;
    const data = this.schooServ.getListEleves();
    console.log(data);
  }

}
