
<?php 
    const API_URL = "https://whenisthenextmcufilm.com/api";
    $ch = curl_init(API_URL);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    $response = curl_exec($ch);
    $data = json_decode($response, true);
    curl_close($ch);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movies Marvel PHP</title>
    <link
        rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.classless.min.css"
    />
</head>
<body>
    <main>
        <h2>API Result</h2>
        <pre style="font-size: 10px; overflow-y: scroll; height: 300px;">
            <?php
                var_dump($data);
            ?>
        </pre>
        <hr style="width: 100%; height: 1px; background-color: white; border: none; margin: 50px 0;" />
        <section>
            <img
                src="<?= $data['poster_url'] ?>"
                alt="Marvel Movie"
                width="200"
                height="200"
                style="border-radius: 10px; margin: auto; display: block; margin-bottom: 15px;"
            />
            <hgroup style="text-align: center;">
                <h2>Next movie from Marvel: <?= $data['title'] ?></h2>
                <p>Release date: <?= $data['release_date'] ?></p>
                <p>Days left: <?= $data['days_until']?></p>
            </hgroup>
        </section>
        <hr style="width: 100%; height: 1px; background-color: white; border: none; margin: 50px 0;" />
    </main>
</body>
</html>