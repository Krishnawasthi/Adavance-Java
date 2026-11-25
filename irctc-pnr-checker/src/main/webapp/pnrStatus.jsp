
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>IRCTC PNR Status</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/pnr.css">
</head>

<body>

    <div class="card">

        <div class="header">
            <h2>IRCTC</h2>
            <p>PNR Reservation Status</p>
        </div>

        <div class="content">

            <div class="status">
                ✓ CONFIRMED
            </div>

            <div class="detail">
                <span>PNR Number</span>
                <span class="value">1234567890</span>
            </div>

            <div class="detail">
                <span>Passenger Status</span>
                <span class="value">CNF</span>
            </div>

            <div class="detail">
                <span>Reservation Status</span>
                <span class="value">Confirmed</span>
            </div>

        </div>

        <div class="footer">
            Indian Railway Catering and Tourism Corporation
        </div>

    </div>

</body>
</html>
