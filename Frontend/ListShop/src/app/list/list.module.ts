import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

import { ListPageRoutingModule } from './list-routing.module';

import { ListPage } from './list.page';
import { ComponetsModule } from '../components/componets.module';

@NgModule({
  imports: [
    CommonModule,
    ComponetsModule,
    FormsModule,
    IonicModule,
    ListPageRoutingModule,
  ],
  declarations: [ListPage]
})
export class ListPageModule {}
