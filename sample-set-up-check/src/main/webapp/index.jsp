<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date, java.util.TimeZone, java.text.SimpleDateFormat" %>
<%
    Date now = new Date();
    SimpleDateFormat dayFormat  = new SimpleDateFormat("EEEE");
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    TimeZone tz = TimeZone.getTimeZone("Asia/Kolkata");
    dayFormat.setTimeZone(tz);
    dateFormat.setTimeZone(tz);
    timeFormat.setTimeZone(tz);
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Hello World | Date &amp; Time</title>
<style>
  * { box-sizing: border-box; margin: 0; padding: 0; }
  body { font-family: "Amazon Ember", Arial, Helvetica, sans-serif; background: #EAEDED; color: #0F1111; }
  a { color: inherit; text-decoration: none; }

  /* Top bar */
  .navbar { background: #131921; color: #fff; display: flex; align-items: center; gap: 16px; padding: 8px 16px; }
  .logo { font-size: 24px; font-weight: 700; padding: 6px 8px; border: 1px solid transparent; }
  .logo span { color: #FF9900; }
  .logo:hover, .nav-item:hover { border-color: #fff; border-radius: 2px; }
  .search { flex: 1; display: flex; height: 40px; }
  .search input { flex: 1; border: none; border-radius: 4px 0 0 4px; padding: 0 12px; font-size: 15px; }
  .search button { width: 46px; border: none; background: #FEBD69; border-radius: 0 4px 4px 0; font-size: 18px; cursor: pointer; }
  .search button:hover { background: #F3A847; }
  .nav-item { font-size: 12px; line-height: 1.3; padding: 6px 8px; border: 1px solid transparent; white-space: nowrap; }
  .nav-item b { font-size: 14px; display: block; }

  /* Sub bar */
  .subnav { background: #232F3E; color: #fff; display: flex; gap: 4px; padding: 0 12px; font-size: 14px; overflow-x: auto; }
  .subnav a { padding: 10px 8px; border: 1px solid transparent; white-space: nowrap; }
  .subnav a:hover { border-color: #fff; }

  /* Hero */
  .hero { background: linear-gradient(180deg, #37475A 0%, #EAEDED 100%); padding: 48px 16px 120px; text-align: center; color: #fff; }
  .hero h2 { font-size: 34px; font-weight: 500; }
  .hero p { margin-top: 8px; font-size: 16px; opacity: .9; }

  /* Cards */
  .container { max-width: 1100px; margin: -90px auto 40px; padding: 0 16px; display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 16px; }
  .card { background: #fff; padding: 20px; border-radius: 4px; box-shadow: 0 2px 5px rgba(15,17,17,.15); }
  .card h3 { font-size: 21px; font-weight: 700; margin-bottom: 12px; }
  .value { font-size: 32px; font-weight: 400; color: #0F1111; }
  .label { font-size: 13px; color: #565959; margin-top: 4px; }
  .badge { display: inline-block; background: #CC0C39; color: #fff; font-size: 12px; font-weight: 700; padding: 2px 8px; border-radius: 2px; margin-bottom: 10px; }
  .btn { display: inline-block; margin-top: 16px; padding: 8px 18px; background: #FFD814; border: 1px solid #FCD200; border-radius: 20px; font-size: 14px; cursor: pointer; }
  .btn:hover { background: #F7CA00; }
  .link { color: #007185; font-size: 14px; display: inline-block; margin-top: 12px; }
  .link:hover { color: #C7511F; text-decoration: underline; }

  /* Footer */
  .backtop { background: #37475A; color: #fff; text-align: center; padding: 14px; font-size: 13px; cursor: pointer; }
  .backtop:hover { background: #485769; }
  footer { background: #232F3E; color: #DDD; text-align: center; padding: 24px 16px; font-size: 12px; }
  footer .logo { display: inline-block; font-size: 20px; color: #fff; }

  @media (max-width: 640px) { .nav-item { display: none; } .hero h2 { font-size: 26px; } }
</style>
</head>
<body>

<header class="navbar">
  <a class="logo" href="#">shop<span>.</span>app</a>
  <div class="nav-item">Deliver to<b>Bengaluru 560001</b></div>
  <form class="search" onsubmit="return false;">
    <input type="text" placeholder="Search products, brands and more">
    <button type="button" aria-label="Search">&#128269;</button>
  </form>
  <a class="nav-item" href="#">Hello, sign in<b>Account &amp; Lists</b></a>
  <a class="nav-item" href="#">Returns<b>&amp; Orders</b></a>
  <a class="nav-item" href="#"><b>&#128722; Cart</b></a>
</header>

<nav class="subnav">
  <a href="#">&#9776; All</a>
  <a href="#">Today's Deals</a>
  <a href="#">Customer Service</a>
  <a href="#">Registry</a>
  <a href="#">Gift Cards</a>
  <a href="#">Sell</a>
</nav>

<section class="hero">
  <h2>Hello World!</h2>
  <p>Welcome back. Here is today's date and time.</p>
</section>

<main class="container">
  <div class="card">
    <span class="badge">TODAY</span>
    <h3>Date</h3>
    <div class="value"><%= dateFormat.format(now) %></div>
    <div class="label"><%= dayFormat.format(now) %></div>
    <a class="link" href="#">View calendar</a>
  </div>

  <div class="card">
    <span class="badge">LIVE</span>
    <h3>Time</h3>
    <div class="value"><%= timeFormat.format(now) %></div>
    <div class="label">Server time when this page was loaded (IST)</div>
    <a class="btn" href="">Refresh time</a>
  </div>

  <div class="card">
    <h3>Delivery slot</h3>
    <div class="value">Tomorrow</div>
    <div class="label">Order within the next few hours for fastest delivery.</div>
    <a class="link" href="#">See all delivery options</a>
  </div>
</main>

<div class="backtop" onclick="window.scrollTo({top:0,behavior:'smooth'})">Back to top</div>
<footer>
  <a class="logo" href="#">shop<span>.</span>app</a>
  <p style="margin-top:8px;">&copy; <%= new SimpleDateFormat("yyyy").format(now) %>, shop.app. All rights reserved.</p>
</footer>

</body>
</html>
