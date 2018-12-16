import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTableModule, MatSortModule } from '@angular/material';
import { FormsModule }   from '@angular/forms';

import { AppComponent } from './app.component';
import { PatientTableComponent } from './patient-table/patient-table.component';
import { PatientService } from './patient.service';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
@NgModule({
  declarations: [
    AppComponent,
    PatientTableComponent,
    PatientDetailsComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatTableModule,
    MatSortModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
