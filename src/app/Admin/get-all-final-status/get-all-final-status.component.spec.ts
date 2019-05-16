import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetAllFinalStatusComponent } from './get-all-final-status.component';

describe('GetAllFinalStatusComponent', () => {
  let component: GetAllFinalStatusComponent;
  let fixture: ComponentFixture<GetAllFinalStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetAllFinalStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetAllFinalStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
