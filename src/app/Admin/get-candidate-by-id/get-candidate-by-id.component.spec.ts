import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetCandidateByIdComponent } from './get-candidate-by-id.component';

describe('GetCandidateByIdComponent', () => {
  let component: GetCandidateByIdComponent;
  let fixture: ComponentFixture<GetCandidateByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetCandidateByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetCandidateByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
