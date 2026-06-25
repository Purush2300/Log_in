function login(){

    let username =
        document.getElementById("username").value;

    let password =
        document.getElementById("password").value;

    console.log(username);
    console.log(password);

    document.getElementById("message")
        .innerText = "Login Button Clicked";
}