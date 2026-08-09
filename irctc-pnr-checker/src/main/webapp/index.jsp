<!DOCTYPE html>
<html>
<head>
    <title>IRCTC PNR Check</title>

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
            width: 400px;
            margin: 80px auto;
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
            color: #213d77;
            margin-bottom: 30px;
        }

        label {
            font-weight: bold;
            color: #333;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin-top: 8px;
            box-sizing: border-box;
            border: 1px solid #aaa;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #fb7921;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #e86610;
        }

        .footer {
            text-align: center;
            color: #777;
            font-size: 13px;
            margin-top: 30px;
        }
    </style>
</head>

<body>

    <div class="header">
        <h1>IRCTC</h1>
    </div>

    <div class="container">

        <h2>PNR Status Check</h2>

        <form action="pnrCheck" method="get">

            <label>PNR Number</label>
            <input type="text" name="pnrNumber"
                   placeholder="Enter 10 digit PNR number"
                   maxlength="10"
                   required>

            <br><br>

            <input type="submit" value="Check PNR">

        </form>

        <div class="footer">
            Indian Railway Catering and Tourism Corporation
        </div>

    </div>

</body>
</html>