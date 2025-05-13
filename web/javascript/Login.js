const formAccount = document.getElementsByClassName("form-account")[0]
const Login = document.getElementsByClassName("login")[0]


formAccount.addEventListener("click", ()=>{
    if(Login.classList.contains("login-after")){
        Login.classList.remove("login-after")
    }
    else{
        Login.classList.add("login-after")
    }
})