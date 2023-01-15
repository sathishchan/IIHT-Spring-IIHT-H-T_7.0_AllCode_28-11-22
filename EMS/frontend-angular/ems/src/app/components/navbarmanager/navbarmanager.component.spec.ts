import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarmanagerComponent } from './navbarmanager.component';

describe('NavbarmanagerComponent', () => {
  let component: NavbarmanagerComponent;
  let fixture: ComponentFixture<NavbarmanagerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NavbarmanagerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbarmanagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
