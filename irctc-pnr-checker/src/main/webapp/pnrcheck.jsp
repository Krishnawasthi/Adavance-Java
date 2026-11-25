
<!DOCTYPE html>
<html>
<head>
    <title>IRCTC - PNR Check</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            min-height: 100vh;
            background: linear-gradient(135deg, #e8f0ff, #f5f7fa);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            width: 450px;
            background: white;
            padding: 40px;
            border-radius: 14px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.12);
            text-align: center;
        }

        .top-line {
            height: 5px;
            background: linear-gradient(to right, #ff9933, white, #138808);
            border-radius: 5px;
            margin-bottom: 30px;
        }

        h1 {
            color: #163b75;
            font-size: 32px;
            margin-bottom: 10px;
        }

        .welcome {
            color: #777;
            font-size: 15px;
            margin-bottom: 30px;
        }

        .divider {
            width: 60px;
            height: 3px;
            background: #ff9933;
            margin: 0 auto 25px;
            border-radius: 5px;
        }

        h2 {
            color: #333;
            font-size: 22px;
            margin-bottom: 15px;
        }

        .description {
            color: #777;
            font-size: 14px;
            line-height: 1.6;
            margin-bottom: 28px;
        }

        .pnr-btn {
            display: inline-block;
            background: #163b75;
            color: white;
            text-decoration: none;
            padding: 14px 35px;
            border-radius: 7px;
            font-size: 16px;
            font-weight: bold;
            transition: 0.3s;
        }

        .pnr-btn:hover {
            background: #0d2853;
            transform: translateY(-2px);
            box-shadow: 0 5px 12px rgba(22, 59, 117, 0.2);
        }

        .footer {
            margin-top: 35px;
            color: #999;
            font-size: 12px;
        }

    </style>
</head>

<body>

    <div class="container">

        <div class="top-line"></div>

        <h1>IRCTC</h1>

        <p class="welcome">
            Welcome to Indian Railways!
        </p>

        <div class="divider"></div>

        <h2>PNR Status Check</h2>

        <p class="description">
            Your account has been successfully created.
            You can now check your train reservation status.
        </p>

        <a href="checkPNR" class="pnr-btn">
            Check PNR Status
        </a>

        <div class="footer">
            Indian Railway Catering and Tourism Corporation
        </div>

    </div>

</body>
</html>
