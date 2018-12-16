import { Component, Input, OnInit, SimpleChanges, OnChanges } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { PatientService } from '../patient.service';

@Component({
  selector: 'app-patient-details',
  templateUrl: './patient-details.component.html',
  styleUrls: ['./patient-details.component.css']
})
export class PatientDetailsComponent implements OnInit, OnChanges {
  @Input()
  patientId: number;

  birthDate: string;
  gender: string;
  name: string;
  displayError: boolean = false;

  constructor(private patientService: PatientService) { }

  ngOnChanges(changes: SimpleChanges) {
    if (changes.patientId && changes.patientId.previousValue != changes.patientId.currentValue) {
      this.patientService.getPatient(changes.patientId.currentValue).subscribe( result => {
        if(!result) {
          this.displayError = true;
          return;
        }
        this.displayError = false;
        this.gender = result.gender;
        this.birthDate = result.birthDate;
        this.name = result.name.find( item => { return item.text; }).text;
      }, error => { this.displayError = true; })
    }
  }

  ngOnInit() {
  }

}
