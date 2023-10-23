import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TabmenuComponent } from './tabmenu/tabmenu.component';
import { IonicModule } from '@ionic/angular';



@NgModule({
  declarations: [TabmenuComponent],
  imports: [
    CommonModule,
    IonicModule
  ],
  exports:[TabmenuComponent]
})
export class ComponetsModule { }
