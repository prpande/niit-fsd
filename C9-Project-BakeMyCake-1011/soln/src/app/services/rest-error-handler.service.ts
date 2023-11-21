import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestErrorHandlerService {

  constructor() { }

  processFetchError(error: any) {
    this.processRestError("Unable to fetch data from server. Please try again later.", error);
  }

  processPostError(error: any){
    this.processRestError("Unable to post data to the server. Please try again later.", error);
  }

  private processRestError(message: string, error: any){
    alert(message);
    console.error(message);
    console.error(error);
  }
}
