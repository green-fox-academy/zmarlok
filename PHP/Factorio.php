<html>
<body>
<?php

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

function factorio($number){
    $factorio = 1;
    for ($i = 0; $i< $number; $i++){
        $factorio += $factorio*$i;
    }
    echo $factorio;
}

factorio(4);


?>
</body>
</html>
