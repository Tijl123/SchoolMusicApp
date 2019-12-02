import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule, MatButtonModule } from '@angular/material';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatButtonModule,
    MatToolbarModule,
  ],
  exports: [
    MatButtonModule,
    MatToolbarModule,
  ]
})
export class SharedModule { }
