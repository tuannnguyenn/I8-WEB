<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.css">
    <link rel="stylesheet" href="./views/fonts/fontawesome-free-6.1.1-web/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/base.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
</head>
<body>
    <div class="app">
        <!-- Header Navbar -->
        <div class="header">
            <nav class="header__navbar">
                <ul class="header__navbar-list">
                    <li><a href="" class="header__navbar-item header__navbar-home ">home</a></li>
                    <li><a href="" class="header__navbar-item header__navbar-band">band</a></li>
                    <li><a href="" class="header__navbar-item header__navbar-tour">tour</a></li>
                    <li><a href="" class="header__navbar-item header__navbar-contact">contact</a></li>
                    <li class="header__navbar-item header__navbar-more">
                        more
                        <i class="fa fa-caret-down"></i>
                        <ul class="more__list">
                            <li><a href="" class=" more__item">Merchandise</a></li>
                            <li><a href="" class=" more__item">Extras</a></li>
                            <li><a href="" class=" more__item">Media</a></li>
                        </ul>
                    </li>  
                    </ul class="header__navbar-list">
                        <a href="" class="header__navbar-item header__navbar--icon-search">
                            <i class="fa-solid fa-magnifying-glass"></i>
                        </a>
                    </ul>
            </nav>
        </div>    
        <!--Slider-->
        <div class="slider">
            <img src="/assets/imgs/img-slider.jpg" alt="">
            <div class="slider__text">
               <p>Chicago</p> 
               <p>Thank you, Chicago - A night we won't forget.</p> 
            </div>
        </div>
        <!-- The Band -->
        <div class="the-band">
            <p class="the-band__heading">The Band</p>
            <h3 class="the-band__description">We love music</h3>
            <p class="the-band__paragraph">We have created a fictional band website. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            <ul class="the-band__img-list">
                <li class="the-band__img-item">Name<img src="/assets/imgs/img-theband.jpg" alt="Ảnh tượng trưng"></li>
                <li class="the-band__img-item">Name<img src="/assets/imgs/img-theband.jpg" alt="Ảnh tượng trưng"></li>
                <li class="the-band__img-item">Name<img src="/assets/imgs/img-theband.jpg" alt="Ảnh tượng trưng"></li>
            </ul>
        </div>
        <!-- Tour Dates -->
        <div class="tour-dates">
            <h2 class="tour-dates__heading">Tour Dates</h2>
            <h3 class="tour-dates__description">Remember to book your tickets!</h3>
            <ul class="tour-dates__sale-list">
                <li class="tour-dates__sale-item">
                    <span class="sale-item__month">September</span>
                    <div class="sale-item__sold-out">Sold out</div>
                </li>
                <li class="tour-dates__sale-item">
                    <span class="sale-item__month">October</span>
                    <div class="sale-item__sold-out">Sold out</div>
                </li>
                <li class="tour-dates__sale-item tour-dates__sale-item--on-sale">
                    <span class="sale-item__month">November</span>
                    <div class="sale-item__selling">3</div>
                </li>
            </ul>
            <ul class="tour-dates__tickets-list">
                <li class="tour-dates__tickets-item">
                    <img src="https://www.w3schools.com/w3images/newyork.jpg" alt="" class="tickets-item__img">
                    <div class="tickets-item__information">
                        <h3 class="tickets-item__name">New York</h3>
                        <h3 class="tickets-item__schedule">Fri 27 Nov 2016</h3>
                        <h4 class="tickets-item__description">Praesent tincidunt sed tellus ut rutrum sed vitae justo.</h4>
                    </div>
                    <button class="btn tickets-item__button">Buy Tickets</button>
                </li>
                <li class="tour-dates__tickets-item">
                    <img src="https://www.w3schools.com/w3images/paris.jpg" alt="" class="tickets-item__img">
                    <div class="tickets-item__information">
                        <h3 class="tickets-item__name">Paris</h3>
                        <h3 class="tickets-item__schedule">Sat 28 Nov 2016</h3>
                        <h4 class="tickets-item__description">Praesent tincidunt sed tellus ut rutrum sed vitae justo.</h4>
                    </div>
                    <button class="btn tickets-item__button">Buy Tickets</button>
                </li>
                <li class="tour-dates__tickets-item">
                    <img src="https://www.w3schools.com/w3images/sanfran.jpg" alt="" class="tickets-item__img">
                    <div class="tickets-item__information">
                        <h3 class="tickets-item__name">San Francisco</h3>
                        <h3 class="tickets-item__schedule">Sun 29 Nov 2016</h3>
                        <h4 class="tickets-item__description">Praesent tincidunt sed tellus ut rutrum sed vitae justo.</h4>
                    </div>
                    <button class="btn tickets-item__button">Buy Tickets</button>
                </li>
            </ul>
        </div>
        <div class="contact">
            <h2 class="contact__heading">contact</h2>
            <h3 class="contact__description">Fan? Drop a note!</h3>
            <div class="contact__information">
                <ul class="contact__information-company-list">
                    <li class="contact__information-company-item">
                        <i class="contact__information-company-icon fa-solid fa-location-dot"></i>
                        <span>Chicago, US</span> 
                    </li>
                    <li class="contact__information-company-item">
                        <i class="contact__information-company-icon fa-solid fa-phone"></i>
                        <span>Phone: +00 151515</span>
                    </li>
                    <li class="contact__information-company-item">
                        <i class="contact__information-company-icon fa-solid fa-envelope"></i>
                        <span>Email: mail@mail.com</span> 
                    </li>
                </ul>
                <div class="contact__information-customer-list">
                    <div class="contact__information-customer-item--up">
                        <input type="text" class="contact__information-customer-name" placeholder="Name">
                    <input type="text" class="contact__information-customer-email" placeholder="Email">
                    </div>
                    <input type="text" class="contact__information-customer-message" placeholder="Message"> 
                    <div><button class="btn contact__send-button">send</button></div>
                </div>
            </div> 
           
        </div>
        <!-- Map -->
        <div class="footer">
            <div class="footer__map"><img src="https://www.w3schools.com/w3images/map.jpg" alt=""></div>
            <div class="footer__icon">
                <div class="footer__icon-item footer__icon-facebook"><i class="footer__icon-facebook-text fa-brands fa-facebook-f"></i></div>
                <i class="footer__icon-item fa-brands fa-instagram"></i>
                <div class="footer__icon-item footer__icon-snapchat"><i class="footer__icon-snapchat-text fa-brands fa-snapchat"></i></div>
                <i class="footer__icon-item fa-brands fa-pinterest-p"></i>
                <i class="footer__icon-item fa-brands fa-twitter"></i>
                <i class="footer__icon-item fa-brands fa-linkedin-in"></i>
            </div>
            <div class="footer__text">
                Powered by 
                <a href="https://www.w3schools.com/w3css/default.asp">w3.css</a>
            </div>
        </div>
    </div>
</body>
</html>