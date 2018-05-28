  import { Component, OnInit } from '@angular/core';
import { SchoolService } from '../../service/school-service.service';
import { Famille } from '../../model/famille.model';

@Component({
  selector: 'app-eleve',
  templateUrl: './eleve.component.html',
  styleUrls: ['./eleve.component.css']
})
export class EleveComponent implements OnInit {

  constructor(private schooServ: SchoolService) { }

  ngOnInit() {
    const data = this.schooServ.getListEleves().subscribe(
      data2 => {
        this.schooServ.dataEleves = data2.content;
        console.log(data2.content);
      }
    );
  }

}
