import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletecandidateComponent } from './deletecandidate.component';

describe('DeletecandidateComponent', () => {
  let component: DeletecandidateComponent;
  let fixture: ComponentFixture<DeletecandidateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeletecandidateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeletecandidateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
