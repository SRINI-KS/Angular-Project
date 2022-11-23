import { Component, OnInit } from '@angular/core';
import { User } from '../classes/user';
import { LoginUserService } from '../services/login-user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User=new User()
  constructor(private loginuserservice:LoginUserService) { }

  ngOnInit(): void {
  }
  userLogin(){
    console.log(this.user)
    this.loginuserservice.loginUser(this.user).subscribe(data=>{
      alert('login successfully')
    },error=>alert(' sorry please enter correct userId password'));
    
    
  }

}
