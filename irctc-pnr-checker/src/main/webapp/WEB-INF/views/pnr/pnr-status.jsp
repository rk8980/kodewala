<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
        content="width=device-width, initial-scale=1.0">

    <title>IRCTC | PNR Status</title>


    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }


        body {
            font-family: Arial, Helvetica, sans-serif;
            background: #eef2f7;
            color: #333;
        }


        /* ================= HEADER ================= */

        .header {
            background: linear-gradient(
                135deg,
                #172b63,
                #213d77,
                #2874b2
            );

            color: white;

            padding: 16px 7%;

            display: flex;

            justify-content: space-between;

            align-items: center;

            box-shadow:
                0 4px 15px rgba(0,0,0,0.2);
        }


        .logo {
            display: flex;

            align-items: center;

            gap: 12px;
        }


        .logo-icon {
            width: 48px;
            height: 48px;

            background: white;

            color: #213d77;

            border-radius: 50%;

            display: flex;

            align-items: center;

            justify-content: center;

            font-size: 25px;

            box-shadow:
                0 3px 10px rgba(0,0,0,0.2);
        }


        .logo-text h1 {
            font-size: 25px;

            letter-spacing: 1px;
        }


        .logo-text p {
            font-size: 11px;

            opacity: 0.85;

            margin-top: 3px;
        }


        .nav {
            display: flex;

            gap: 25px;
        }


        .nav a {
            color: white;

            text-decoration: none;

            font-size: 14px;

            font-weight: bold;

            transition: 0.3s;
        }


        .nav a:hover {
            color: #ffd54f;
        }


        /* ================= HERO ================= */

        .hero {
            background: linear-gradient(
                135deg,
                #213d77,
                #2874b2
            );

            color: white;

            text-align: center;

            padding: 45px 20px 80px;
        }


        .hero h2 {
            font-size: 32px;

            margin-bottom: 10px;
        }


        .hero p {
            font-size: 14px;

            opacity: 0.9;
        }


        /* ================= SEARCH ================= */

        .search-box {
            width: 90%;
            max-width: 700px;

            margin: -45px auto 30px;

            background: white;

            padding: 20px;

            border-radius: 12px;

            box-shadow:
                0 8px 30px rgba(0,0,0,0.15);

            display: flex;

            gap: 10px;
        }


        .search-box input {
            flex: 1;

            padding: 14px;

            border: 1px solid #ddd;

            border-radius: 7px;

            outline: none;

            font-size: 15px;
        }


        .search-box input:focus {
            border-color: #213d77;

            box-shadow:
                0 0 0 3px rgba(33,61,119,0.1);
        }


        .search-btn {
            border: none;

            background: #213d77;

            color: white;

            padding: 0 25px;

            border-radius: 7px;

            cursor: pointer;

            font-weight: bold;

            transition: 0.3s;
        }


        .search-btn:hover {
            background: #162b59;

            transform: translateY(-2px);
        }


        /* ================= MAIN ================= */

        .container {
            max-width: 1050px;

            margin: auto;

            padding: 0 20px 50px;
        }


        /* ================= PNR TOP CARD ================= */

        .pnr-card {
            background: white;

            border-radius: 14px;

            padding: 25px;

            box-shadow:
                0 5px 25px rgba(0,0,0,0.08);

            margin-bottom: 20px;
        }


        .pnr-top {
            display: flex;

            justify-content: space-between;

            align-items: center;

            padding-bottom: 20px;

            border-bottom: 1px solid #eee;
        }


        .pnr-label {
            color: #777;

            font-size: 12px;

            text-transform: uppercase;

            letter-spacing: 1px;
        }


        .pnr-number {
            color: #213d77;

            font-size: 24px;

            font-weight: bold;

            margin-top: 5px;
        }


        .status-badge {
            background: #fff3cd;

            color: #856404;

            padding: 10px 18px;

            border-radius: 30px;

            font-size: 13px;

            font-weight: bold;

            border: 1px solid #ffc107;
        }


        /* ================= TRAIN CARD ================= */

        .section-heading {
            color: #213d77;

            font-size: 18px;

            font-weight: bold;

            margin-bottom: 18px;
        }


        .train-card {
            margin-top: 22px;

            background: linear-gradient(
                135deg,
                #f7f9fc,
                #eef3fa
            );

            padding: 22px;

            border-radius: 10px;

            border-left: 5px solid #213d77;
        }


        .train-info {
            display: grid;

            grid-template-columns:
                repeat(3, 1fr);

            gap: 20px;
        }


        .info-item label {
            display: block;

            font-size: 11px;

            color: #888;

            text-transform: uppercase;

            margin-bottom: 6px;
        }


        .info-item strong {
            color: #213d77;

            font-size: 16px;
        }


        /* ================= JOURNEY ================= */

        .journey-card {
            background: white;

            margin-top: 20px;

            padding: 25px;

            border-radius: 14px;

            box-shadow:
                0 5px 25px rgba(0,0,0,0.08);
        }


        .journey {
            display: flex;

            align-items: center;

            justify-content: space-between;
        }


        .station {
            text-align: center;

            width: 150px;
        }


        .station-code {
            font-size: 25px;

            color: #213d77;

            font-weight: bold;
        }


        .station-name {
            font-size: 13px;

            color: #777;

            margin-top: 5px;
        }


        .station-time {
            font-size: 12px;

            color: #555;

            margin-top: 7px;
        }


        .journey-line {
            flex: 1;

            height: 4px;

            background: #213d77;

            margin: 0 20px;

            position: relative;

            border-radius: 10px;
        }


        .journey-train {
            position: absolute;

            left: 50%;

            top: 50%;

            transform:
                translate(-50%, -50%);

            background: white;

            padding: 8px;

            border-radius: 50%;

            font-size: 22px;
        }


        /* ================= STATUS ================= */

        .status-card {
            margin-top: 20px;

            background: white;

            padding: 25px;

            border-radius: 14px;

            box-shadow:
                0 5px 25px rgba(0,0,0,0.08);
        }


        .status-content {
            display: flex;

            gap: 25px;

            align-items: center;
        }


        .status-icon {
            width: 70px;

            height: 70px;

            background: #fff3cd;

            border: 1px solid #ffc107;

            border-radius: 50%;

            display: flex;

            align-items: center;

            justify-content: center;

            font-size: 30px;
        }


        .status-text small {
            color: #888;

            font-size: 12px;
        }


        .current-status {
            font-size: 32px;

            color: #d9534f;

            font-weight: bold;

            margin-top: 5px;
        }


        .status-description {
            color: #777;

            font-size: 13px;

            margin-top: 5px;
        }


        /* ================= PROGRESS ================= */

        .progress-section {
            margin-top: 25px;
        }


        .progress-header {
            display: flex;

            justify-content: space-between;

            font-size: 13px;

            color: #666;

            margin-bottom: 8px;
        }


        .progress {
            height: 10px;

            background: #e4e7eb;

            border-radius: 10px;

            overflow: hidden;
        }


        .progress-bar {
            width: 49%;

            height: 100%;

            background: linear-gradient(
                90deg,
                #d9534f,
                #f0ad4e
            );

            border-radius: 10px;
        }


        /* ================= PASSENGER ================= */

        .passenger-card {
            background: white;

            margin-top: 20px;

            padding: 25px;

            border-radius: 14px;

            box-shadow:
                0 5px 25px rgba(0,0,0,0.08);
        }


        .passenger {
            display: flex;

            align-items: center;

            justify-content: space-between;

            background: #f7f9fc;

            padding: 18px;

            border-radius: 9px;

            border: 1px solid #e8ebef;
        }


        .passenger-avatar {
            width: 45px;

            height: 45px;

            border-radius: 50%;

            background: #213d77;

            color: white;

            display: flex;

            align-items: center;

            justify-content: center;

            font-weight: bold;
        }


        .passenger-name {
            font-weight: bold;

            color: #213d77;
        }


        .passenger-details {
            color: #777;

            font-size: 12px;

            margin-top: 5px;
        }


        .booking-status {
            text-align: center;
        }


        .booking-status span {
            display: block;

            color: #888;

            font-size: 11px;

            margin-bottom: 5px;
        }


        .booking-status strong {
            color: #d9534f;
        }


        /* ================= INFORMATION ================= */

        .info-card {
            margin-top: 20px;

            background: #eaf2ff;

            border: 1px solid #c7dcff;

            padding: 20px;

            border-radius: 10px;
        }


        .info-card h3 {
            color: #213d77;

            font-size: 16px;

            margin-bottom: 10px;
        }


        .info-card p {
            font-size: 13px;

            color: #555;

            line-height: 1.6;
        }


        /* ================= BUTTONS ================= */

        .actions {
            display: flex;

            justify-content: center;

            gap: 12px;

            margin-top: 25px;
        }


        .btn {
            padding: 12px 22px;

            border-radius: 7px;

            border: none;

            cursor: pointer;

            text-decoration: none;

            font-size: 13px;

            font-weight: bold;

            transition: 0.3s;
        }


        .btn-primary {
            background: #213d77;

            color: white;
        }


        .btn-primary:hover {
            background: #162b59;

            transform: translateY(-2px);
        }


        .btn-light {
            background: white;

            color: #213d77;

            border: 1px solid #ddd;
        }


        .btn-light:hover {
            background: #f2f4f7;
        }


        /* ================= FOOTER ================= */

        .footer {
            background: #172b63;

            color: white;

            text-align: center;

            padding: 25px;

            font-size: 12px;
        }


        .footer p {
            margin-bottom: 10px;

            opacity: 0.9;
        }


        .footer a {
            color: white;

            text-decoration: none;

            margin: 0 10px;
        }


        /* ================= RESPONSIVE ================= */

        @media(max-width: 700px) {

            .header {
                padding: 15px 20px;
            }


            .nav {
                display: none;
            }


            .hero h2 {
                font-size: 25px;
            }


            .search-box {
                flex-direction: column;
            }


            .search-btn {
                padding: 13px;
            }


            .pnr-top {
                flex-direction: column;

                align-items: flex-start;

                gap: 15px;
            }


            .train-info {
                grid-template-columns: 1fr;
            }


            .journey {
                flex-direction: column;

                gap: 15px;
            }


            .journey-line {
                width: 4px;

                height: 60px;

                flex: none;

                margin: 0;
            }


            .journey-train {
                transform:
                    translate(-50%, -50%);
            }


            .passenger {
                flex-direction: column;

                align-items: flex-start;

                gap: 15px;
            }


            .status-content {
                flex-direction: column;

                align-items: flex-start;
            }


            .actions {
                flex-direction: column;
            }


            .btn {
                text-align: center;

                width: 100%;
            }

        }

    </style>

