<body>
    <main>
        <h2>API Result</h2>
        <pre style="font-size: 10px; overflow-y: scroll; height: 300px;">
            <?php
                var_dump($new_data);
            ?>
        </pre>
        <hr style="width: 100%; height: 1px; background-color: white; border: none; margin: 50px 0;" />
        <section>
            <img
                src="<?= $poster_url ?>"
                alt="Marvel Movie"
                width="200"
                height="200"
                style="border-radius: 10px; margin: auto; display: block; margin-bottom: 15px;"
            />
            <hgroup style="text-align: center;">
                <h2>Next movie from Marvel: <?= $title ?></h2>
                <p>Release date: <?= $release_date ?></p>
                <p>Days left: <?= $days_until?></p>
                <p><?= $until_message?></p>
            </hgroup>
        </section>
        <hr style="width: 100%; height: 1px; background-color: white; border: none; margin: 50px 0;" />
    </main>
</body>