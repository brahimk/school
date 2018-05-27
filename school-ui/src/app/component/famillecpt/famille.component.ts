import { Component, OnInit } from '@angular/core';
import { SchoolService } from '../../service/school-service.service';
import { Famille } from '../../model/famille.model';

@Component({
  selector: 'app-famille',
  templateUrl: './famille.component.html',
  styleUrls: ['./famille.component.css']
})
export class FamilleComponent implements OnInit {

  constructor(private schooServ: SchoolService) { }

  ngOnInit() {
    const data = this.schooServ.getListFamilles().subscribe(
      data2 => {
        this.schooServ.dataFamilles = data2.content;
        console.log(data2.content);
      }
      );
  }

}
