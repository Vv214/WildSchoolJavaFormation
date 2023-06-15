import { Routes } from '@angular/router';
import { SignupComponent } from './component/signup/signup.component';
import { UserComponent } from './component/user/user.component';
import { MyFormComponent } from './component/my-form/my-form.component';


const ROUTES: Routes = [
    {
        path: '',
        component: UserComponent
    },
    {
        path: 'signup',
        component: SignupComponent
    },
    {
        path: 'user',
        component: UserComponent
    },
    {
        path: 'my-form',
        component: MyFormComponent
    }
]

export { ROUTES };