</head>


<body>


    <!-- ================= HEADER ================= -->

    <header class="header">

        <div class="logo">

            <div class="logo-icon">
                🚆
            </div>

            <div class="logo-text">

                <h1>IRCTC</h1>

                <p>
                    Indian Railway Catering & Tourism Corporation
                </p>

            </div>

        </div>


        <nav class="nav">

            <a href="#">Home</a>

            <a href="#">PNR Status</a>

            <a href="#">Train Schedule</a>

            <a href="#">Help</a>

        </nav>

    </header>



    <!-- ================= HERO ================= -->

    <section class="hero">

        <h2>PNR Status</h2>

        <p>
            Check your Indian Railway ticket booking status
        </p>

    </section>



    <!-- ================= SEARCH ================= -->

    <form action="pnrCheck" method="get" class="search-box">

        <input
            type="text"
            name="pnrNumber"
            placeholder="Enter 10 digit PNR Number"
            maxlength="10"
            required>

        <button
            type="submit"
            class="search-btn">

            🔍 Check PNR

        </button>

    </form>



    <!-- ================= MAIN ================= -->

    <main class="container">


        <!-- PNR CARD -->

        <div class="pnr-card">

            <div class="pnr-top">

                <div>

                    <div class="pnr-label">
                        PNR Number
                    </div>

                    <div class="pnr-number">
                        ${pnrNumber}
                    </div>

                </div>


                <div class="status-badge">
                    ⚠ WAITING LIST
                </div>

            </div>


            <!-- TRAIN -->

            <div class="train-card">

                <div class="section-heading">
                    🚆 Train Information
                </div>


                <div class="train-info">

                    <div class="info-item">

                        <label>Train Number</label>

                        <strong>
                            ${trainNumber}
                        </strong>

                    </div>


                    <div class="info-item">

                        <label>Train Name</label>

                        <strong>
                            ${trainName}
                        </strong>

                    </div>


                    <div class="info-item">

                        <label>Journey Date</label>

                        <strong>
                            ${journeyDate}
                        </strong>

                    </div>

                </div>

            </div>

        </div>



        <!-- ================= JOURNEY ================= -->

        <div class="journey-card">

            <div class="section-heading">
                📍 Journey Details
            </div>


            <div class="journey">


                <div class="station">

                    <div class="station-code">
                        ${fromStation}
                    </div>

                    <div class="station-name">
                        ${fromStationName}
                    </div>

                    <div class="station-time">
                        Boarding Station
                    </div>

                </div>


                <div class="journey-line">

                    <span class="journey-train">
                        🚆
                    </span>

                </div>


                <div class="station">

                    <div class="station-code">
                        ${toStation}
                    </div>

                    <div class="station-name">
                        ${toStationName}
                    </div>

                    <div class="station-time">
                        Destination
                    </div>

                </div>


            </div>

        </div>



        <!-- ================= STATUS ================= -->

        <div class="status-card">

            <div class="section-heading">
                🎫 Current Ticket Status
            </div>


            <div class="status-content">

                <div class="status-icon">
                    ⚠
                </div>


                <div class="status-text">

                    <small>
                        YOUR CURRENT STATUS
                    </small>

                    <div class="current-status">
                        ${currentStatus}
                    </div>

                    <div class="status-description">
                        Your ticket is currently in the
                        Waiting List.
                    </div>

                </div>

            </div>


            <div class="progress-section">

                <div class="progress-header">

                    <span>
                        Waiting List Progress
                    </span>

                    <span>
                        ${currentStatus}
                    </span>

                </div>


                <div class="progress">

                    <div class="progress-bar"></div>

                </div>

            </div>

        </div>



        <!-- ================= PASSENGER ================= -->

        <div class="passenger-card">

            <div class="section-heading">
                👤 Passenger Details
            </div>


            <div class="passenger">

                <div style="display:flex; gap:12px; align-items:center;">

                    <div class="passenger-avatar">
                        👤
                    </div>


                    <div>

                        <div class="passenger-name">
                            ${passengerName}
                        </div>

                        <div class="passenger-details">

                            Age: ${passengerAge}
                            &nbsp; | &nbsp;
                            Gender: ${passengerGender}

                        </div>

                    </div>

                </div>


                <div class="booking-status">

                    <span>
                        BOOKING STATUS
                    </span>

                    <strong>
                        ${bookingStatus}
                    </strong>

                </div>


                <div class="booking-status">

                    <span>
                        CURRENT STATUS
                    </span>

                    <strong>
                        ${currentStatus}
                    </strong>

                </div>

            </div>

        </div>



        <!-- ================= INFORMATION ================= -->

        <div class="info-card">

            <h3>
                ℹ Important Information
            </h3>

            <p>
                The current status displayed above is based on
                the latest available information. Railway
                reservation status may change before the
                preparation of the final reservation chart.
                Please check the PNR status again before your
                journey.
            </p>

        </div>



        <!-- ================= ACTION BUTTONS ================= -->

        <div class="actions">

            <a href="pnrCheck"
                class="btn btn-primary">

                🔄 Check Again

            </a>


            <button
                onclick="window.print()"
                class="btn btn-light">

                🖨 Print Status

            </button>


            <a href="#"
                class="btn btn-light">

                🏠 Back to Home

            </a>

        </div>


    </main>



    <!-- ================= FOOTER ================= -->

    <footer class="footer">

        <p>
            © 2026 IRCTC | Indian Railway Catering
            and Tourism Corporation
        </p>


        <div>

            <a href="#">
                Privacy Policy
            </a>

            <a href="#">
                Terms & Conditions
            </a>

            <a href="#">
                Contact Us
            </a>

        </div>

    </footer>


</body>

</html>