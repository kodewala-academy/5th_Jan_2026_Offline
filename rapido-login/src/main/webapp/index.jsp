<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Login</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: Arial, sans-serif;
}

body{
    background:#FFD400;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    background:white;
    padding:50px;
    border-radius:20px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
    width:400px;
}

.logo{
    font-size:48px;
    margin-bottom:15px;
}

h2{
    color:#000;
    margin-bottom:10px;
    font-size:36px;
}

p{
    color:#555;
    margin-bottom:30px;
}

.login-btn{
    display:inline-block;
    text-decoration:none;
    background:#000;
    color:#FFD400;
    padding:15px 35px;
    border-radius:50px;
    font-size:18px;
    font-weight:bold;
    transition:0.3s;
}

.login-btn:hover{
    background:#222;
    transform:scale(1.05);
}
</style>

</head>

<body>

<div class="container">
    <div class="logo">🏍️</div>
    <h2>Rapido</h2>
    <p>India's Largest Bike Taxi Service</p>

    <a href="doLogin" class="login-btn">
        Login Now
    </a>
</div>

</body>
</html>