<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>PNR Status</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .header {
            background-color: #213d77;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .header h1 {
            margin: 0;
            font-size: 28px;
        }

        .container {
            width: 450px;
            margin: 80px auto;
            background-color: white;
            padding: 35px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        h2 {
            color: #213d77;
            margin-bottom: 30px;
        }

        .status {
            background-color: #fff3cd;
            border: 1px solid #ffc107;
            color: #856404;
            padding: 18px;
            border-radius: 5px;
            font-size: 20px;
            font-weight: bold;
        }

        .status span {
            color: #d9534f;
        }

        .footer {
            margin-top: 30px;
            color: #777;
            font-size: 13px;
        }
    </style>
</head>

<body>

    <div class="header">
        <h1>IRCTC</h1>
    </div>

    <div class="container">

        <h2>PNR Status</h2>

        <div class="status">
            Your Current Status is :
            <span>WL-49</span>
        </div>

        <div class="footer">
            Indian Railway Catering and Tourism Corporation
        </div>

    </div>

</body>
</html>