import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Patient } from './models/patient.model';
import { PatientCondition } from './models/patient-condition.model';
import { Observable } from 'rxjs/Observable';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private serviceUrl = "https://fhir-open.sandboxcerner.com/dstu2/0b8a0111-e8e6-4c26-a91c-5069cbc6b1ca";
  private pubMedBaseUrl = "https://www.ncbi.nlm.nih.gov/pubmed/?term=";

  constructor(private http: HttpClient) { }

  processData(data: any) {
    let conditions: PatientCondition[] = [];
    if (data.entry) {
      data.entry
        .forEach(item => {
          conditions.push({
            name: item.resource.code.text,
            dateRecorded: item.resource.dateRecorded,
            pubMedURL: this.pubMedBaseUrl + encodeURIComponent(item.resource.code.text),
            verificationStatus: item.resource.verificationStatus
          })
        });
    }
    return conditions;
  }

  getConditions(patientId: number): Observable<PatientCondition[]> {
    return this.http.get(this.serviceUrl + "/Condition?patient=" + patientId)
      .pipe(map((response) => { return this.processData(response); }));
  }

  getPatient(patientId: number): Observable<Patient> {
    return this.http.get<Patient>(this.serviceUrl + "/Patient/" + patientId);
  }
}
