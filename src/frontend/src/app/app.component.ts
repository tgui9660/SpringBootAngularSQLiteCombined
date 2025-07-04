import { Component, OnInit } from "@angular/core";
import { SystemService } from "./services/system.service";
import { Observable, map } from "rxjs";
import { CommonModule } from "@angular/common";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
  standalone: true,
  imports: [CommonModule],
})
export class AppComponent implements OnInit {
  
  public counter$!: Observable<string>;
  public version$!: Observable<string>;

  
  constructor(private systemService: SystemService) {}

  ngOnInit(): void {
    this.counter$ = this.systemService .getCounter() .pipe(map((value) => value.counter));
    this.version$ = this.systemService .getVersion() .pipe(map((value) => value.version));
  }
}
