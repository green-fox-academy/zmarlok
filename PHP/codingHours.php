<html>
<body>
<?php

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52


$dailyHours = 6;
$weeks = 17;
$overallHours = $dailyHours * $weeks * 5;

$percentage = $overallHours / ($weeks*52) * 100;

echo "Overall coding hours are: $overallHours hours <br>";
echo "The percentage of the coding hours are: $percentage %";

?>
</body>
</html>
