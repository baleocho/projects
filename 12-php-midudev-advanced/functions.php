<?php 
//declare(strict_types=1);

    function get_data(string $url): array {
        $response = file_get_contents($url);
        $data = json_decode($response, true);
        return $data;
    }

    function get_until_message(int $days): string{
        return match(true){
            $days < 0 => "The movie has already been released",
            $days === 0 => "The movie is released today",
            $days === 1 => "The movie is released tomorrow",
            default => "The movie is released in {$days} days"
        };
    }

    function render_template(string $template, array $data = []){
        extract($data);
        require "templates/$template.php";
    }
?>