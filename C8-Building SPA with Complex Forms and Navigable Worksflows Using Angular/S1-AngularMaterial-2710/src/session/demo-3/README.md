### Demo-3 :: Style SPA using Angular Material Prebuilt-Themes

#### Implementation Steps

Refer to the following guidelines for modifying the solution code:

- The solution code used here, already contains Angular Material package installed. Re-run the command `ng add @angular/material` to include pre-built theme in the solution.
- Select `indigo-pink` pre-built theme for this demo.

1. HEADER
    - Apply the primary pallette of the theme to the color property of `<mat-toolbar>`
    - `.html`
        ```html
            <mat-toolbar color="primary" id="header">
                <!-- The code existing here does not need to be changed -->
            </mat-toolbar>
        ```
2. ADD FRUIT
    - Apply the primary pallette of the theme to the color property of the button in `Add-Fruit` component.
        ```html
             <button color="primary" mat-fab type="button" (click)="add()">
                <mat-icon>add</mat-icon>
            </button>
        ```

3. FRUIT CARD
    - Apply the warn pallette of the theme to the color property of the `like` button in `<mat-card-actions>` section of `<mat-card>`
    - Apply the accent pallette of the theme to the color property of the `delete` button in `<mat-card-actions>` section of `<mat-card>`
    - `.html`
        ```html
            <mat-card-actions>
                <button color="warn" mat-icon-button><mat-icon>favorite</mat-icon></button>
                <button color="accent" mat-icon-button><mat-icon>delete</mat-icon></button>
            </mat-card-actions>
        ```