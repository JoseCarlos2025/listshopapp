import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-tabmenu',
  templateUrl: './tabmenu.component.html',
  styleUrls: ['./tabmenu.component.scss'],
})
export class TabmenuComponent {

  constructor(private router: Router) {}

  gotoadditem() {
    this.router.navigateByUrl("/additem")
  }

  gotolist() {
    this.router.navigateByUrl('/list');
  }

}