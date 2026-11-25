package com.irctc.pnr.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PNRController {
	

@GetMapping(value = "/checkPNR")
@ResponseBody
public String checkPNR() {

    System.out.println("PNRController.checkPNR()..........................");

    return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>IRCTC PNR Status</title>

            <style>
                body {
                    font-family: Arial, sans-serif;
                    background: #eef2f7;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    min-height: 100vh;
                    margin: 0;
                }

                .card {
                    width: 450px;
                    background: white;
                    border-radius: 12px;
                    box-shadow: 0 8px 25px rgba(0,0,0,0.12);
                    overflow: hidden;
                }

                .header {
                    background: #163b75;
                    color: white;
                    padding: 22px;
                    text-align: center;
                }

                .header h2 {
                    margin: 0;
                }

                .content {
                    padding: 25px;
                }

                .status {
                    background: #e5f8ed;
                    color: #138808;
                    padding: 12px;
                    text-align: center;
                    border-radius: 7px;
                    font-size: 18px;
                    font-weight: bold;
                    margin-bottom: 20px;
                }

                .detail {
                    display: flex;
                    justify-content: space-between;
                    padding: 14px 0;
                    border-bottom: 1px solid #eee;
                    color: #555;
                }

                .value {
                    color: #163b75;
                    font-weight: bold;
                }

                .footer {
                    text-align: center;
                    padding: 15px;
                    color: #888;
                    font-size: 12px;
                    background: #fafafa;
                }
            </style>
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
        """;
}

	
	
}
