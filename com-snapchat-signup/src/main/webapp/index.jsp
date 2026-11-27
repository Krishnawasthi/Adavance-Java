
<!DOCTYPE html>
<html>
<head>
    <title>Snapchat Sign Up</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background: #FFFC00;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .signup-container {
            background: white;
            width: 380px;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.15);
        }

        h2 {
            text-align: center;
            font-size: 28px;
            color: #222;
            margin-bottom: 10px;
        }

        .subtitle {
            text-align: center;
            color: #777;
            margin-bottom: 30px;
        }

        .input-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
            color: #333;
        }

        input {
            width: 100%;
            padding: 13px;
            border: 1px solid #ddd;
            border-radius: 10px;
            font-size: 15px;
            outline: none;
            transition: 0.3s;
        }

        input:focus {
            border-color: #e5d900;
            box-shadow: 0 0 5px rgba(255,252,0,0.6);
        }

        button {
            width: 100%;
            padding: 14px;
            background: #FFFC00;
            color: #111;
            border: none;
            border-radius: 25px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }

        button:hover {
            background: #e8e500;
            transform: translateY(-2px);
        }

        .footer {
            text-align: center;
            margin-top: 20px;
            font-size: 13px;
            color: #777;
        }

    </style>
</head>

<body>

    <div class="signup-container">

        <h2>Create Account</h2>
        <p class="subtitle">Join Snapchat Today!</p>

        <form action="signup" method="post">

            <div class="input-group">
                <label>Email</label>
                <input type="email" name="email"
                       placeholder="Enter your email" required>
            </div>

            <div class="input-group">
                <label>User Name</label>
                <input type="text" name="userName"
                       placeholder="Choose a username" required>
            </div>

            <div class="input-group">
                <label>Mobile Number</label>
                <input type="tel" name="mobileNo"
                       placeholder="Enter mobile number" required>
            </div>

            <button type="submit">Create Account</button>

        </form>

        <p class="footer">
            Welcome to Snapchat!
        </p>

    </div>

</body>
</html>
