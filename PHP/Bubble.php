<html>
<body>
<?php

 //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
   // System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
  //  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//  should print [34, 24, 12, 9, 5]

function ascendingSort($arr){
    sort($arr);
    var_dump($arr);
}

ascendingSort([2, 5, 3, 4, 8, 12]);

function descendingSort($arr2){
    rsort($arr2);
        var_dump($arr2);
}

descendingSort([1, 2, 3, 4, 5, 6]);

?>
</body>
</html>

