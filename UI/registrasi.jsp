<%-- 
    Document   : registrasi
    Created on : Aug 30, 2019, 11:57:14 PM
    Author     : HP
--%>

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>INSPINIA | Login 2</title>

    <link href="../asset/css/bootstrap.min.css" rel="stylesheet">
    <link href="../asset/font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="../asset/css/animate.css" rel="stylesheet">
    <link href="../asset/css/style.css" rel="stylesheet">
    <style>
        .tooltipx {
          position: relative;
          display: inline-block;
          border-bottom: 1px dotted black;
        }

        .tooltipx .tooltiptext {
          visibility: hidden;
          width: 120px;
          background-color: #555;
          color: #fff;
          text-align: center;
          border-radius: 6px;
          padding: 5px 0;
          position: absolute;
          z-index: 1;
          bottom: 125%;
          left: 50%;
          margin-left: -60px;
          opacity: 0;
          transition: opacity 0.3s;
        }

        .tooltipx .tooltiptext::after {
          content: "";
          position: absolute;
          top: 100%;
          left: 50%;
          margin-left: -5px;
          border-width: 5px;
          border-style: solid;
          border-color: #555 transparent transparent transparent;
        }

        .tooltipx:hover .tooltiptext {
          visibility: visible;
          opacity: 1;
        }
        .btn-primary{
            background-color: #801dc5;
            border-color: #801dc5;
        }
         .footer{
            background-color: #801dc5;
            border-color: #801dc5;
        }
    </style>
</head>

<body class="gray-bg">

    <div class="loginColumns animated fadeInDown">
        <div class="row">

            <div class="col-md-6">
                <h2 class="font-bold">Welcome to Form Registrasi</h2>

                <p>
                    Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.
                </p>

                <p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.
                </p>

                <p>
                    When an unknown printer took a galley of type and scrambled it to make a type specimen book.
                </p>

                <p>
                    <small>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</small>
                </p>

            </div>
            <div class="col-md-6">
                <div class="ibox-content">
                    <form class="m-t" id="target">
                        <div class="form-group tooltipx tt" title="This is a tooltip.">
                            <input type="number" class="form-control hs" id="mblnmb" placeholder="Mobile Number" required=""><span class="tooltiptext">Please Enter Valid Indonesia Phone Number</span>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control hs" id="firstname" placeholder="First Name" required="">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control hs" id="lastname" placeholder="Last Name" required="">
                        </div>
                        <div>
                            <table>
                                <tr>
                                    <td><select class="form-control hs" id="mnthbirth" placeholder="Month Birth"><option>Month Birth</option></select></td>
                                    <td><select class="form-control hs" id="datebirth" placeholder="Date Birth"><option>Date Birth</option></select></td>
                                    <td><select class="form-control hs" id="yearbirth" placeholder="Year Birth"><option>Year Birth</option></select></td>
                                </tr>
                            </table>
                        </div><br>
                        <div>
                            <table>
                                <tr>
                                    <td><input class="hs" type="radio" name="gender" value="1"> Male</td>
                                    <td><input class="hs" type="radio" name="gender" value="2"> Female</td>
                                </tr>
                            </table>
                        </div><br>
                        <div class="form-group">
                            <input type="email" class="form-control hs" id="email" placeholder="Email" required="">
                        </div>
<!--                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password" required="">
                        </div>-->
                        <button type="submit" class="btn btn-primary block full-width m-b hs" id="btnsbt">Register</button>
                        <button type="submit" class="btn btn-primary full-width m-b" id="btnlgn">Login</button>
<!--                        <a href="#">
                            <small>Forgot password?</small>
                        </a>

                        <p class="text-muted text-center">
                            <small>Do not have an account?</small>
                        </p>
                        <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>-->
                    </form>
                </div>
            </div>
        </div>
        <hr/>
        <div class="row footer">
            <div class="col-md-6">
                Copyright Example Company
            </div>
            <div class="col-md-6 text-right">
               <small>© 2014-2015</small>
            </div>
        </div>
    </div>
    <script src="../asset/js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="../svrjs/loginjs/registrasi.js"></script>
</body>

</html>

