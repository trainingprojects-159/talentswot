import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ScheduleTechnicalInterviewComponent } from './schedule-technical-interview.component';

describe('ScheduleTechnicalInterviewComponent', () => {
  let component: ScheduleTechnicalInterviewComponent;
  let fixture: ComponentFixture<ScheduleTechnicalInterviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ScheduleTechnicalInterviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ScheduleTechnicalInterviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
