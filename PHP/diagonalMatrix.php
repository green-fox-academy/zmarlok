<html>
<body>
<?php

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
$arr = array();

for ($i = 0; $i < 4; $i++){
    for ($j = 0; $j < 4; $j++){
        if ($i==$j){
            $arr[$i][$j] = 1;
        } else {
            $arr[$i][$j] = 0;
        }
        echo $arr[$i][$j] . " ";
    }
    echo "<br>";
}

?>
</body>
</html>

