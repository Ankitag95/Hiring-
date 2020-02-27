import { TestBed } from '@angular/core/testing';

import { ProvidentService } from './provident.service';

describe('ProvidentService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProvidentService = TestBed.get(ProvidentService);
    expect(service).toBeTruthy();
  });
});
