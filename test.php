<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="test.php" method="post">
        <label>quantity:</label><br>
        <input type ="text" name = " quantity">
        <input type = "submit" value = " Total">

</form>
    
</body>
</html>

<?php
$item = "pizza";
$price = 5.99;
$quantity =$_POST["quantity"]; 
echo $quantity;

function calculateSum($num1, $num2) {
  return $num1 + $num2;
}
$sum = calculateSum(5, 10);
echo "Suma este " . $sum . "<br>";

$numbers = array(1, 2, 3, 4, 5);

foreach ($numbers as $number) {
  echo "Adding " . $number . " to the sum: ";
  $sum = calculateSum($sum, $number);
  echo $sum . "<br>";
}
$fruits = array("apple" => 1.99, "banana" => 0.99, "cherry" => 3.49);

foreach ($fruits as $fruit => $price) {
  echo "Pretul  " . $fruit . " este $" . $price . "<br>";
}

if ($sum > 20) {
  echo "> 20.<br>";
} else {
  echo "<= 20.<br>";
}

switch ($sum) {
  case ($sum < 10):
    echo "<10 10.<br>";
    break;
  case ($sum >= 10 && $sum <= 20):
    echo "Intre 10  20.<br>";
    break;
  default:
    echo ">2020.<br>";
    break;
}

define("PI", 3.14159);

$circleArea = PI * ($numbers[2] ** 2);
echo "Aria unui cerc" . $numbers[2] . " is: " . $circleArea;

?>