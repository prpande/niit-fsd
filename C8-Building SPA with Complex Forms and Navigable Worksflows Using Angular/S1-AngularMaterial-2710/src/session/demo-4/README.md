### Demo-4 :: Design UI using Angular Material Schematics

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

- The solution code used here, already contains Angular Material package installed. 
- Run the command given below to include `navigation` schematics in the `fruit-fantasy` app.
    `ng generate @angular/material:navigation navigation-panel`
- Modify the template of `navigation-panel` component to 
    - remove the code not required at this stage.
    - include the existing components in the `Navigation-Panel` component.
1. NAVIGATION PANEL
    - `.html`
        ```html
            <mat-sidenav-container class="sidenav-container">
                <mat-sidenav #drawer class="sidenav" fixedInViewport [attr.role]="'navigation'" [mode]="'side'" [opened]="true">
                    <mat-nav-list>
                    <a mat-list-item href="#">Home</a>
                    <a mat-list-item href="#">Vendor Profile</a>
                    <a mat-list-item href="#">Settings</a>
                    </mat-nav-list>
                </mat-sidenav>
                <mat-sidenav-content>
                    <mat-toolbar color="primary">
                    <button type="button" aria-label="Toggle sidenav" mat-icon-button (click)="drawer.toggle()">
                        <mat-icon aria-label="Side nav toggle icon">menu</mat-icon>
                    </button>
                    <span><app-header></app-header></span>
                    </mat-toolbar>
                    
                    <app-fruit-manager></app-fruit-manager>
                </mat-sidenav-content>
                </mat-sidenav-container>
        ```
2. HEADER
    - Since the `navigation-panel` component already contains `<mat-toolbar>`, the `<mat-toolbar>` in `header` component can be replaced with `div` element.
    - `.html`
        ```html
            <div color="primary" id="header">
                <h2>Fruit Fantasy - Vendor View</h2>
                <div id="icons">
                    <mat-icon>home</mat-icon>
                    <mat-icon>settings</mat-icon>
                </div>
            </div>
        ```
    - To align the `header` component and its elements with the `navigation-panel`, CSS style needs to be modified.
    - `.css`
        ```css
            #header{
                display: flex;
                align-items: flex-end;
                justify-content: space-between; 
                width: 80vw;
            }
            #icons {
                position: absolute;
                right: 10px;
            }
            #icons > * {
                margin-right: 15px;
            }
        ```