import { Component, Input, OnInit, OnChanges, SimpleChanges, ViewChild } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { MatSort, MatSortable, MatTableDataSource } from '@angular/material';
import { PatientService } from '../patient.service';
import * as moment from 'moment';

@Component({
  selector: 'app-patient-table',
  templateUrl: './patient-table.component.html',
  styleUrls: ['./patient-table.component.css']
})
export class PatientTableComponent implements OnInit, OnChanges {
  @Input()
  patientId: number;

  @Input()
  displayVerifiedConditions: boolean;

  displayError: boolean = false;

  @ViewChild(MatSort) sort: MatSort;
  dataSource;
  displayedColumns = ['name', 'dateRecorded', 'pubMedURL'];
  verifiedConditions = ["confirmed", "provisional", "differential"];
  constructor(private patientService: PatientService) { }

  ngOnChanges(changes: SimpleChanges) {
    var patientId = this.patientId;
    var patientIdChanged = false;
    if (changes.patientId && changes.patientId.previousValue != changes.patientId.currentValue) {
      patientId = changes.patientId.currentValue;
      patientIdChanged = true;
    }
    var displayVerifiedConditions = this.displayVerifiedConditions;
    var displayVerifiedConditionsChanged = false;
    if (changes.displayVerifiedConditions && changes.displayVerifiedConditions.previousValue != changes.displayVerifiedConditions.currentValue) {
      displayVerifiedConditions = changes.displayVerifiedConditions.currentValue;
      displayVerifiedConditionsChanged = true;
    }
    if (displayVerifiedConditionsChanged || patientIdChanged) {
      this.patientService.getConditions(patientId).subscribe( results => {
        if(!results) {
          this.displayError = true;
          return;
        }
        if (displayVerifiedConditions) {
          results = results.filter(item => this.verifiedConditions.indexOf(item.verificationStatus) != -1)
        }
        if(results.length == 0) {
          this.displayError = true;
          return;
        }
        this.displayError = false;
        this.dataSource = new MatTableDataSource(results);
        this.dataSource.sort = this.sort;
        this.dataSource.sortingDataAccessor = (item, property) => {
          switch (property) {
            case 'dateRecorded': return moment(item.dateRecorded).format('YYYY-MM-DD');
            default: return item[property];
          }
        };
      }, error => { this.displayError = true; })
    }
  }

  ngOnInit() {
  }

}
