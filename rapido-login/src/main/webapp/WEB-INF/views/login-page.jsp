<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
    min-height:100vh;
}

.login-container{
    background:#fff;
    width:420px;
    padding:40px;
    border-radius:20px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

.logo{
    text-align:center;
    font-size:45px;
    margin-bottom:10px;
}

h2{
    text-align:center;
    color:#000;
    margin-bottom:5px;
}

.subtitle{
    text-align:center;
    color:#666;
    margin-bottom:25px;
}

.form-group{
    margin-bottom:15px;
}

label{
    display:block;
    margin-bottom:5px;
    font-weight:bold;
    color:#333;
}

input{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:14px;
}

input:focus{
    outline:none;
    border-color:#FFD400;
}

.btn{
    width:100%;
    padding:14px;
    background:#000;
    color:#FFD400;
    border:none;
    border-radius:8px;
    font-size:16px;
    font-weight:bold;
    cursor:pointer;
    margin-top:10px;
}

.btn:hover{
    background:#222;
}

.note{
    text-align:center;
    color:#777;
    margin-top:15px;
    font-size:13px;
}
</style>

</head>
<body>

<div class="login-container">

    <div class="logo">🏍️</div>

    <h2>Rapido Login</h2>
    <p class="subtitle">Quick & Secure Login</p>

    <form action="validateLogin" method="post">

        <div class="form-group">
            <label>User Name</label>
            <input type="text" name="userName" placeholder="Enter your name">
        </div>

        <div class="form-group">
            <label>Mobile Number</label>
            <input type="text" name="mobile" placeholder="Enter mobile number">
        </div>

        <div class="form-group">
            <label>OTP</label>
            <input type="text" name="otp" placeholder="Enter OTP">
        </div>

        <button type="submit" class="btn">
            Login
        </button>

    </form>

    <p class="note">
        OTP based login will be implemented soon.
    </p>

</div>

</body>
</html>