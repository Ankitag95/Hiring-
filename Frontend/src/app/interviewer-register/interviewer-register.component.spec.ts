import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InterviewerRegisterComponent } from './interviewer-register.component';

describe('InterviewerRegisterComponent', () => {
  let component: InterviewerRegisterComponent;
  let fixture: ComponentFixture<InterviewerRegisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InterviewerRegisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InterviewerRegisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
