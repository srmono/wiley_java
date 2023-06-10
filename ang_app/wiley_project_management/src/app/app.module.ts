import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppRoutingModule } from './app-routing.module';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import {WelcomeComponent} from './welcome/welcome.component';
import { ProductsComponent } from './products/products.component';
import { ProductDetailsComponent } from './products/product-details/product-details.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { AboutComponent } from './components/about/about.component';
import { TasksComponent } from './components/tasks/tasks.component';
import { TaskItemComponent } from './components/task-item/task-item.component';
import { AddTaskComponent } from './components/add-task/add-task.component';
import { ButtonComponent } from './components/button/button.component';

const appRoutes: Routes = [
  {path:'', component: TasksComponent},
  {path:'about', component: AboutComponent},
]

// const appRoutes: Routes = [
//   {path:'', component: WelcomeComponent},
//   {path: 'welcome', redirectTo:'welcome', pathMatch:'full'},
//   //{path: 'products', component: ProductsComponent}
// //  {path: '**', component: PageNotFoundComponent},
// ]

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ProductsComponent,
    ProductDetailsComponent,
    HeaderComponent,
    FooterComponent,
    ParentComponent,
    ChildComponent,
    AboutComponent,
    TasksComponent,
    TaskItemComponent,
    AddTaskComponent,
    ButtonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
     AppRoutingModule,
     FontAwesomeModule,
     RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
