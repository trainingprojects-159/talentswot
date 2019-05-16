import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetFinalStatusByStatusComponent } from './get-final-status-by-status.component';

describe('GetFinalStatusByStatusComponent', () => {
  let component: GetFinalStatusByStatusComponent;
  let fixture: ComponentFixture<GetFinalStatusByStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetFinalStatusByStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetFinalStatusByStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
