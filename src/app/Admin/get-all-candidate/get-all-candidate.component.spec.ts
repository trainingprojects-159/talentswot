import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetAllCandidateComponent } from './get-all-candidate.component';

describe('GetAllCandidateComponent', () => {
  let component: GetAllCandidateComponent;
  let fixture: ComponentFixture<GetAllCandidateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetAllCandidateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetAllCandidateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
