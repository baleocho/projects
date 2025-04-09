<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My first php app</title>
</head>
<body>
<?php
    define('LOGO_URL', 'https://upload.wikimedia.org/wikipedia/commons/2/27/PHP-logo.svg');
    const NOMBRE_CONST = 'Alex Constant';
    $myName = "Alex";
    $isDeveloper = true;
    $myAge = 27;
    $newAge = $myAge + '1';
    $newAgeString = $myAge . 1;
    $interpolation = "Hello my name is \"\$myName\" and my age is $myAge";
?>
<img src="<?=LOGO_URL?>" alt="PHP Logo" width="200" height="200">
<h1><?="Hola Mundo"?></h1>    
<h2>My name is: <?=$myName?></h2>
<h2>My age is: <?=$myAge?></h2>
<h2>My new age is: <?=$newAge?></h2>
<h2>My new age (String) is: <?=$newAgeString?></h2>
<hr />
<h2>The type of myName is (var_dump): <?=var_dump($myName)?></h2>
<h2>The type of myName is (gettype): <?=gettype($myName)?></h2>
<h2>The type of myName is (is_string): <?=is_string($myName)?></h2>
<h2>The type of myName is (is_bool): <?=is_bool($myName)?></h2>
<h2>Force convert to bool ((bool)): <?=(bool)$myName?></h2>
<hr />
<h2>Interpoling: <?=$interpolation?></h2>
<hr />
<h2>Constant: <?=NOMBRE_CONST?></h2>
<h2>Global Constant: <?=LOGO_URL?></h2>
<hr />
<h2>Using if in age var: <?php
if($myAge > 18) {
    echo "<span style=\"color:white;\">You are an adult</span>";
} else {
    echo "<strong>You are a minor</strong>";
}
?></h2>
<h2>Using if template type in age var: 
    <?php if($myAge > 18) : ?>
        <span style="color:white;">You are an adult</span>
    <?php elseif($myAge == 18) : ?>
        <span style="color:white;">You are an ....</span>
    <?php else : ?>
        <span style="color:white;">You are a minor</span>
    <?php endif; ?>
</h2>
<h2>Using ternaria: <?= $myAge > 18 ? '<span style="color:white;">You are an adult</span>' : '<span style="color:white;">You are a minor</span>';?></h2>
<h2>Using match (Match returns a value): <?= match($myAge) {
    18 => '<span style="color:white;">You are an adult</span>',
    17 => '<span style="color:white;">You are a minor</span>',
    default => '<span style="color:white;">You are default</span>'
}; ?></h2>
<h2>Using match with an expression (Match returns a value): <?= match(true) {
    $myAge >= 18 => '<span style="color:white;">You are an adult</span>',
    $myAge < 17 => '<span style="color:white;">You are a minor</span>',
    default => '<span style="color:white;">You are default</span>'
}; ?></h2>

<hr />
<?php 
    $bestLenguages = ['PHP', 'JavaScript'];
    $bestLenguages[] = 'C++'; // Add to the end of the array
?>

<h2>Best lenguages (foreach): </h2>
<ul>
    <?php foreach($bestLenguages as $lenguage) : ?>
        <li><?=$lenguage?></li>
    <?php endforeach; ?>
</ul>

<h2>Best lenguages (with for): </h2>
<ul>
    <?php for($i = 0; $i < count($bestLenguages); $i++) : ?>
        <li><?=$bestLenguages[$i]?></li>
    <?php endfor; ?>
</ul>

<h2>Best lenguages (with while): </h2>
<ul>
    <?php $i = 0; ?>
    <?php while($i < count($bestLenguages)) : ?>
        <li><?=$bestLenguages[$i]?></li>
        <?php $i++; ?>
    <?php endwhile; ?>
</ul>

<h2>Best lenguages (with do while): </h2>
<ul>
    <?php $i = 0; ?>
    <?php do { ?>
        <li><?=$bestLenguages[$i]?></li>
        <?php $i++; ?>
    <?php } while($i < count($bestLenguages)); ?>
</ul>

<?php
    $person = [
        'name' => 'Alex',
        'age' => 27,
        'isDeveloper' => true,
        'bestLenguages' => ['PHP', 'JavaScript']
    ];
?>
<hr />
<h2>Person (foreach): </h2>
<ul>
    <?php foreach($person as $key => $value) : ?>
        <li><?=$key?>: 
            <?php if(is_array($value)) : ?>
                <ul>
                    <?php foreach($value as $v) : ?>
                        <li><?=$v?></li>
                    <?php endforeach; ?>
                </ul>
            <?php else : ?>
                <?=$value?>
            <?php endif; ?>
        </li>
    <?php endforeach; ?>
</ul>


<style>
    :root {
        color-scheme: light dark;
    }
    body {
        display: flex;
        flex-flow: column nowrap;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        padding-bottom: 150px;
    }
    h2 {
        margin: 2px;
        color: #666;
        font-size: 1rem;
    }
    hr {
        width: 300px;
        height: 1px;
        background-color: #ccc;
        border: none;
    }
    ul {
        margin: 0;
        padding: 0;
    }
    li {
        margin: 2px;
        color: #666;
        font-size: 1rem;
    }
</style>
</body>
</html>