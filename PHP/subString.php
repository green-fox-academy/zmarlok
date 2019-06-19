<html>
<body>

<?php

//  Create a function that takes two strings as a parameter
//  Returns the starting index where the second one is starting in the first one
//  Returns `-1` if the second string is not in the first one

function findSecondStringStartingIndex($str1, $str2)
{
    $pos = strpos($str1, $str2);
    if ($pos == false) {
        return -1;
    } else {
        return $pos;
    }
}

echo findSecondStringStartingIndex("nagyon finom az almalé", "alma");

?>
</body>
</html>

