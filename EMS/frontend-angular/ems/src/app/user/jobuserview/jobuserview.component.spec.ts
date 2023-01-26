import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobuserviewComponent } from './jobuserview.component';

describe('JobuserviewComponent', () => {
  let component: JobuserviewComponent;
  let fixture: ComponentFixture<JobuserviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JobuserviewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JobuserviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
