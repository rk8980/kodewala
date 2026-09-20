<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <title>IRCTC PNR Check</title>

    <style>

        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #eef2f7, #dfe6f1);
            min-height: 100vh;
        }

        /* Header */
        .header {
            background: linear-gradient(90deg, #213d77, #1a2f5d);
            color: white;
            padding: 22px;
            text-align: center;
            box-shadow: 0 3px 8px rgba(0, 0, 0, 0.2);
        }

        .header h1 {
            margin: 0;
            font-size: 32px;
            letter-spacing: 2px;
        }

        .header p {
            margin: 6px 0 0;
            font-size: 14px;
            opacity: 0.9;
        }

        /* Main Card */
        .container {
            width: 420px;
            max-width: 90%;
            margin: 70px auto;
            background-color: white;
            padding: 35px;
            border-radius: 12px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.15);
        }

        /* Heading */
        .container h2 {
            text-align: center;
            color: #213d77;
            margin-top: 0;
            margin-bottom: 10px;
            font-size: 25px;
        }

        .subtitle {
            text-align: center;
            color: #777;
            font-size: 14px;
            margin-bottom: 30px;
        }

        /* Form */
        label {
            display: block;
            font-weight: bold;
            color: #333;
            margin-bottom: 8px;
        }

        input[type="text"] {
            width: 100%;
            padding: 13px 15px;
            border: 1px solid #bbb;
            border-radius: 6px;
            font-size: 16px;
            outline: none;
            transition: 0.3s;
        }

        input[type="text"]:focus {
            border-color: #213d77;
            box-shadow: 0 0 5px rgba(33, 61, 119, 0.3);
        }

        input[type="text"]::placeholder {
            color: #999;
        }

        /* Button */
        input[type="submit"] {
            width: 100%;
            padding: 13px;
            margin-top: 25px;
            background: linear-gradient(90deg, #fb7921, #e86610);
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 17px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: linear-gradient(90deg, #e86610, #d95708);
            transform: translateY(-2px);
            box-shadow: 0 5px 12px rgba(232, 102, 16, 0.3);
        }

        input[type="submit"]:active {
            transform: translateY(0);
        }

        /* Footer */
        .footer {
            text-align: center;
            color: #777;
            font-size: 12px;
            margin-top: 30px;
            padding-top: 15px;
            border-top: 1px solid #eee;
        }

        /* Mobile Responsive */
        @media (max-width: 500px) {

            .container {
                margin: 40px auto;
                padding: 25px;
            }

            .header h1 {
                font-size: 27px;
            }

            .container h2 {
                font-size: 22px;
            }
        }

    </style>

</head>

<body>

    <!-- Header -->
    <div class="header">

        <h1>IRCTC</h1>
        <p>Indian Railway Catering and Tourism Corporation</p>

    </div>


    <!-- PNR Form -->
    <div class="container">

        <h2>PNR Status Check</h2>

        <div class="subtitle">
            Check your railway ticket reservation status
        </div>

        <form action="pnrCheck" method="get">

            <label for="pnrNumber">
                PNR Number
            </label>

            <input
                type="text"
                id="pnrNumber"
                name="pnrNumber"
                placeholder="Enter 10 digit PNR number"
                maxlength="10"
                pattern="[0-9]{10}"
                title="Please enter a valid 10 digit PNR number"
                required
            >

            <input
                type="submit"
                value="Check PNR"
            >

        </form>


        <!-- Footer -->
        <div class="footer">
            © IRCTC | Indian Railways
        </div>

    </div>

</body>
</html>