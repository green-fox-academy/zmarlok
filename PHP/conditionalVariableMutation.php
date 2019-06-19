<html>
<body>

<?php
// if a is even increment out by one
$a = 24;
$out = 0;

if ($a%2==0){
    $out++;
}

echo "$out <br>";

// if b is between 10 and 20 set out2 to "Sweet!"
// if less than 10 set out2 to "Less!",
// if more than 20 set out2 to "More!"
$b = 13;
$out2 = "";

if ((10 < $b) && ($b < 20)){
    $out2 = "Sweet!";
} elseif ($b < 10) {
    $out2 = "Less!";
} else {
    $out2 = "More!";
}

echo "$out2 <br>";

// if credits are at least 50,
// and isBonus is false decrement c by 2
// if credits are smaller than 50,
// and isBonus is false decrement c by 1
// if isBonus is true c should remain the same
$c = 123;
$credits = 100;
$isBonus = false;

if (($credits >= 50) && (!$isBonus)) {
    $c = $c-2;
} elseif (($credits < 50) && (!$isBonus)) {
    $c--;
} elseif ($isBonus) {
    $c;
}

echo "$c <br>";

// if d is dividable by 4
// and time is not more than 200
// set out3 to "check"
// if time is more than 200
// set out3 to "Time out"
// otherwise set out3 to "Run Forest Run!"

$d = 8;
$time = 120;
$out3 = "";

if (($d%4==0) && ($time <= 200)){
    $out3 = "check";
} elseif ($time > 200) {
    $out3 = "Time out";
} else {
    $out3 = "Run Forest Run!";
}

echo "$out3 <br>";


?>
</body>
</html>
