import { Component } from '@angular/core';
import { PatientService } from './patient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SmartFHIR';
  submittedPatientId: number = 2744010;
  patientId: number = 2744010;
  displayVerifiedConditions: boolean = true;
  submittedDisplayVerifiedConditions: boolean = true;

  onSubmit() {
    this.submittedPatientId = this.patientId
    this.submittedDisplayVerifiedConditions = this.displayVerifiedConditions;
  }
}
