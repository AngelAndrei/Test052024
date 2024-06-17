<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <br>
    <form action = " intex.php" method="post" >
    <label>Username:</label><br>
    <input type ="text" name="username"><br>
    <label>Password:</label><br>
    <input type ="password" name="password"><br>
    <input type="submit" value ="Log in">
    </form>

</body>
</html>



<?php
echo"Iubesc pizza<br>";
echo "/n as \nd<br>";
//comentariu
$name = "Angel";
$food ="Pizza";
$email ="Fake@email.com";
$age = 21;
$users =2;
$quantity =3;
$pret = 1.5;
$angajat=true;//1 daca e true,nimic daca e false

$total = $quantity*$pret;

echo"Status:{$angajat}";
echo "Salut,{$name},stiu ca ai {$age} de ani<br>";
echo "Stiu ca iti place {$food}<br>";
echo "Emailul tau va fi: {$email}<br>";
echo "Sunt {$users} persoane online<br>";
echo "Doresti sa cumperi {$quantity} la un pret de \${$total }?<br>";


/*
$x = 10;
$y=2;
$z=null;
//$z = $x+$y
//$z = $x-$y
//$z = $x*$y
//$z = $x/$y
//$z = $x**$y
//$z = $x%$y
echo$z;

*/

//get post







?>




