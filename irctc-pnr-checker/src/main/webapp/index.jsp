
<!DOCTYPE html>
<html>
<head>
    <title>IRCTC - Sign Up</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background: linear-gradient(135deg, #e8f0ff, #f5f7fa);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .signup-container {
            width: 420px;
            background: white;
            padding: 35px;
            border-radius: 12px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.12);
        }

        .header {
            text-align: center;
            margin-bottom: 30px;
        }

        .header h2 {
            color: #163b75;
            font-size: 28px;
            margin-bottom: 8px;
        }

        .header p {
            color: #777;
            font-size: 14px;
        }

        .form-group {
            margin-bottom: 18px;
        }

        label {
            display: block;
            color: #333;
            font-weight: bold;
            margin-bottom: 8px;
            font-size: 14px;
        }

        input {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 14px;
            outline: none;
            transition: 0.3s;
        }

        input:focus {
            border-color: #163b75;
            box-shadow: 0 0 5px rgba(22, 59, 117, 0.2);
        }

        .submit-btn {
            width: 100%;
            padding: 13px;
            background: #163b75;
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            margin-top: 10px;
            transition: 0.3s;
        }

        .submit-btn:hover {
            background: #0d2853;
        }

        .footer {
            text-align: center;
            margin-top: 22px;
            font-size: 12px;
            color: #888;
        }

        .top-line {
            height: 5px;
            background: linear-gradient(to right, #ff9933, white, #138808);
            border-radius: 5px;
            margin-bottom: 25px;
        }

    </style>
</head>

<body>

    <div class="signup-container">

        <div class="top-line"></div>

        <div class="header">
            <h2>IRCTC</h2>
            <p>Create Your Account</p>
        </div>

        <form action="signUp" method="post">

            <div class="form-group">
                <label>First Name</label>
                <input type="text" name="firstName"
                       placeholder="Enter your first name" required>
            </div>

            <div class="form-group">
                <label>Last Name</label>
                <input type="text" name="lastName"
                       placeholder="Enter your last name" required>
            </div>

            <div class="form-group">
                <label>Email Address</label>
                <input type="email" name="email"
                       placeholder="Enter your email" required>
            </div>

            <div class="form-group">
                <label>User ID</label>
                <input type="text" name="userId"
                       placeholder="Choose your user ID" required>
            </div>

            <button type="submit" class="submit-btn">
                Create Account
            </button>

        </form>

        <div class="footer">
            Indian Railway Catering and Tourism Corporation
        </div>

    </div>

</body>
</html>
